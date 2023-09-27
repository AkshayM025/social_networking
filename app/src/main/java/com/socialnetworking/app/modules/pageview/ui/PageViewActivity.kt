package com.socialnetworking.app.modules.pageview.ui

import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityPageViewBinding
import com.socialnetworking.app.modules.pageview.`data`.viewmodel.PageViewVM
import kotlin.String
import kotlin.Unit

class PageViewActivity : BaseActivity<ActivityPageViewBinding>(R.layout.activity_page_view) {
  private val viewModel: PageViewVM by viewModels<PageViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAGE_VIEW_ACTIVITY"

  }
}
