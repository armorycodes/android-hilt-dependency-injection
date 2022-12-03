package com.frogobox.research.data

import android.content.Context
import android.content.SharedPreferences
import com.frogobox.research.ext.showLogDebug
import com.frogobox.research.util.Constant.PREF_NAME
import dagger.hilt.android.qualifiers.ApplicationContext
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

class AppPreferenceImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : AppPreference {

    companion object {
        val TAG: String = AppPreferenceImpl::class.java.simpleName
    }

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    private val prefEditor: SharedPreferences.Editor = sharedPreferences.edit()

    override fun savePrefFloat(key: String, value: Float) {
        showLogDebug("$TAG : savePrefFloat -> key   : $key")
        showLogDebug("$TAG : savePrefFloat -> value : $value")
        prefEditor.putFloat(key, value).apply()
    }

    override fun savePrefInt(key: String, value: Int) {
        showLogDebug("$TAG : savePrefInt -> key   : $key")
        showLogDebug("$TAG : savePrefInt -> value : $value")
        prefEditor.putInt(key, value).apply()
    }

    override fun savePrefString(key: String, value: String) {
        showLogDebug("$TAG : savePrefString -> key   : $key")
        showLogDebug("$TAG : savePrefString -> value : $value")
        prefEditor.putString(key, value).apply()
    }

    override fun savePrefBoolean(key: String, value: Boolean) {
        showLogDebug("$TAG : savePrefBoolean -> key   : $key")
        showLogDebug("$TAG : savePrefBoolean -> value : $value")
        prefEditor.putBoolean(key, value).apply()
    }

    override fun savePrefLong(key: String, value: Long) {
        showLogDebug("$TAG : savePrefLong -> key   : $key")
        showLogDebug("$TAG : savePrefLong -> value : $value")
        prefEditor.putLong(key, value).apply()
    }

    override fun deletePref(key: String) {
        showLogDebug("$TAG : deletePref -> key : $key")
        prefEditor.remove(key).apply()
    }

    override fun nukePref() {
        showLogDebug("$TAG : nukePref")
        prefEditor.clear().apply()
    }

    override fun loadPrefFloat(key: String): Float {
        showLogDebug("$TAG : loadPrefFloat -> key   : $key")
        showLogDebug("$TAG : loadPrefFloat -> value : ${sharedPreferences.getFloat(key, 0f)}")
        return sharedPreferences.getFloat(key, 0f)
    }

    override fun loadPrefString(key: String): String {
        showLogDebug("$TAG : loadPrefString -> key   : $key")
        showLogDebug("$TAG : loadPrefString -> value : ${sharedPreferences.getString(key, "")}")
        return sharedPreferences.getString(key, "")!!
    }

    override fun loadPrefInt(key: String): Int {
        showLogDebug("$TAG : loadPrefInt -> key   : $key")
        showLogDebug("$TAG : loadPrefInt -> value : ${sharedPreferences.getInt(key, 0)}")
        return sharedPreferences.getInt(key, 0)
    }

    override fun loadPrefLong(key: String): Long {
        showLogDebug("$TAG : loadPrefLong -> key   : $key")
        showLogDebug("$TAG : loadPrefLong -> value : ${sharedPreferences.getLong(key, 0)}")
        return sharedPreferences.getLong(key, 0)
    }

    override fun loadPrefBoolean(key: String): Boolean {
        showLogDebug("$TAG : loadPrefBoolean -> key   : $key")
        showLogDebug("$TAG : loadPrefBoolean -> value : ${sharedPreferences.getBoolean(key, false)}")
        return sharedPreferences.getBoolean(key, false)
    }

}