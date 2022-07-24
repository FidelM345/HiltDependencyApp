package com.example.hiltdependency.data.source

import com.example.hiltdependency.data.Analytics

interface AnalyticsRepository {
    fun getAnalyticsFromLocalSource(): Analytics
    fun getAnalyticsFromRemoteSource(): Analytics
}