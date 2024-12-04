package com.lakbay.rewards.analytics

import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent

class FirebaseAnalyticsHelper {

    companion object {
        private var analytics: FirebaseAnalytics? = null
        private const val TAG = "FirebaseAnalyticsHelper"

        fun setAnalytics(analytics: FirebaseAnalytics) {
            this.analytics = analytics
        }

        fun sendCustomAnalytics() {
            Log.d(TAG, "sendCustomAnalytics()")
            analytics?.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT) {
                param(FirebaseAnalytics.Param.ITEM_ID, "123")
                param(FirebaseAnalytics.Param.ITEM_NAME, "APP_START")
                param(FirebaseAnalytics.Param.CONTENT_TYPE, "text")
            }
        }
    }
}