package com.socialnetworking.app.modules.accountdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityAccountDetailsBinding
import com.socialnetworking.app.modules.accountdetails.`data`.model.ListeightRowModel
import com.socialnetworking.app.modules.accountdetails.`data`.model.Listellipsefifteen3RowModel
import com.socialnetworking.app.modules.accountdetails.`data`.viewmodel.AccountDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountDetailsActivity :
    BaseActivity<ActivityAccountDetailsBinding>(R.layout.activity_account_details) {
  private val viewModel: AccountDetailsVM by viewModels<AccountDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listeightAdapter = ListeightAdapter(viewModel.listeightList.value?:mutableListOf())
    binding.recyclerListeight.adapter = listeightAdapter
    listeightAdapter.setOnItemClickListener(
    object : ListeightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListeightRowModel) {
        onClickRecyclerListeight(view, position, item)
      }
    }
    )
    viewModel.listeightList.observe(this) {
      listeightAdapter.updateData(it)
    }
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen3RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.accountDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListeight(
    view: View,
    position: Int,
    item: ListeightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DETAILS_ACTIVITY"

  }
}
