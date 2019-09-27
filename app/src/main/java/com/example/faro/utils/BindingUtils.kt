package com.example.faro.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.faro.ui.search.searchRecycleView.SearchMenuItemViewModel
import com.example.faro.ui.search.searchRecycleView.SearchRecyclerAdapter

class BindingUtils private constructor() {

    companion object {
        @BindingAdapter("adapter")
        @JvmStatic
        fun addSearchItems(recyclerView: RecyclerView, values: List<SearchMenuItemViewModel>) {
            val adapter = recyclerView.adapter as SearchRecyclerAdapter?
            adapter?.let {
                adapter.clearItems()
                adapter.addItems(values)
            }
        }
    }
}