package com.example.bonusapp

import android.app.Application

class BonusApp : Application() {

    override fun onCreate() {
        super.onCreate()
        ReminderRepository.initialize(this)
    }
}