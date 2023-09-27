package com.socialnetworking.app.modules.trending.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowTrendingBinding
import com.socialnetworking.app.modules.trending.`data`.model.TrendingRowModel
import kotlin.Int
import kotlin.collections.List

class TrendingAdapter(
  var list: List<TrendingRowModel>
) : RecyclerView.Adapter<TrendingAdapter.RowTrendingVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTrendingVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_trending,parent,false)
    return RowTrendingVH(view)
  }

  override fun onBindViewHolder(holder: RowTrendingVH, position: Int) {
    val trendingRowModel = TrendingRowModel()
    // TODO uncomment following line after integration with data source
    // val trendingRowModel = list[position]
    holder.binding.trendingRowModel = trendingRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TrendingRowModel>) {
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
      item: TrendingRowModel
    ) {
    }
  }

  inner class RowTrendingVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTrendingBinding = RowTrendingBinding.bind(itemView)
  }
}
