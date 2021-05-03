package com.app.recyclerviewselect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_option.view.*

class OptionsAdapter(val optionsList: MutableList<Option>) :
    RecyclerView.Adapter<OptionsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_option, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.imgIcon.setImageResource(optionsList[position].img)
        holder.view.tvTitle.text = optionsList[position].title

        if (position == optionsList.size - 1)
            holder.view.viewLine.visibility = View.GONE
    }

    override fun getItemCount(): Int = optionsList.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}