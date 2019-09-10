package com.example.faro.view

import androidx.fragment.app.Fragment
import com.example.faro.ui.base.BaseViewModel

abstract class BaseFragment<V : BaseViewModel<*>> : Fragment() {




    interface Callback {

    }

}