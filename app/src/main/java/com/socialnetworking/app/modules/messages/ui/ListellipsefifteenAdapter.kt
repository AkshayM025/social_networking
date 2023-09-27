package com.socialnetworking.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListellipsefifteen1Binding
import com.socialnetworking.app.modules.messages.`data`.model.Listellipsefifteen1RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefifteenAdapter(
  var list: List<Listellipsefifteen1RowModel>
) : RecyclerView.Adapter<ListellipsefifteenAdapter.RowListellipsefifteen1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefifteen1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefifteen1,parent,false)
    return RowListellipsefifteen1VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefifteen1VH, position: Int) {
    val listellipsefifteen1RowModel = Listellipsefifteen1RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefifteen1RowModel = list[position]
    holder.binding.listellipsefifteen1RowModel = listellipsefifteen1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipsefifteen1RowModel>) {
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
      item: Listellipsefifteen1RowModel
    ) {
    }
  }

  inner class RowListellipsefifteen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefifteen1Binding = RowListellipsefifteen1Binding.bind(itemView)
  }
}
