package com.socialnetworking.app.modules.invitefriends.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityInviteFriendsBinding
import com.socialnetworking.app.modules.invitefriends.`data`.model.InvitefriendsRowModel
import com.socialnetworking.app.modules.invitefriends.`data`.viewmodel.InviteFriendsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InviteFriendsActivity :
    BaseActivity<ActivityInviteFriendsBinding>(R.layout.activity_invite_friends) {
  private val viewModel: InviteFriendsVM by viewModels<InviteFriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val invitefriendsAdapter =
    InvitefriendsAdapter(viewModel.invitefriendsList.value?:mutableListOf())
    binding.recyclerInvitefriends.adapter = invitefriendsAdapter
    invitefriendsAdapter.setOnItemClickListener(
    object : InvitefriendsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InvitefriendsRowModel) {
        onClickRecyclerInvitefriends(view, position, item)
      }
    }
    )
    viewModel.invitefriendsList.observe(this) {
      invitefriendsAdapter.updateData(it)
    }
    binding.inviteFriendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerInvitefriends(
    view: View,
    position: Int,
    item: InvitefriendsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INVITE_FRIENDS_ACTIVITY"

  }
}
