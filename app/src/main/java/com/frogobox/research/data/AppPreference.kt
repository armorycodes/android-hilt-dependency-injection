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

    fun savePrefFloat(key: String, value: Float)

    fun savePrefInt(key: String, value: Int)

    fun savePrefString(key: String, value: String)

    fun savePrefBoolean(key: String, value: Boolean)

    fun savePrefLong(key: String, value: Long)

    fun deletePref(key: String)

    fun nukePref()

    fun loadPrefFloat(key: String): Float

    fun loadPrefString(key: String): String

    fun loadPrefInt(key: String): Int

    fun loadPrefLong(key: String): Long

    fun loadPrefBoolean(key: String): Boolean

}