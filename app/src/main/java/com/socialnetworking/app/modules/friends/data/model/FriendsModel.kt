package com.socialnetworking.app.modules.friends.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class FriendsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFriends: String? = MyApp.getInstance().resources.getString(R.string.lbl_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConnecttoYour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connect_to_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommeded: String? = MyApp.getInstance().resources.getString(R.string.lbl_recommeded)

)
