package com.example.faro.ui.search.searchRecycleView

import androidx.recyclerview.widget.RecyclerView
import com.example.faro.databinding.SearchMenuItemBinding
import com.example.faro.ui.search.SearchMenuItemViewModel

class SearchRecyclerHolder(var binding: SearchMenuItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(searchMenuItem: SearchMenuItemViewModel){
        binding.menuItem = searchMenuItem
        binding.executePendingBindings()
    }
}