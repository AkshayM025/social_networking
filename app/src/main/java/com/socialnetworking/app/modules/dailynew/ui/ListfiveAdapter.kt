package com.socialnetworking.app.modules.dailynew.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListfiveBinding
import com.socialnetworking.app.modules.dailynew.`data`.model.ListfiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListfiveAdapter(
  var list: List<ListfiveRowModel>
) : RecyclerView.Adapter<ListfiveAdapter.RowListfiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfive,parent,false)
    return RowListfiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListfiveVH, position: Int) {
    val listfiveRowModel = ListfiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listfiveRowModel = list[position]
    holder.binding.listfiveRowModel = listfiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfiveRowModel>) {
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
      item: ListfiveRowModel
    ) {
    }
  }

  inner class RowListfiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfiveBinding = RowListfiveBinding.bind(itemView)
  }
}
