package com.socialnetworking.app.modules.notifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowNotificationsBinding
import com.socialnetworking.app.modules.notifications.`data`.model.NotificationsRowModel
import kotlin.Int
import kotlin.collections.List

class NotificationsAdapter(
  var list: List<NotificationsRowModel>
) : RecyclerView.Adapter<NotificationsAdapter.RowNotificationsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notifications,parent,false)
    return RowNotificationsVH(view)
  }

  override fun onBindViewHolder(holder: RowNotificationsVH, position: Int) {
    val notificationsRowModel = NotificationsRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationsRowModel = list[position]
    holder.binding.notificationsRowModel = notificationsRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NotificationsRowModel>) {
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
      item: NotificationsRowModel
    ) {
    }
  }

  inner class RowNotificationsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNotificationsBinding = RowNotificationsBinding.bind(itemView)
  }
}
