package com.socialnetworking.app.modules.dailynewtabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import com.socialnetworking.app.modules.dailynew.ui.DailyNewFragment
import com.socialnetworking.app.modules.discover.ui.DiscoverFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class DailyNewTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_trending),MyApp.getInstance().resources.getString(R.string.lbl_latest),MyApp.getInstance().resources.getString(R.string.lbl_discover),MyApp.getInstance().resources.getString(R.string.lbl_daily_new))

        val viewPages: List<Fragment> =
                listOf(DiscoverFragment(),DiscoverFragment(),DiscoverFragment(),DailyNewFragment())

    }
}
