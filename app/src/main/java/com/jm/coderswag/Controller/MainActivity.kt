package com.jm.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.jm.coderswag.Adapters.CategoryAdapter
import com.jm.coderswag.Model.Category
import com.jm.coderswag.R
import com.jm.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adaptor: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = CategoryAdapter(this,
            DataService.categories)
        categoryListView.adapter = adaptor
    }
}
