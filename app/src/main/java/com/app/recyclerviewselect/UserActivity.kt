package com.app.recyclerviewselect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_options.*

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val userList = mutableListOf<User>()
        userList.add(User(R.drawable.ic_launcher_background, "Blob Smith"))
        userList.add(User(R.drawable.ic_launcher_background, "Blob Smith"))
        userList.add(User(R.drawable.ic_launcher_background, "Blob Smith"))
        userList.add(User(R.drawable.ic_launcher_background, "Blob Smith"))
        userList.add(User(R.drawable.ic_launcher_background, "Blob Smith"))

        recyclerView.adapter = UserAdapter(userList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}