package com.example.hiltdependency.data.source.remote

import com.example.hiltdependency.data.Analytics
import com.example.hiltdependency.data.source.AnalyticsDataSource
import javax.inject.Inject

class AnalyticsRemoteDataSource @Inject constructor(): AnalyticsDataSource {
    override fun getAnalytics(): Analytics {
        return Analytics(
            title = "Remote Data Source",
            description = "Remote Description",
            isComplete = false
        )
    }
}