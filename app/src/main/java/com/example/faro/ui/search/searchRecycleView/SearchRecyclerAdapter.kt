package com.example.faro.ui.search.searchRecycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.faro.R
import com.example.faro.databinding.SearchMenuItemBinding
import com.example.faro.ui.search.SearchMenuItemViewModel

class SearchRecyclerAdapter(private val items: Array<String>) :
    RecyclerView.Adapter<SearchRecyclerHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: SearchRecyclerHolder, position: Int) {
        holder.bind(SearchMenuItemViewModel(items[position]))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchRecyclerHolder {
        var inflater = LayoutInflater.from(parent.context)
        var binding = DataBindingUtil.inflate<SearchMenuItemBinding>(inflater, R.layout.search_menu_item,
            parent, false)
        return SearchRecyclerHolder(binding)
    }
}