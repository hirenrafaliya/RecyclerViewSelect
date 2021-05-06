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

    val typeList = mutableListOf<Int>()

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

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val position=holder.layoutPosition
        if (getItemViewType(position) == isRight) {
            holder.view.tvMessage.text = chatList[position].message + position
            holder.view.tvTime.text = chatList[position].time

            if (chatList.size > 1 && position!=0) {
                if (getItemViewType(position - 1) == isLeft){
                    holder.view.imgProfile.visibility=View.VISIBLE
                }
            }
            else{
                holder.view.imgProfile.visibility=View.VISIBLE
            }

            if(position<chatList.size-1){
                if(getItemViewType(position+1) == isLeft){
                    holder.view.tvTime.visibility=View.VISIBLE
                }
            }

        } else if (getItemViewType(position) == isLeft) {
            holder.view.tvMessage.text = chatList[position].message + position
            holder.view.tvTime.text = chatList[position].time

            if (chatList.size > 1 && position!=0) {
                if (getItemViewType(position - 1) == isRight){
                    holder.view.imgProfile.visibility=View.VISIBLE
                }
            }
            else{
                holder.view.imgProfile.visibility=View.VISIBLE
            }

            if(position<chatList.size-1){
                if(getItemViewType(position+1) == isRight){
                    holder.view.tvTime.visibility=View.VISIBLE
                }
            }

        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (chatList[position].isSender) {
            typeList.add(position, isRight)
            isRight
        } else {
            typeList.add(position, isLeft)
            isLeft
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
