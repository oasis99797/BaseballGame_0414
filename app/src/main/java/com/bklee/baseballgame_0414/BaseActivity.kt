package com.bklee.baseballgame_0414

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.bklee.baseballgame_0414.adapters.ChatAdapter
import com.bklee.baseballgame_0414.datas.Chat

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}