package com.socialnetworking.app.modules.dailynew.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListnineteenBinding
import com.socialnetworking.app.modules.dailynew.`data`.model.ListnineteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListnineteenAdapter(
  var list: List<ListnineteenRowModel>
) : RecyclerView.Adapter<ListnineteenAdapter.RowListnineteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnineteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnineteen,parent,false)
    return RowListnineteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListnineteenVH, position: Int) {
    val listnineteenRowModel = ListnineteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listnineteenRowModel = list[position]
    holder.binding.listnineteenRowModel = listnineteenRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnineteenRowModel>) {
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
      item: ListnineteenRowModel
    ) {
    }
  }

  inner class RowListnineteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnineteenBinding = RowListnineteenBinding.bind(itemView)
  }
}
