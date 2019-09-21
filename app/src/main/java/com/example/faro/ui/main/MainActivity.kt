package com.example.faro.view

import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.faro.R
import com.example.faro.ViewModelProviderFactory
import com.example.faro.databinding.ActivityMainBinding
import com.example.faro.ui.base.BaseActivity
import com.example.faro.ui.main.MainViewModel
import com.example.faro.view.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : BaseActivity <ActivityMainBinding, MainViewModel>(), BottomNavigationView.OnNavigationItemSelectedListener,
                                                                                                            HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    private lateinit var bottomNavigationView: BottomNavigationView

    @Inject
    lateinit var factory : ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setup()
    }

    override fun setup() {
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fTrans = supportFragmentManager.beginTransaction()
        var frag : Fragment? = null
         when (item.title){
              getString(R.string.search) -> {
                  frag = SearchFragment(R.layout.search_fragment)
              }
          }
        frag?.let { fTrans.add(R.id.main_fragment, it) }
        fTrans.commit()
        return true
      }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector


}
