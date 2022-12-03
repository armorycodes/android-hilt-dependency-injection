package com.frogobox.research.ui.detail

import com.frogobox.research.core.BaseViewModel
import com.frogobox.research.data.AppPreference
import dagger.hilt.android.lifecycle.HiltViewModel
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

class DetailViewModel @Inject constructor(
    private val appPreference: AppPreference
) : BaseViewModel() {

    override fun setup() {

    }
}