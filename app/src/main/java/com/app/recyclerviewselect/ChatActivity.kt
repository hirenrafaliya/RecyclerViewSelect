package com.app.recyclerviewselect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_user.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val chatList = mutableListOf<Chat>()

        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", false))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", true))
        chatList.add(Chat("Some random message here", "05:56 PM", false))

        recyclerView.adapter = ChatAdapter(chatList)
        val manager = LinearLayoutManager(this)
        recyclerView.setItemViewCacheSize(100)
        recyclerView.layoutManager = manager
    }
}