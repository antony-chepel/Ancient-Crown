package com.wb.goog.inj.ancientcrowmnblakc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.wb.goog.inj.R
import com.wb.goog.inj.ancientcrowmnblakc.AppClassCrown.Companion.jxnchhchqwqdwdqw
import com.wb.goog.inj.nacientblackwhite.MainCrownScreen
import kotlinx.coroutines.*

class FilterCrownNow : AppCompatActivity() {
    lateinit var ywqidkwkqdkwq: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_me_now)
        ywqidkwkqdkwq = ""
        val asyncJs = AsyncJs(applicationContext)

        val job = GlobalScope.launch(Dispatchers.IO) {
            ywqidkwkqdkwq = asyncJs.coTask()
        }

        runBlocking {
            job.join()
            Log.d("jsoup status", ywqidkwkqdkwq)
            if (ywqidkwkqdkwq == jxnchhchqwqdwdqw) {
                Intent(applicationContext, MainCrownScreen::class.java).also { startActivity(it) }
            } else {
                Intent(applicationContext, CrownWeb::class.java).also { startActivity(it) }
            }
            finish()
        }
    }
}