package com.socialnetworking.app.modules.friends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.friends.`data`.model.FriendsModel
import com.socialnetworking.app.modules.friends.`data`.model.FriendsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FriendsVM : ViewModel(), KoinComponent {
  val friendsModel: MutableLiveData<FriendsModel> = MutableLiveData(FriendsModel())

  var navArguments: Bundle? = null

  val friendsList: MutableLiveData<MutableList<FriendsRowModel>> = MutableLiveData(mutableListOf())
}
