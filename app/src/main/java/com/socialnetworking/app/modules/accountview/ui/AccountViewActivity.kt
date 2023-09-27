package com.socialnetworking.app.modules.accountview.ui

import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityAccountViewBinding
import com.socialnetworking.app.modules.accountview.`data`.viewmodel.AccountViewVM
import kotlin.String
import kotlin.Unit

class AccountViewActivity : BaseActivity<ActivityAccountViewBinding>(R.layout.activity_account_view)
    {
  private val viewModel: AccountViewVM by viewModels<AccountViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_VIEW_ACTIVITY"

  }
}
