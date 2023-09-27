package com.socialnetworking.app.modules.invitefriends.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class InviteFriendsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInviteFriends: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_invite_friends)

)
