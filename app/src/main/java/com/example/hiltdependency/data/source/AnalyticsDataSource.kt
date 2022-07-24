package com.example.hiltdependency.data.source

import com.example.hiltdependency.data.Analytics

interface AnalyticsDataSource {
    fun getAnalytics(): Analytics
}