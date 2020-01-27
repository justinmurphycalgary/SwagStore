package ca.hunkydory.swagstore.Services

import ca.hunkydory.swagstore.Model.Category
import ca.hunkydory.swagstore.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "hat1"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "Digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "Digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Toque", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$19", "hat03"),
        Product("Devslopes Hat Snapback", "$15", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$21", "hoodie02"),
        Product("Devslopes Hoodie White", "$19", "hoodie03"),
        Product("Devslopes Hoodie Black", "$16", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes badge light gray", "$20", "shirt02"),
        Product("Devslopes logo Shirt Red", "$19", "shirt03"),
        Product("Devslopes Hustle", "$15", "shirt04"),
        Product("Murphy Studios", "$15", "shirt04")
    )
}