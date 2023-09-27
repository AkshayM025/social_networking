package com.socialnetworking.app.modules.accountdetails.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class AccountDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRosalia: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosalia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoseTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_rose23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_75)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowing: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_6500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutme: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduce_my_na)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriends: String? = MyApp.getInstance().resources.getString(R.string.lbl_friends)

)
