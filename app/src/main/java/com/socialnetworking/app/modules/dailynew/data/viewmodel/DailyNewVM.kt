package com.socialnetworking.app.modules.dailynew.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.dailynew.`data`.model.DailyNewModel
import com.socialnetworking.app.modules.dailynew.`data`.model.ListfiveRowModel
import com.socialnetworking.app.modules.dailynew.`data`.model.ListnineteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyNewVM : ViewModel(), KoinComponent {
  val dailyNewModel: MutableLiveData<DailyNewModel> = MutableLiveData(DailyNewModel())

  var navArguments: Bundle? = null

  val listnineteenList: MutableLiveData<MutableList<ListnineteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listfiveList: MutableLiveData<MutableList<ListfiveRowModel>> =
      MutableLiveData(mutableListOf())
}
