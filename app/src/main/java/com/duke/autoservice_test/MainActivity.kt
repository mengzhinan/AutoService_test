package com.duke.autoservice_test

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.duke.libinterface.IBook

class MainActivity : AppCompatActivity() {

    private val TAG: String = "auto_service_test"
    private var show: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show = findViewById(R.id.show)

    }

    override fun onResume() {
        super.onResume()

        var str = "未获取到 Service"
        val list = ServiceLoaderHelper.loadServices(IBook::class.java)
        if (list?.size ?: 0 > 0) {
            str = ""
            for (i in list!!.indices) {
                val book = list[i] ?: continue
                str += "\n${book.getBookName()}"
            }
        }
        show?.text = str
        Log.e(TAG, "ser = $str")

    }

}
