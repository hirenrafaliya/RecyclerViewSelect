package com.app.recyclerviewselect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_chat_right.view.*

class ChatAdapter(val chatList: MutableList<Chat>) :
    RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    val isRight = 1
    val isLeft = 0

    val tempList = mutableListOf<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == isRight) {
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_chat_right, parent, false)
            )
        } else {
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_chat_left, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (getItemViewType(position) == isRight) {
            holder.view.tvMessage.text = chatList[position].message + position
            holder.view.tvTime.text = chatList[position].time


        } else if (getItemViewType(position) == isLeft) {
            holder.view.tvMessage.text = chatList[position].message + position
            holder.view.tvTime.text = chatList[position].time


        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (chatList[position].isSender)
            isRight
        else isLeft
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
