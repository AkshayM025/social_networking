package com.socialnetworking.app.modules.accountdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.accountdetails.`data`.model.AccountDetailsModel
import com.socialnetworking.app.modules.accountdetails.`data`.model.ListeightRowModel
import com.socialnetworking.app.modules.accountdetails.`data`.model.Listellipsefifteen3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountDetailsVM : ViewModel(), KoinComponent {
  val accountDetailsModel: MutableLiveData<AccountDetailsModel> =
      MutableLiveData(AccountDetailsModel())

  var navArguments: Bundle? = null

  val listeightList: MutableLiveData<MutableList<ListeightRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen3RowModel>> =
      MutableLiveData(mutableListOf())
}
