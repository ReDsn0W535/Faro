package com.example.faro.ui.search.searchRecycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.faro.R
import com.example.faro.databinding.SearchMenuItemBinding

class SearchRecyclerAdapter() : RecyclerView.Adapter<SearchRecyclerHolder>() {

    private val items = ArrayList<SearchMenuItemViewModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchRecyclerHolder {
        var inflater = LayoutInflater.from(parent.context)
        var binding = DataBindingUtil.inflate<SearchMenuItemBinding>(inflater, R.layout.search_menu_item,
            parent, false)
        return SearchRecyclerHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchRecyclerHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun clearItems(){
        items.clear()
    }

    fun addItems(repoList: List<SearchMenuItemViewModel>) {
        items.addAll(repoList)
        notifyDataSetChanged()
    }
}