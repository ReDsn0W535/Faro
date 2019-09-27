package com.example.faro.data.local.db

import com.example.faro.ui.search.searchRecycleView.SearchMenuItemViewModel
import com.example.faro.ui.search.searchRecycleView.subMenu.SubMenu
import com.example.faro.ui.search.searchRecycleView.subMenu.SubMenuType

class RecyclerComponentsHelper {
    companion object {
        fun getSearchComponents(): List<SearchMenuItemViewModel> {
            val componentType = SearchMenuItemViewModel(
                "Type", arrayOf(
                    SubMenu("festival", SubMenuType.CHECKBOX),
                    SubMenu("concert", SubMenuType.CHECKBOX)
                ))
            val componentGenres = SearchMenuItemViewModel(
                "Genres", arrayOf(
                    SubMenu("Rock", SubMenuType.CHECKBOX),
                    SubMenu("Rap", SubMenuType.CHECKBOX)
                ))
            val componentDate = SearchMenuItemViewModel(
                "Date", arrayOf(
                    SubMenu(null, SubMenuType.TIME)
                ))
            return (listOf(componentType, componentGenres, componentDate))
        }
    }
}