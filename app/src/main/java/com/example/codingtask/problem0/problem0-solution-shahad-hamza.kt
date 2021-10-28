package com.example.codingtask.problem0


fun whereIsMyFood(fridge: Array<String>, item: String): Int {
    if (fridge.contains(item)){
        return fridge.indexOf(item)
    }
    return -1
}


fun main(){
    val fridge = arrayOf("tomato", "banana", "apple", "onion", "cucumber")
    val itemLocation = whereIsMyFood(fridge, "cucumber")
    print(itemLocation)
}