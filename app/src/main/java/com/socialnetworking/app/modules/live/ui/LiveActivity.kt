package com.socialnetworking.app.modules.live.ui

import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityLiveBinding
import com.socialnetworking.app.modules.live.`data`.viewmodel.LiveVM
import kotlin.String
import kotlin.Unit

class LiveActivity : BaseActivity<ActivityLiveBinding>(R.layout.activity_live) {
  private val viewModel: LiveVM by viewModels<LiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVE_ACTIVITY"

  }
}
