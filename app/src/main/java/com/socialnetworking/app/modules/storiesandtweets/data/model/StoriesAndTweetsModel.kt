package com.socialnetworking.app.modules.storiesandtweets.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class StoriesAndTweetsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStories: String? = MyApp.getInstance().resources.getString(R.string.lbl_stories)

)
