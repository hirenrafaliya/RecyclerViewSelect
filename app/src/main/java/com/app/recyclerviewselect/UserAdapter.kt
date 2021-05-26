package com.app.recyclerviewselect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(val userList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var text = "<b>${userList[position].userName}</b> ${userList[position].text}"
        holder.view.tvText.text = HtmlCompat.fromHtml(text,HtmlCompat.FROM_HTML_MODE_LEGACY)
        holder.view.tvTime.text = userList[position].time

        Glide.with(holder.itemView.context).load(userList[position].imgUrl)
            .into(holder.view.imgProfile)

        if (position == userList.size - 1)
            holder.view.viewLine.visibility = View.GONE
    }

    override fun getItemCount(): Int = userList.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
