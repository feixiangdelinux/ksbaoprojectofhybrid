package com.beiyan.ksbao

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/**
 * https://github.com/feixiangdelinux/ksbaoprojectofhybrid.git
 *
 *
 * ksbaoprojectofhybrid
 *
 *
 * com.beiyan.ksbao
 *
 * library
 *
 * com.czt.mp3recorder
 *
 * Aliyunplayerlibrary
 *
 * com.beiyan.aliyunplayer
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}