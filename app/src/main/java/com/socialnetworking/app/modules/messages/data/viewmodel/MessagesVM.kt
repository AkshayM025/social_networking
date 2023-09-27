package com.socialnetworking.app.modules.messages.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.messages.`data`.model.Listellipsefifteen1RowModel
import com.socialnetworking.app.modules.messages.`data`.model.ListsenderRowModel
import com.socialnetworking.app.modules.messages.`data`.model.MessagesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessagesVM : ViewModel(), KoinComponent {
  val messagesModel: MutableLiveData<MessagesModel> = MutableLiveData(MessagesModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen1RowModel>> =
      MutableLiveData(mutableListOf())

  val listsenderList: MutableLiveData<MutableList<ListsenderRowModel>> =
      MutableLiveData(mutableListOf())
}
