package com.socialnetworking.app.modules.storiesandtweets.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListsendBinding
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.ListsendRowModel
import kotlin.Int
import kotlin.collections.List

class ListsendAdapter(
  var list: List<ListsendRowModel>
) : RecyclerView.Adapter<ListsendAdapter.RowListsendVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsendVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsend,parent,false)
    return RowListsendVH(view)
  }

  override fun onBindViewHolder(holder: RowListsendVH, position: Int) {
    val listsendRowModel = ListsendRowModel()
    // TODO uncomment following line after integration with data source
    // val listsendRowModel = list[position]
    holder.binding.listsendRowModel = listsendRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsendRowModel>) {
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
      item: ListsendRowModel
    ) {
    }
  }

  inner class RowListsendVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsendBinding = RowListsendBinding.bind(itemView)
  }
}
