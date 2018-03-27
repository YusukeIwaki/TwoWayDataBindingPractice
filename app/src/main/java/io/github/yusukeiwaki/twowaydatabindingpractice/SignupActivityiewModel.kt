package io.github.yusukeiwaki.twowaydatabindingpractice

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignupActivityiewModel : ViewModel() {
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val termOfUse = MutableLiveData<Boolean>()

    private fun isValid() =
            !username.value.isNullOrBlank() && !password.value.isNullOrBlank() && termOfUse.value == true

    val canSubmit = MediatorLiveData<Boolean>().also { result ->
        result.addSource(username) { result.value = isValid() }
        result.addSource(password) { result.value = isValid() }
        result.addSource(termOfUse) { result.value = isValid() }
    }
}
