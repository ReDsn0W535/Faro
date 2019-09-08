package com.example.faro.view.fragment

import android.os.Bundle
import android.util.Log
import com.example.faro.view.BaseFragment
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import javax.inject.Inject

class GoogleCardsFragment : BaseFragment(), OnMapReadyCallback{
    @Inject
    lateinit var map : GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("XUI","PIZDA")
    }

    override fun onMapReady(p0: GoogleMap?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}