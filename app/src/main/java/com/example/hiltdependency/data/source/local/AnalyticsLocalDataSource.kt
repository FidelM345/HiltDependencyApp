package com.example.hiltdependency.data.source.local

import com.example.hiltdependency.data.Analytics
import com.example.hiltdependency.data.source.AnalyticsDataSource
import javax.inject.Inject

class AnalyticsLocalDataSource @Inject constructor(): AnalyticsDataSource {
    override fun getAnalytics(): Analytics {
        return Analytics(
            title = "Local Data source",
            description = "Local Description",
            isComplete = true
        )
    }
}