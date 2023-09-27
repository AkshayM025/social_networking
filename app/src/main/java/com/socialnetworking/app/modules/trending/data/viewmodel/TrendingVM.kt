package com.socialnetworking.app.modules.trending.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.trending.`data`.model.TrendingModel
import com.socialnetworking.app.modules.trending.`data`.model.TrendingRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingVM : ViewModel(), KoinComponent {
  val trendingModel: MutableLiveData<TrendingModel> = MutableLiveData(TrendingModel())

  var navArguments: Bundle? = null

  val trendingList: MutableLiveData<MutableList<TrendingRowModel>> =
      MutableLiveData(mutableListOf())
}
