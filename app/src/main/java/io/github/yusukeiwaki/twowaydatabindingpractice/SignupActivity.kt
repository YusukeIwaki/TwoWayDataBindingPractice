package io.github.yusukeiwaki.twowaydatabindingpractice

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.yusukeiwaki.twowaydatabindingpractice.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var viewModel: SignupActivityiewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        viewModel = SignupActivityiewModel()
        binding.setViewModel(viewModel)
    }
}
