package com.example.hiltdependency.data.source

import com.example.hiltdependency.data.Analytics
import com.example.hiltdependency.di.LocalDataSource
import com.example.hiltdependency.di.RemoteDataSource
import javax.inject.Inject

class AnalyticsRepositoryImp @Inject constructor(
    @LocalDataSource private val localAnalyticsDataSource: AnalyticsDataSource,
    @RemoteDataSource private val remoteAnalyticsDataSource: AnalyticsDataSource
) : AnalyticsRepository {
    override fun getAnalyticsFromLocalSource(): Analytics {
        return localAnalyticsDataSource.getAnalytics()
    }

    override fun getAnalyticsFromRemoteSource(): Analytics {
        return remoteAnalyticsDataSource.getAnalytics()
    }
}