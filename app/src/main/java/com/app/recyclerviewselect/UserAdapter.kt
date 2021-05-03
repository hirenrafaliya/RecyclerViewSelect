package com.app.recyclerviewselect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_option.view.*

class UserAdapter(val userList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.imgIcon.setImageResource(userList[position].img)
        holder.view.tvTitle.text = userList[position].userName

        if (position == userList.size - 1)
            holder.view.viewLine.visibility = View.GONE
    }

    override fun getItemCount(): Int = userList.size
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}
