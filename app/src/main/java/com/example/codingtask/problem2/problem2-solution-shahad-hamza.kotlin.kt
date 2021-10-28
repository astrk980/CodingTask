package com.example.codingtask.problem2

fun validateRecipeWithQuantity(fridge: Map<String, Int>, ingredients: Map<String, Int>): Boolean {

    val ingredientsItemNumber = ingredients.count()
    var itemExistsInFridge = 0
    for (i in ingredients){
        for (j in fridge){
            if (i.key == j.key){
                if(i.value <= j.value){
                    itemExistsInFridge++
                }
            }
        }
    }
    if (itemExistsInFridge == ingredientsItemNumber){
        return true
    }
    return false
}


fun main(){
    val fridge = mapOf("tomato" to 10, "onion" to 3, "onion" to 1)
    val ingredients:Map<String, Int> = mapOf("tomato" to 10)
    val isIngredientsQuantityExists = validateRecipeWithQuantity(fridge, ingredients)
    print(isIngredientsQuantityExists)
}