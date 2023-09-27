package com.socialnetworking.app.modules.stream.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowStreamBinding
import com.socialnetworking.app.modules.stream.`data`.model.StreamRowModel
import kotlin.Int
import kotlin.collections.List

class StreamAdapter(
  var list: List<StreamRowModel>
) : RecyclerView.Adapter<StreamAdapter.RowStreamVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStreamVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_stream,parent,false)
    return RowStreamVH(view)
  }

  override fun onBindViewHolder(holder: RowStreamVH, position: Int) {
    val streamRowModel = StreamRowModel()
    // TODO uncomment following line after integration with data source
    // val streamRowModel = list[position]
    holder.binding.streamRowModel = streamRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StreamRowModel>) {
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
      item: StreamRowModel
    ) {
    }
  }

  inner class RowStreamVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStreamBinding = RowStreamBinding.bind(itemView)
  }
}
