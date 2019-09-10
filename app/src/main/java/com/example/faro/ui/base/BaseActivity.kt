package com.example.faro.ui.base

import androidx.appcompat.app.AppCompatActivity
import com.example.faro.view.BaseFragment

abstract class BaseActivity<V : BaseViewModel<*>> : AppCompatActivity(), BaseFragment.Callback{

}