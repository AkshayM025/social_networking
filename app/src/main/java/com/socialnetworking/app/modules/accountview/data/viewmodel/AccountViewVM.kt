package com.socialnetworking.app.modules.accountview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.accountview.`data`.model.AccountViewModel
import org.koin.core.KoinComponent

class AccountViewVM : ViewModel(), KoinComponent {
  val accountViewModel: MutableLiveData<AccountViewModel> = MutableLiveData(AccountViewModel())

  var navArguments: Bundle? = null
}
