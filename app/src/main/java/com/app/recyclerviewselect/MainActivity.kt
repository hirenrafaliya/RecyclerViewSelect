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

        itemList.add(Item("qweeeeeeeeeeasd"))
        itemList.add(Item("qweeesdfsdfeeeeeeeasd"))
        itemList.add(Item("qweeeeeeeeezxzceasd"))
        itemList.add(Item("qweeeeeeeeeeasxczd"))
        itemList.add(Item("qweeeeeeeeeeasxcvxd"))
        itemList.add(Item("qweeeeeesdfeeeeasd"))
        itemList.add(Item("qweeeeeeeenceeasd"))
        itemList.add(Item("qweeeeeeeeeeasd"))
        itemList.add(Item("qweeeeeeesergfdeeeasd"))
        itemList.add(Item("qweeeeeeeeeeasetrdjyfsd"))

        val adapter = RecyclerAdapter(itemList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.btnClear.setOnClickListener {
            adapter.clearSelectedItems()
        }

        binding.btnGetSelected.setOnClickListener {
            val selectedIndexes = adapter.getALlSelectedIndexes()

            var str=""
            for(ind in selectedIndexes){
                str+=itemList[ind].title+"\n"
            }
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        }



    }
}