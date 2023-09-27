package com.socialnetworking.app.modules.foryou.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.foryou.`data`.model.ForYouModel
import com.socialnetworking.app.modules.foryou.`data`.model.ForyouRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ForYouVM : ViewModel(), KoinComponent {
  val forYouModel: MutableLiveData<ForYouModel> = MutableLiveData(ForYouModel())

  var navArguments: Bundle? = null

  val foryouList: MutableLiveData<MutableList<ForyouRowModel>> = MutableLiveData(mutableListOf())
}
