package com.lakbay.rewards

import android.app.Application
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.lakbay.rewards.analytics.FirebaseAnalyticsHelper

class RewardsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseAnalyticsHelper.setAnalytics(Firebase.analytics)
    }
}