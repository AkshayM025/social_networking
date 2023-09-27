package com.socialnetworking.app.modules.trendingtabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import com.socialnetworking.app.modules.trending.ui.TrendingFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class TrendingTabContainerFragmentPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_trending),MyApp.getInstance().resources.getString(R.string.lbl_latest),MyApp.getInstance().resources.getString(R.string.lbl_discover),MyApp.getInstance().resources.getString(R.string.lbl_daily_new))

        val viewPages: List<Fragment> =
                listOf(TrendingFragment(),TrendingFragment(),TrendingFragment(),TrendingFragment())

    }
}
