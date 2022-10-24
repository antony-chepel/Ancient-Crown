package com.wb.goog.inj.ancientcrowmnblakc

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AppClassCrown : Application() {
    companion object {
        const val JDJQWIDIQWIDQIWDIQ = "WUF7zDnU9CkoEHqYn9hAXB"
        const val jxnchhchqwqdwdqw = "admin"
        const val YDUWQDQW8DQWD = "5ee04f01-9a65-4c28-adb1-b1042679e6ad"

        val uyduqwuduqwd = "http://ancientcrown"
        val jchcuwquicuqwd = ".xyz/go.php?to=1&"
        val idowqodoqw = "http://ancientcrown"
        val trdqwtdtqwdqw = ".xyz/apps.txt"


        val bchwhqdhqwd = "sub_id_1="

        var GDGWQYDUQDIQIDIQW: String? = ""
        var DIWQODOQWODOQWDOQW: String? = "c11"
        var UDIQWODOPQWPDPQWDP: String? = "d11"
        var YUDUQWUDUUQWUD: String? = "check"

    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            applyDeviceId(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(YDUWQDQW8DQWD)
        Hawk.init(this).build()
    }

    private suspend fun applyDeviceId(context: Context) {
        val advertisingInfo = Adv(context)
        val idInfo = advertisingInfo.getAdvertisingId()
        Hawk.put(GDGWQYDUQDIQIDIQW, idInfo)
    }

}

class Adv (context: Context) {
    private val adInfo = AdvertisingIdClient(context.applicationContext)

    suspend fun getAdvertisingId(): String =
        withContext(Dispatchers.IO) {
            adInfo.start()
            val adIdInfo = adInfo.info
            Log.d("getAdvertisingId = ", adIdInfo.id.toString())
            adIdInfo.id
        }
}