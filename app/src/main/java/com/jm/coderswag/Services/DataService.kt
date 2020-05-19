package com.jm.coderswag.Services

import com.jm.coderswag.Model.Category
import com.jm.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )


    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$18", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$28", "hoodie1"),
        Product("Hoodie Red", "$20", "hoodie2"),
        Product("Gray Hoodie", "$28", "hoodie3"),
        Product("Black Hoodie", "$25", "hoodie4")
    )

    val shirts = listOf(
        Product("shirt Black", "$22", "shirt1"),
        Product("shirt Badge Light Gray", "$21", "shirt2"),
        Product("shirt Red", "$30", "shirt3"),
        Product("shirt Hustle", "$27", "shirt4"),
        Product("shirt kickflip studios", "$35", "shirt5")
    )
}