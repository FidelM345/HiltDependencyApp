package com.example.hiltdependency.showAnalytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

import com.example.hiltdependency.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/*
*  Hilt supports the following Android Classes:
*
    Application (by using @HiltAndroidApp)
    ViewModel (by using @HiltViewModel)
    Activity
    Fragment
    View
    Service
    BroadcastReceiver
*/

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val analyticsViewModel: AnalyticsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}