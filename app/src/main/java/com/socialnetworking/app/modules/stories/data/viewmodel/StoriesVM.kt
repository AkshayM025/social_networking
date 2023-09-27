package com.socialnetworking.app.modules.stories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.stories.`data`.model.Listellipsefifteen2RowModel
import com.socialnetworking.app.modules.stories.`data`.model.Listnineteen1RowModel
import com.socialnetworking.app.modules.stories.`data`.model.StoriesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesVM : ViewModel(), KoinComponent {
  val storiesModel: MutableLiveData<StoriesModel> = MutableLiveData(StoriesModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen2RowModel>> =
      MutableLiveData(mutableListOf())

  val listnineteenList: MutableLiveData<MutableList<Listnineteen1RowModel>> =
      MutableLiveData(mutableListOf())
}
