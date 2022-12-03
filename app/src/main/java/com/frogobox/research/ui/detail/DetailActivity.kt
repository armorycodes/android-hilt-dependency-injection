package com.frogobox.research.ui.detail

import android.os.Bundle
import android.util.Log
import com.frogobox.research.core.BaseBindActivity
import com.frogobox.research.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity : BaseBindActivity<ActivityDetailBinding>() {

    companion object {
        private val TAG: String = DetailActivity::class.java.simpleName
    }

    @Inject
    lateinit var viewModel: DetailViewModel

    override fun initBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            // Call View Model Here
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