package com.mmb.hackathon2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mmb.hackathon2019.data.repository.HackathonRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var hackathonRepository:HackathonRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
