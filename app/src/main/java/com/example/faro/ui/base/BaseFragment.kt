package com.example.faro.view

import androidx.fragment.app.Fragment
import com.example.faro.ui.base.BaseViewModel
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.faro.BR
import com.example.faro.ui.base.BaseActivity
import dagger.android.support.AndroidSupportInjection


abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel<*>>(layout: Int) : Fragment(layout) {

    private var mActivity: BaseActivity<*,*>? = null
    private var mRootView: View? = null
    private var viewDataBinding: T? = null
    private var viewModel: V? = null

    @LayoutRes
    abstract fun getLayoutId(): Int


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        mRootView = viewDataBinding?.root
        return mRootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding?.setVariable(getBindingVariable(), viewModel)
        viewDataBinding?.lifecycleOwner = this
        viewDataBinding?.executePendingBindings()
    }

    fun getViewDataBinding(): T? {
        return viewDataBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
        viewModel = getViewModel()
        setHasOptionsMenu(false)
    }

    abstract fun getBindingVariable(): Int

    abstract fun getViewModel(): V

    private fun performDependencyInjection() {
        AndroidSupportInjection.inject(this)
    }


    interface Callback {

    }

}