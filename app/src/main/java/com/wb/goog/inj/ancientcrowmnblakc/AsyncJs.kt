package com.wb.goog.inj.ancientcrowmnblakc

import android.content.Context
import android.util.Log
import com.orhanobut.hawk.Hawk
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.DIWQODOQWODOQWDOQW
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.UDIQWODOPQWPDPQWDP
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.bchwhqdhqwd
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.jchcuwquicuqwd
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.uyduqwuduqwd
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class AsyncJs (val context: Context) {
    private var jsoup: String = ""

    suspend fun coTask(): String {

        val nameParameter: String? = Hawk.get(DIWQODOQWODOQWDOQW)
        val appLinkParameter: String? = Hawk.get(UDIQWODOPQWPDPQWDP)


        val taskName = "${uyduqwuduqwd}${jchcuwquicuqwd}${bchwhqdhqwd}$nameParameter"
        val taskLink = "${uyduqwuduqwd}${jchcuwquicuqwd}${bchwhqdhqwd}$appLinkParameter"

        withContext(Dispatchers.IO) {
            //changed logical null to string null
            if (nameParameter != "null") {
                getDocSecretKey(taskName)
                Log.d("Check1C", taskName)
            } else {
                getDocSecretKey(taskLink)
                Log.d("Check1C", taskLink)
            }
        }
        return jsoup
    }

    private fun getDocSecretKey(link: String) {
            val text = Jsoup.connect(link).get().text()
            Log.d("Text from jsoup", text)
            jsoup = text
    }
}