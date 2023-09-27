package com.socialnetworking.app.modules.invitefriends.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowInvitefriendsBinding
import com.socialnetworking.app.modules.invitefriends.`data`.model.InvitefriendsRowModel
import kotlin.Int
import kotlin.collections.List

class InvitefriendsAdapter(
  var list: List<InvitefriendsRowModel>
) : RecyclerView.Adapter<InvitefriendsAdapter.RowInvitefriendsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInvitefriendsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_invitefriends,parent,false)
    return RowInvitefriendsVH(view)
  }

  override fun onBindViewHolder(holder: RowInvitefriendsVH, position: Int) {
    val invitefriendsRowModel = InvitefriendsRowModel()
    // TODO uncomment following line after integration with data source
    // val invitefriendsRowModel = list[position]
    holder.binding.invitefriendsRowModel = invitefriendsRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<InvitefriendsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: InvitefriendsRowModel
    ) {
    }
  }

  inner class RowInvitefriendsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowInvitefriendsBinding = RowInvitefriendsBinding.bind(itemView)
  }
}
