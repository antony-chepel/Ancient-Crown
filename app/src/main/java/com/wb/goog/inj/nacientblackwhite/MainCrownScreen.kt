package com.wb.goog.inj.nacientblackwhite

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.wb.goog.inj.R
import com.wb.goog.inj.databinding.ActivityMainCrownScreenBinding
import java.util.*
import kotlin.collections.ArrayList

class MainCrownScreen : AppCompatActivity() {
        private lateinit var gxgvxcbsbacasj: ActivityMainCrownScreenBinding

    var shdwhqduqwuidiqwid: Int = 0

    var gsdgywqudqwid = ArrayList<ImageView>()

    var sggdfwtqywdquwud: Handler = Handler(Looper.getMainLooper())

    var sggsdgtwqdiwodoqwd: Runnable = Runnable { }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gxgvxcbsbacasj = ActivityMainCrownScreenBinding.inflate(layoutInflater)
        setContentView(gxgvxcbsbacasj.root)

        gxgvxcbsbacasj.idowqodowqo.text = "0"

        shdwhqduqwuidiqwid = 0

        gxgvxcbsbacasj.tstdywqydyu.setOnClickListener {
            gsdhuwqudwiqwidiq()
        }
        gxgvxcbsbacasj.odwpqpdoqwdo.setOnClickListener {
            gsdhuwqudwiqwidiq()
        }
        gxgvxcbsbacasj.sggdywquud.setOnClickListener {
            gsdhuwqudwiqwidiq()
        }
        gxgvxcbsbacasj.odwpdqodoqwodjh.setOnClickListener {
            gsdhuwqudwiqwidiq()
        }

        gxgvxcbsbacasj.gsgdtywyqdu.setOnClickListener {
            gsdhuwqudwiqwidiq()
        }
        gsdgywqudqwid = arrayListOf(
            gxgvxcbsbacasj.tstdywqydyu,
            gxgvxcbsbacasj.odwpqpdoqwdo,
            gxgvxcbsbacasj.odwpdqodoqwodjh,
            gxgvxcbsbacasj.gsgdtywyqdu,
            gxgvxcbsbacasj.sggdywquud,
            gxgvxcbsbacasj.udiwqdo,

        )

        tstdtqwre()

        tsyduwquidiqwdiqwi()
    }

    private fun tstdtqwre() {
        sggsdgtwqdiwodoqwd = Runnable {
            for (image in gsdgywqudqwid) {
                image.visibility = View.INVISIBLE
            }
            val random = Random()
            val index = random.nextInt(5 - 0)
            gsdgywqudqwid[index].visibility = View.VISIBLE
            sggdfwtqywdquwud.postDelayed(sggsdgtwqdiwodoqwd, 500)
        }
        sggdfwtqywdquwud.post(sggsdgtwqdiwodoqwd)
    }


    @SuppressLint("SetTextI18n")
    fun gsdhuwqudwiqwidiq() {
        shdwhqduqwuidiqwid++
        gxgvxcbsbacasj.idowqodowqo.text = "Catched : $shdwhqduqwuidiqwid"
    }

    @SuppressLint("SetTextI18n")
    fun tsyduwquidiqwdiqwi() {
        shdwhqduqwuidiqwid = 0
        gxgvxcbsbacasj.idowqodowqo.text = "Catched : $shdwhqduqwuidiqwid"
        tstdtqwre()
        gxgvxcbsbacasj.hdshfhwe.text = "Time : " + 10000 / 1000

        for (image in gsdgywqudqwid) {
            image.visibility = View.INVISIBLE
        }

        object : CountDownTimer(10000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                gxgvxcbsbacasj.hdshfhwe.text = "Time's up!!!"
                sggdfwtqywdquwud.removeCallbacks(sggsdgtwqdiwodoqwd)

                val dialog = AlertDialog.Builder(this@MainCrownScreen).apply {
                    setCancelable(false)
                    setTitle(getString(R.string.app_name))
                    setMessage("Your score : $shdwhqduqwuidiqwid\nWould you like play again?")
                }
                dialog.setPositiveButton("Yes") { _, _ ->
                    tsyduwquidiqwdiqwi()
                }
                    .setNegativeButton("No") { _, _ ->
                        shdwhqduqwuidiqwid = 0
                        "Catched : $shdwhqduqwuidiqwid".apply { gxgvxcbsbacasj.idowqodowqo.text = this }
                        ("Time : " + "0").apply { gxgvxcbsbacasj.hdshfhwe.text = this }

                        for (image in gsdgywqudqwid) {
                            image.visibility = View.INVISIBLE
                        }
                        finish()
                    }

                val alert = dialog.create()
                alert.show()
            }

            @SuppressLint("SetTextI18n")
            override fun onTick(p0: Long) {
                gxgvxcbsbacasj.hdshfhwe.text = "Time : " + p0 / 1000
            }
        }.start()
    }
}