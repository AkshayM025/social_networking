package com.socialnetworking.app.modules.accountdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListellipsefifteen3Binding
import com.socialnetworking.app.modules.accountdetails.`data`.model.Listellipsefifteen3RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefifteenAdapter(
  var list: List<Listellipsefifteen3RowModel>
) : RecyclerView.Adapter<ListellipsefifteenAdapter.RowListellipsefifteen3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefifteen3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefifteen3,parent,false)
    return RowListellipsefifteen3VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefifteen3VH, position: Int) {
    val listellipsefifteen3RowModel = Listellipsefifteen3RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefifteen3RowModel = list[position]
    holder.binding.listellipsefifteen3RowModel = listellipsefifteen3RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipsefifteen3RowModel>) {
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
      item: Listellipsefifteen3RowModel
    ) {
    }
  }

  inner class RowListellipsefifteen3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefifteen3Binding = RowListellipsefifteen3Binding.bind(itemView)
  }
}
