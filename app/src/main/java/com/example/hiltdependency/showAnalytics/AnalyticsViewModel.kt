package com.example.hiltdependency.showAnalytics

import androidx.lifecycle.ViewModel
import com.example.hiltdependency.data.Analytics
import com.example.hiltdependency.data.source.AnalyticsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnalyticsViewModel @Inject constructor(private val analyticsRepository: AnalyticsRepository) :
    ViewModel() {

    fun getAnalyticsFromLocalDataSource(): Analytics =
        analyticsRepository.getAnalyticsFromLocalSource()

    fun getAnalyticsFromRemoteDataSource(): Analytics =
        analyticsRepository.getAnalyticsFromRemoteSource()
}