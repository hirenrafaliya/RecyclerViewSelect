package com.app.recyclerviewselect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(val userList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.tvUserName.text = userList[position].userName
        holder.view.tvTime.text = userList[position].time
        holder.view.tvMessages.text = userList[position].lastMessage
        if (userList[position].info != 0) holder.view.tvInfo.text =
            userList[position].info.toString()
        else
            holder.view.tvInfo.visibility = View.INVISIBLE

        if (position == userList.size - 1)
            holder.view.viewLine.visibility = View.GONE
    }

    override fun getItemCount(): Int = userList.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
