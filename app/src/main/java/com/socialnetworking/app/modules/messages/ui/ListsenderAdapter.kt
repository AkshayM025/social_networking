package com.socialnetworking.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListsenderBinding
import com.socialnetworking.app.modules.messages.`data`.model.ListsenderRowModel
import kotlin.Int
import kotlin.collections.List

class ListsenderAdapter(
  var list: List<ListsenderRowModel>
) : RecyclerView.Adapter<ListsenderAdapter.RowListsenderVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsenderVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsender,parent,false)
    return RowListsenderVH(view)
  }

  override fun onBindViewHolder(holder: RowListsenderVH, position: Int) {
    val listsenderRowModel = ListsenderRowModel()
    // TODO uncomment following line after integration with data source
    // val listsenderRowModel = list[position]
    holder.binding.listsenderRowModel = listsenderRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsenderRowModel>) {
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
      item: ListsenderRowModel
    ) {
    }
  }

  inner class RowListsenderVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsenderBinding = RowListsenderBinding.bind(itemView)
  }
}
