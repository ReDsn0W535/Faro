package com.example.faro.dagger2.component

import android.app.Application
import com.example.faro.dagger2.builders.ActivityBuilder
import com.example.faro.dagger2.builders.ActivityBuilder_BindMainActivity
import com.example.faro.dagger2.modules.AppModule
import com.example.faro.ui.MVVMApp
import com.example.faro.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    fun inject(app : MVVMApp)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }
}