package com.app.recyclerviewselect

import android.R
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerviewselect.databinding.ItemRecyclerBinding
import com.bumptech.glide.Glide


class RecyclerAdapter(
    private val itemList: ArrayList<Item>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

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
        holder.binding.tvName.text = itemList[position].name
        holder.binding.tvLocation.text = itemList[position].location

        Glide.with(holder.itemView.context)
            .load(itemList[position].img)
            .into(holder.binding.imgProfile)

        holder.binding.imgOptions.setOnClickListener {
            val popup = PopupMenu(holder.itemView.context, holder.binding.imgOptions)
            popup.menu.add("Unfolllow")
            popup.menu.add("Report")
            popup.setOnMenuItemClickListener(object : MenuItem.OnMenuItemClickListener,
                PopupMenu.OnMenuItemClickListener {
                override fun onMenuItemClick(menu: MenuItem?): Boolean {
                    if (menu!!.order == 0) {
                        Toast.makeText(holder.itemView.context, "Unfollow", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(holder.itemView.context, "Unfollow", Toast.LENGTH_SHORT).show()
                    }
                    return true
                }
            })
            popup.show()

        }
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root)


}