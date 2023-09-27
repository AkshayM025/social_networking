package com.socialnetworking.app.modules.foryoutabcontainer.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class ForYouTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_lucas_anna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3516: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_16)

)
