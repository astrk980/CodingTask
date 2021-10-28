package com.example.codingtask.problem1

fun validateRecipe(fridge: Array<String>, ingredients: Array<String>): Boolean {

    val ingredientsItemNumber = ingredients.count()
    var itemExistsInFridge = 0
    for (element in ingredients) {
        if (fridge.contains(element)) {
            itemExistsInFridge++
        }
    }
    if (itemExistsInFridge == ingredientsItemNumber){
        return true
    }
    return false

}

fun main(){
    val fridge = arrayOf("cucumber", "tomato", "apple", "onion")
    val ingredients = arrayOf("tomato", "banana", "apple", "onion", "cucumber")
    val isIngredientsExists = validateRecipe(fridge, ingredients)
    print(isIngredientsExists)
}