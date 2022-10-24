package com.wb.goog.inj.ancientcrowmnblakc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.YUDUQWUDUUQWUD
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.JDJQWIDIQWIDQIWDIQ
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.DIWQODOQWODOQWDOQW
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.UDIQWODOPQWPDPQWDP
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.idowqodoqw
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.trdqwtdtqwdqw
import com.wb.goog.inj.databinding.ActivityMainBinding
import com.wb.goog.inj.nacientblackwhite.MainCrownScreen
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var dkqwkdllslad: ActivityMainBinding

    var qwjdjqwdjqwj: String = "null"
    lateinit var dwnqndqwjdwqkdk: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dkqwkdllslad = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dkqwkdllslad.root)
        dwnqndqwjdwqkdk = ""

        sjadkkdnsadnnsdna(this)

        val prefs = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prefs.getBoolean("activity_exec", false)) {
//            toTestGrounds()
//            finish()

            when (Hawk.get<String>(YUDUQWUDUUQWUD)) {
                "2" -> {
                    wiqiodoqwkdksakd()
                }
                else -> {
                    ndjasdkaskdkasd()
                }
            }
        } else {
            val exec = prefs.edit()
            exec.putBoolean("activity_exec", true)
            exec.apply()

            val job = GlobalScope.launch(Dispatchers.IO) {
                qwjdjqwdjqwj = snadasmdmsadjasjd(idowqodoqw+trdqwtdtqwdqw)
            }
            runBlocking {
                try {
                    job.join()
                } catch (_: Exception){
                }
            }

            when (qwjdjqwdjqwj) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(JDJQWIDIQWIDQIWDIQ, conversionDataListener, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    twqyeuqjwejqwejsa(1500)
                }
                "2" -> {
                    wiqiodoqwkdksakd()

                }
                "0" -> {
                    ndjasdkaskdkasd()
                }
            }
        }
    }



    private suspend fun snadasmdmsadjasjd(link: String): String {
        val url = URL(link)
        val oneStr = "1"
        val twoStr = "2"
        val activeStrn = "0"
        val urlConnection = withContext(Dispatchers.IO) {
            url.openConnection()
        } as HttpURLConnection

        return try {
            when (val text = urlConnection.inputStream.bufferedReader().readText()) {
                "2" -> {
                    Hawk.put(YUDUQWUDUUQWUD, twoStr)
                    Log.d("jsoup status", text)
                    twoStr
                }
                "1" -> {
                    Log.d("jsoup status", text)
                    oneStr
                }
                else -> {
                    Log.d("jsoup status", "is null")
                    activeStrn
                }
            }
        } finally {
            urlConnection.disconnect()
        }

    }

    private fun twqyeuqjwejqwejsa(timeInterval: Long): Job {

        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val hawk1: String? = Hawk.get(DIWQODOQWODOQWDOQW)
                if (hawk1 != null) {
                    Log.d("TestInUIHawk", hawk1.toString())
                    ndjasdkaskdkasd()
                    break
                } else {
                    val hawk1: String? = Hawk.get(DIWQODOQWODOQWDOQW)
                    Log.d("TestInUIHawkNulled", hawk1.toString())
                    delay(timeInterval)
                }
            }
        }
    }



    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {

            val dataGotten = data?.get("campaign").toString()
            Hawk.put(DIWQODOQWODOQWDOQW, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private fun ndjasdkaskdkasd() {
        Intent(this, FilterCrownNow::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun wiqiodoqwkdksakd() {
        Intent(this, MainCrownScreen::class.java)
            .also { startActivity(it) }
        finish()
    }
    fun sjadkkdnsadnnsdna(context: Context) {

        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host
                Hawk.put(UDIQWODOPQWPDPQWDP,params.toString())
            }
        }
    }

}