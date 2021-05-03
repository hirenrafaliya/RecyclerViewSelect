package com.app.recyclerviewselect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_options.*

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val optionsList = mutableListOf<Option>()
        optionsList.add(Option(R.drawable.ic_launcher_background, "Notification Settings"))
        optionsList.add(Option(R.drawable.ic_launcher_background, "Blocked Members"))
        optionsList.add(Option(R.drawable.ic_launcher_background, "Term & Policy"))
        optionsList.add(Option(R.drawable.ic_launcher_background, "Change your password"))
        optionsList.add(Option(R.drawable.ic_launcher_background, "Delete My Account"))

        recyclerView.adapter = OptionsAdapter(optionsList)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}