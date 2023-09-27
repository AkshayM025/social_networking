package com.socialnetworking.app.modules.foryoutabcontainer.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityForYouTabContainerBinding
import com.socialnetworking.app.modules.foryoutabcontainer.`data`.viewmodel.ForYouTabContainerVM
import kotlin.String
import kotlin.Unit

class ForYouTabContainerActivity :
    BaseActivity<ActivityForYouTabContainerBinding>(R.layout.activity_for_you_tab_container) {
  private val viewModel: ForYouTabContainerVM by viewModels<ForYouTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forYouTabContainerVM = viewModel
    val adapter = ForYouTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup9148,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ForYouTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FOR_YOU_TAB_CONTAINER_ACTIVITY"

    }
  }
