package com.example.faro.dagger2.builders

import com.example.faro.dagger2.modules.SearchFragmentModule
import com.example.faro.dagger2.providers.SearchFragmentModuleProvider
import com.example.faro.view.MainActivity
import com.example.faro.view.fragment.SearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [SearchFragmentModuleProvider::class])
    abstract fun bindMainActivity() : MainActivity
}