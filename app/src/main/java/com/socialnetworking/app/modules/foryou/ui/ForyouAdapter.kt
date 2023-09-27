package com.socialnetworking.app.modules.foryou.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowForyouBinding
import com.socialnetworking.app.modules.foryou.`data`.model.ForyouRowModel
import kotlin.Int
import kotlin.collections.List

class ForyouAdapter(
  var list: List<ForyouRowModel>
) : RecyclerView.Adapter<ForyouAdapter.RowForyouVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowForyouVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_foryou,parent,false)
    return RowForyouVH(view)
  }

  override fun onBindViewHolder(holder: RowForyouVH, position: Int) {
    val foryouRowModel = ForyouRowModel()
    // TODO uncomment following line after integration with data source
    // val foryouRowModel = list[position]
    holder.binding.foryouRowModel = foryouRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ForyouRowModel>) {
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
      item: ForyouRowModel
    ) {
    }
  }

  inner class RowForyouVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowForyouBinding = RowForyouBinding.bind(itemView)
  }
}
