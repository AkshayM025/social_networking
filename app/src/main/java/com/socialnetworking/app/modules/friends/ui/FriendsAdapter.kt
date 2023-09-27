package com.socialnetworking.app.modules.friends.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowFriendsBinding
import com.socialnetworking.app.modules.friends.`data`.model.FriendsRowModel
import kotlin.Int
import kotlin.collections.List

class FriendsAdapter(
  var list: List<FriendsRowModel>
) : RecyclerView.Adapter<FriendsAdapter.RowFriendsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFriendsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_friends,parent,false)
    return RowFriendsVH(view)
  }

  override fun onBindViewHolder(holder: RowFriendsVH, position: Int) {
    val friendsRowModel = FriendsRowModel()
    // TODO uncomment following line after integration with data source
    // val friendsRowModel = list[position]
    holder.binding.friendsRowModel = friendsRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FriendsRowModel>) {
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
      item: FriendsRowModel
    ) {
    }
  }

  inner class RowFriendsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFriendsBinding = RowFriendsBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, FriendsRowModel())
      }
    }
  }
}
