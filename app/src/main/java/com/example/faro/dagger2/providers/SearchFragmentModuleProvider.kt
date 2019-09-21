package com.example.faro.dagger2.providers

import com.example.faro.dagger2.modules.SearchFragmentModule
import com.example.faro.view.fragment.SearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SearchFragmentModuleProvider {

    @ContributesAndroidInjector(modules = [SearchFragmentModule::class])
    abstract fun provideOpenSourceFragmentFactory(): SearchFragment
}
