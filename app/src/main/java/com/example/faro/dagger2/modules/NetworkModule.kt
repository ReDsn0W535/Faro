package com.example.faro.dagger2.modules

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
public class NetworkModule {

    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder().build()
    }
}