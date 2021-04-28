package com.app.recyclerviewselect

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.recyclerviewselect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val itemList = ArrayList<Item>()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgUrl="https://images.unsplash.com/photo-1619565403280-edf4706e9f35?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=gaston-golini-flPxTlU8Sxo-unsplash.jpg"

        itemList.add(Item("Richard Collum","Los Angles",imgUrl))
        itemList.add(Item("Mary Phelen","Warmlinster",imgUrl))
        itemList.add(Item("Randall Booth","Brockville",imgUrl))
        itemList.add(Item("Hyun Cain","Binzen",imgUrl))
        itemList.add(Item("Eric Perry","Warninster",imgUrl))
        itemList.add(Item("Janet Rifel","Los Angles",imgUrl))
        itemList.add(Item("Richard Collum","Los Angles",imgUrl))
        itemList.add(Item("Mary Phelen","Warmlinster",imgUrl))
        itemList.add(Item("Randall Booth","Brockville",imgUrl))
        itemList.add(Item("Hyun Cain","Binzen",imgUrl))
        itemList.add(Item("Eric Perry","Warninster",imgUrl))
        itemList.add(Item("Janet Rifel","Los Angles",imgUrl))
        itemList.add(Item("Richard Collum","Los Angles",imgUrl))
        itemList.add(Item("Mary Phelen","Warmlinster",imgUrl))
        itemList.add(Item("Randall Booth","Brockville",imgUrl))
        itemList.add(Item("Hyun Cain","Binzen",imgUrl))
        itemList.add(Item("Eric Perry","Warninster",imgUrl))
        itemList.add(Item("Janet Rifel","Los Angles",imgUrl))

        val adapter = RecyclerAdapter(itemList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}