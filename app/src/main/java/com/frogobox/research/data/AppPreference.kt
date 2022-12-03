package com.frogobox.research.data

import javax.inject.Singleton

/**
 * Created by Faisal Amir on 03/12/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

@Singleton
interface AppPreference {

    fun getTag(): String

}