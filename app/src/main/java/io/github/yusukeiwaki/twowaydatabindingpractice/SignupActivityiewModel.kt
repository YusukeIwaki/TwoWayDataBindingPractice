package io.github.yusukeiwaki.twowaydatabindingpractice

import android.databinding.BaseObservable
import android.databinding.Bindable

class SignupActivityiewModel : BaseObservable() {
    @Bindable
    var username: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.username)
            notifyPropertyChanged(BR.canSubmit)
        }

    @Bindable
    var password: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.password)
            notifyPropertyChanged(BR.canSubmit)
        }

    @Bindable
    var termOfUse: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.termOfUse)
            notifyPropertyChanged(BR.canSubmit)
        }

    private fun isValid() =
            !username.isNullOrBlank() && !password.isNullOrBlank() && termOfUse

    @get:Bindable
    val canSubmit: Boolean
        get() = isValid()
}
