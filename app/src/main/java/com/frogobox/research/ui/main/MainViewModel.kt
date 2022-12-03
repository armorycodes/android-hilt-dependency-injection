package com.frogobox.research.ui.main

import android.util.Log
import com.frogobox.research.core.BaseViewModel
import com.frogobox.research.data.AppPreference
import javax.inject.Inject

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class MainViewModel @Inject constructor(
    private val appPreference: AppPreference
) : BaseViewModel() {

    override fun setup() {
        Log.d("AppPreference", appPreference.getTag())
    }
}