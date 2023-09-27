package com.socialnetworking.app.modules.stories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListellipsefifteen2Binding
import com.socialnetworking.app.modules.stories.`data`.model.Listellipsefifteen2RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefifteenAdapter(
  var list: List<Listellipsefifteen2RowModel>
) : RecyclerView.Adapter<ListellipsefifteenAdapter.RowListellipsefifteen2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefifteen2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefifteen2,parent,false)
    return RowListellipsefifteen2VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefifteen2VH, position: Int) {
    val listellipsefifteen2RowModel = Listellipsefifteen2RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefifteen2RowModel = list[position]
    holder.binding.listellipsefifteen2RowModel = listellipsefifteen2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipsefifteen2RowModel>) {
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
      item: Listellipsefifteen2RowModel
    ) {
    }
  }

  inner class RowListellipsefifteen2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefifteen2Binding = RowListellipsefifteen2Binding.bind(itemView)
  }
}
