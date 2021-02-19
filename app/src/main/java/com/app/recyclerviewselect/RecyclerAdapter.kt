package com.app.recyclerviewselect

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerviewselect.databinding.ItemRecyclerBinding

class RecyclerAdapter(
    private val itemList: ArrayList<Item>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val selectedList = ArrayList<Int>()
    private val checkImgList=ArrayList<ImageView>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRecyclerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvTitle.text=itemList[position].title
        holder.binding.layoutParent.setOnClickListener {
            if (selectedList.contains(position)) {
                selectedList.remove(position)
                holder.binding.imgCheck.visibility = View.GONE

                checkImgList.remove(holder.binding.imgCheck)
            } else {
                selectedList.add(position)
                holder.binding.imgCheck.visibility = View.VISIBLE

                checkImgList.add(holder.binding.imgCheck)
            }
        }
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root)

    fun clearSelectedItems(){
        for(img in checkImgList){
            img.visibility=View.GONE
        }
        selectedList.clear()
    }

    fun getALlSelectedIndexes(): ArrayList<Int> {
        return selectedList
    }
}