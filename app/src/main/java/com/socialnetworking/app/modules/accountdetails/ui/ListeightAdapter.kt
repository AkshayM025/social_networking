package com.socialnetworking.app.modules.accountdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.socialnetworking.app.R
import com.socialnetworking.app.databinding.RowListeightBinding
import com.socialnetworking.app.modules.accountdetails.`data`.model.ListeightRowModel
import kotlin.Int
import kotlin.collections.List

class ListeightAdapter(
  var list: List<ListeightRowModel>
) : RecyclerView.Adapter<ListeightAdapter.RowListeightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListeightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listeight,parent,false)
    return RowListeightVH(view)
  }

  override fun onBindViewHolder(holder: RowListeightVH, position: Int) {
    val listeightRowModel = ListeightRowModel()
    // TODO uncomment following line after integration with data source
    // val listeightRowModel = list[position]
    holder.binding.listeightRowModel = listeightRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListeightRowModel>) {
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
      item: ListeightRowModel
    ) {
    }
  }

  inner class RowListeightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListeightBinding = RowListeightBinding.bind(itemView)
  }
}
