package com.jm.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.jm.coderswag.Model.Category
import com.jm.coderswag.R
import com.jm.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adaptor: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        categoryListView.adapter = adaptor
    }
}
