package com.socialnetworking.app.modules.streamtabcontainer.ui

import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.appcomponents.views.ImagePickerFragmentDialog
import com.socialnetworking.app.databinding.FragmentStreamTabContainerBinding
import com.socialnetworking.app.modules.streamtabcontainer.`data`.viewmodel.StreamTabContainerVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class StreamTabContainerFragment :
    BaseFragment<FragmentStreamTabContainerBinding>(R.layout.fragment_stream_tab_container) {
  private val viewModel: StreamTabContainerVM by viewModels<StreamTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.streamTabContainerVM = viewModel
    val adapter = StreamTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame9031,binding.viewPagerTabbarview) { tab, position ->
      tab.text = StreamTabContainerFragmentPagerAdapter.title[position]
      }.attach()
      setUpSearchViewGroup9020Listener()
    }

    override fun setUpClicks(): Unit {
      binding.btnCamera.setOnClickListener {
        ImagePickerFragmentDialog().show(childFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
    }

    private fun setUpSearchViewGroup9020Listener(): Unit {
      binding.searchViewGroup9020.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      companion object {
        const val TAG: String = "STREAM_TAB_CONTAINER_FRAGMENT"


        fun getInstance(bundle: Bundle?): StreamTabContainerFragment {
          val fragment = StreamTabContainerFragment()
          fragment.arguments = bundle
          return fragment
        }
      }
    }
