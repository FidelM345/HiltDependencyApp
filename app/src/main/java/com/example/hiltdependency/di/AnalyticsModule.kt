package com.example.hiltdependency.di


import com.example.hiltdependency.data.source.AnalyticsDataSource
import com.example.hiltdependency.data.source.AnalyticsRepository
import com.example.hiltdependency.data.source.AnalyticsRepositoryImp
import com.example.hiltdependency.data.source.local.AnalyticsLocalDataSource
import com.example.hiltdependency.data.source.remote.AnalyticsRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

/*
    The  @Bind annotated function provides the following information to Hilt:
    The function return type tells Hilt what interface the function provides
     instances of.
    The function parameter tells Hilt which implementation to provide.
*/


    @Binds
    @Singleton
    abstract fun bindAnalyticsRepository(
        analyticsRepositoryImp: AnalyticsRepositoryImp
    ): AnalyticsRepository


    /*  @Provides
    // NB: In Kotlin, modules that only contain @Provides functions can be object classes.
    This way, providers get optimized and almost in-lined in generated code.

    mainly used when we do not own the classes that is the classes come from a third party library.

      fun provideAnalyticsService(
          // Potential dependencies of this type
      ): AnalyticsService {
          return Retrofit.Builder()
              .baseUrl("https://example.com")
              .build()
              .create(AnalyticsService::class.java)
      }

      The method performs the following tasks:

      The function return type tells Hilt what type the function provides instances of.
      The function parameters tell Hilt the dependencies of the corresponding type.
      The function body tells Hilt how to provide an instance of the corresponding type.
      Hilt executes the function body every time it needs to provide an instance of that type.

      */

}

@Qualifier
annotation class LocalDataSource

@Qualifier
annotation class RemoteDataSource


@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {


    @RemoteDataSource
    @Singleton
    @Binds
    abstract fun bindAnalyticsRemoteDataSource(
        analyticsRemoteDataSource: AnalyticsRemoteDataSource
    ): AnalyticsDataSource


    @LocalDataSource
    @Singleton
    @Binds
    abstract fun bindAnalyticsLocalDataSource(
        analyticsLocalDataSource: AnalyticsLocalDataSource
    ): AnalyticsDataSource


}