package com.frogobox.research.ui.main

import android.os.Bundle
import android.util.Log
import com.frogobox.research.core.BaseBindActivity
import com.frogobox.research.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseBindActivity<ActivityMainBinding>() {

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }

    @Inject
    lateinit var viewModel: MainViewModel

    override fun initBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            // Call View Model Here
            viewModel.setup()
            Log.d(TAG, "View Model : ${viewModel::class.java.simpleName}")
        }
        // TODO : Add your code here

    }

    override fun initView() {
        super.initView()
        binding.apply {

        }
    }

    override fun initObserver() {
        super.initObserver()
        viewModel.apply {

        }
    }

}