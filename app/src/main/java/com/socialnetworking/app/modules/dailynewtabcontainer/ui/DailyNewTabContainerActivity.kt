package com.socialnetworking.app.modules.dailynewtabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityDailyNewTabContainerBinding
import com.socialnetworking.app.modules.dailynewtabcontainer.`data`.viewmodel.DailyNewTabContainerVM
import com.socialnetworking.app.modules.search.ui.SearchActivity
import kotlin.String
import kotlin.Unit

class DailyNewTabContainerActivity :
    BaseActivity<ActivityDailyNewTabContainerBinding>(R.layout.activity_daily_new_tab_container) {
  private val viewModel: DailyNewTabContainerVM by viewModels<DailyNewTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dailyNewTabContainerVM = viewModel
    val adapter = DailyNewTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame9031,binding.viewPagerTabbarview) { tab, position ->
      tab.text = DailyNewTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.searchViewGroup9021.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "DAILY_NEW_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, DailyNewTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
