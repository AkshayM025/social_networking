package com.socialnetworking.app.modules.stories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListnineteen1Binding
import com.socialnetworking.app.modules.stories.`data`.model.Listnineteen1RowModel
import kotlin.Int
import kotlin.collections.List

class ListnineteenAdapter(
  var list: List<Listnineteen1RowModel>
) : RecyclerView.Adapter<ListnineteenAdapter.RowListnineteen1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnineteen1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnineteen1,parent,false)
    return RowListnineteen1VH(view)
  }

  override fun onBindViewHolder(holder: RowListnineteen1VH, position: Int) {
    val listnineteen1RowModel = Listnineteen1RowModel()
    // TODO uncomment following line after integration with data source
    // val listnineteen1RowModel = list[position]
    holder.binding.listnineteen1RowModel = listnineteen1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listnineteen1RowModel>) {
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
      item: Listnineteen1RowModel
    ) {
    }
  }

  inner class RowListnineteen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnineteen1Binding = RowListnineteen1Binding.bind(itemView)
  }
}
