package com.frogobox.research.data

import javax.inject.Inject

/**
 * Created by Faisal Amir on 03/12/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class AppPreferenceImpl @Inject constructor() : AppPreference {

    override fun getTag(): String {
        return AppPreferenceImpl::class.java.simpleName
    }

}