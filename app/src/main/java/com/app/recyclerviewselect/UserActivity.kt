package com.app.recyclerviewselect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val imgUrl="https://images.unsplash.com/photo-1619565403280-edf4706e9f35?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=gaston-golini-flPxTlU8Sxo-unsplash.jpg"

        val userList= mutableListOf<User>()

        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))
        userList.add(User(imgUrl, "Maiaah Jones"," is now following you", "45 mins ago"))

        recyclerView.adapter=UserAdapter(userList)
        recyclerView.layoutManager=LinearLayoutManager(this)

    }
}