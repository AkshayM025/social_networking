package com.socialnetworking.app.modules.trendingcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityTrendingContainerBinding
import com.socialnetworking.app.extensions.loadFragment
import com.socialnetworking.app.modules.messages.ui.MessagesFragment
import com.socialnetworking.app.modules.notifications.ui.NotificationsFragment
import com.socialnetworking.app.modules.profile.ui.ProfileFragment
import com.socialnetworking.app.modules.streamtabcontainer.ui.StreamTabContainerFragment
import com.socialnetworking.app.modules.trendingcontainer.`data`.viewmodel.TrendingContainerVM
import com.socialnetworking.app.modules.trendingtabcontainer.ui.TrendingTabContainerFragment
import kotlin.String
import kotlin.Unit

class TrendingContainerActivity :
    BaseActivity<ActivityTrendingContainerBinding>(R.layout.activity_trending_container) {
  private val viewModel: TrendingContainerVM by viewModels<TrendingContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trendingContainerVM = viewModel
    val destFragment = TrendingTabContainerFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = TrendingTabContainerFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ProfileFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnstreams.setOnClickListener {
      val destFragment = StreamTabContainerFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = StreamTabContainerFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnhome.setOnClickListener {
      val destFragment = TrendingTabContainerFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = TrendingTabContainerFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnnotification.setOnClickListener {
      val destFragment = NotificationsFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = NotificationsFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumncomputer.setOnClickListener {
      val destFragment = MessagesFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = MessagesFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "TRENDING_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrendingContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
