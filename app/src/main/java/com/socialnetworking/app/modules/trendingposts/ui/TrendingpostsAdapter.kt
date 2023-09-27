package com.socialnetworking.app.modules.trendingposts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowTrendingpostsBinding
import com.socialnetworking.app.modules.trendingposts.`data`.model.TrendingpostsRowModel
import kotlin.Int
import kotlin.collections.List

class TrendingpostsAdapter(
  var list: List<TrendingpostsRowModel>
) : RecyclerView.Adapter<TrendingpostsAdapter.RowTrendingpostsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTrendingpostsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_trendingposts,parent,false)
    return RowTrendingpostsVH(view)
  }

  override fun onBindViewHolder(holder: RowTrendingpostsVH, position: Int) {
    val trendingpostsRowModel = TrendingpostsRowModel()
    // TODO uncomment following line after integration with data source
    // val trendingpostsRowModel = list[position]
    holder.binding.trendingpostsRowModel = trendingpostsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TrendingpostsRowModel>) {
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
      item: TrendingpostsRowModel
    ) {
    }
  }

  inner class RowTrendingpostsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTrendingpostsBinding = RowTrendingpostsBinding.bind(itemView)
  }
}
