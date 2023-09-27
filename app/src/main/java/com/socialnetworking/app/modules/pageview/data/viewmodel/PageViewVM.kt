package com.socialnetworking.app.modules.pageview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.pageview.`data`.model.PageViewModel
import org.koin.core.KoinComponent

class PageViewVM : ViewModel(), KoinComponent {
  val pageViewModel: MutableLiveData<PageViewModel> = MutableLiveData(PageViewModel())

  var navArguments: Bundle? = null
}
