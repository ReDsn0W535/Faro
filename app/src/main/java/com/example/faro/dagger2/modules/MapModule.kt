package com.example.faro.dagger2.modules

import com.google.android.gms.maps.GoogleMap
import dagger.Module
import dagger.Provides

@Module
public class MapModule {
    @Provides
    fun provideGoogleMap() : GoogleMap?{
        return null
    }
}