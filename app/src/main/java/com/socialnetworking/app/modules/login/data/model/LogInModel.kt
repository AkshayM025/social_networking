package com.socialnetworking.app.modules.login.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoSocialOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_soci2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginyouraccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_your_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailidValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
