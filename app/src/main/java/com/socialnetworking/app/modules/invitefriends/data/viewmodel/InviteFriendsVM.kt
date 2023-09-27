package com.socialnetworking.app.modules.invitefriends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.invitefriends.`data`.model.InviteFriendsModel
import com.socialnetworking.app.modules.invitefriends.`data`.model.InvitefriendsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InviteFriendsVM : ViewModel(), KoinComponent {
  val inviteFriendsModel: MutableLiveData<InviteFriendsModel> =
      MutableLiveData(InviteFriendsModel())

  var navArguments: Bundle? = null

  val invitefriendsList: MutableLiveData<MutableList<InvitefriendsRowModel>> =
      MutableLiveData(mutableListOf())
}
