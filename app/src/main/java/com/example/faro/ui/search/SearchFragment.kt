package com.example.faro.view.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.faro.BR
import com.example.faro.R
import com.example.faro.ViewModelProviderFactory
import com.example.faro.databinding.SearchFragmentBinding
import com.example.faro.ui.search.SearchViewModel
import com.example.faro.ui.search.SearchNavigator
import com.example.faro.ui.search.searchRecycleView.SearchRecyclerAdapter
import com.example.faro.view.BaseFragment
import javax.inject.Inject


class SearchFragment(layout: Int) :
    BaseFragment<SearchFragmentBinding, SearchViewModel>(layout), SearchNavigator {

    @Inject
    internal lateinit var factory: ViewModelProviderFactory
    @Inject
    internal lateinit var adapter: SearchRecyclerAdapter
    lateinit var binding: SearchFragmentBinding
    private lateinit var searchViewModel: SearchViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getViewDataBinding()?.let { binding = it }
        setUp()
    }

    private fun setUp() {
        var layoutManager = LinearLayoutManager(this.activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.searchRecyclerView.apply {
            this.layoutManager = layoutManager
            itemAnimator = DefaultItemAnimator()
            adapter = this@SearchFragment.adapter
        }
    }


    override fun getLayoutId(): Int {
        return R.layout.search_fragment
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): SearchViewModel {
        searchViewModel =
            ViewModelProviders.of(this, factory).get(SearchViewModel::class.java)
        return searchViewModel
    }
}