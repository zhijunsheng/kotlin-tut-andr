package com.goldenthumb.android.kotlintut

import org.junit.Test

class KotlinSet {

    @Test
    fun testSetOfStrings() {
        val twoNames = setOf("Golden Thumb", "Coder")
        for (name in twoNames) print("$name ")
        print("\n")

        val setOfMutableNames = mutableSetOf<String>()
        setOfMutableNames.add("Canada")
        setOfMutableNames.add("USA")
        setOfMutableNames.add("Canada")
        for (country in setOfMutableNames) print("$country ")
    }

    @Test
    fun testListOfStrings() {
        val listOfMutableNames = mutableListOf<String>()
        listOfMutableNames.add("Canada")
        listOfMutableNames.add("USA")
        listOfMutableNames.add("Canada")
        for (country in listOfMutableNames) print("$country ")
    }
}