package com.example.faro.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.faro.R
import com.example.faro.view.fragment.GoogleCardsFragment

class MainActivity : AppCompatActivity() {

    val mainFragment : BaseFragment = GoogleCardsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = this.supportFragmentManager
        val supportFragmentTransaction = fragmentManager.beginTransaction()

        supportFragmentTransaction.add(R.id.mainmenu_container, mainFragment)
        supportFragmentTransaction.commit()
    }
}
