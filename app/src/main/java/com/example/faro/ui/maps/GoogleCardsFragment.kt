package com.example.faro.view.fragment

import android.os.Bundle
import android.util.Log
import com.example.faro.view.BaseFragment
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import javax.inject.Inject

class GoogleCardsFragment : MapFragment(), OnMapReadyCallback{
    lateinit var map : GoogleMap

    override fun onMapReady(p0: GoogleMap?) {

    }
}