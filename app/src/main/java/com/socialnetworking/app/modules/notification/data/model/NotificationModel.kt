package com.socialnetworking.app.modules.notification.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnonNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notific2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnonnotificationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)

)
