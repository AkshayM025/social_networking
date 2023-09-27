package com.socialnetworking.app.modules.trendingtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.trendingtabcontainer.`data`.model.ListellipsefifteenRowModel
import com.socialnetworking.app.modules.trendingtabcontainer.`data`.model.TrendingTabContainerModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingTabContainerVM : ViewModel(), KoinComponent {
  val trendingTabContainerModel: MutableLiveData<TrendingTabContainerModel> =
      MutableLiveData(TrendingTabContainerModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<ListellipsefifteenRowModel>> =
      MutableLiveData(mutableListOf())
}
