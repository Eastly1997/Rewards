package com.lakbay.rewards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lakbay.rewards.analytics.FirebaseAnalyticsHelper
import com.lakbay.rewards.ui.theme.RewardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        FirebaseAnalyticsHelper.sendCustomAnalytics()
        setContent {
            RewardsTheme {

            }
        }
    }
}


