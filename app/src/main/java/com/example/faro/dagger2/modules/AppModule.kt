package com.example.faro.dagger2.modules

import com.google.android.gms.maps.GoogleMap
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApiKey() = "API_KEY"

    @Provides
    @Singleton
    fun provideGoogleMap() : GoogleMap? = null

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder().build()
    }
}