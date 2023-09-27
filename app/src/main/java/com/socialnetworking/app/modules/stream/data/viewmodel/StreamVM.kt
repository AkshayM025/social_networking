package com.socialnetworking.app.modules.stream.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.stream.`data`.model.StreamModel
import com.socialnetworking.app.modules.stream.`data`.model.StreamRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StreamVM : ViewModel(), KoinComponent {
  val streamModel: MutableLiveData<StreamModel> = MutableLiveData(StreamModel())

  var navArguments: Bundle? = null

  val streamList: MutableLiveData<MutableList<StreamRowModel>> = MutableLiveData(mutableListOf())
}
