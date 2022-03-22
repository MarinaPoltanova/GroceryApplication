package com.example.searchcuisineappliction.domain.usecases

import com.example.searchcuisineappliction.domain.model.RecipeItem
import com.example.searchcuisineappliction.domain.repository.RecipeRepository

class GetFoodListUseCase(var collectedIngredients: MutableList<String>, var choseCountrys: MutableList<String>,private val recipeRepository: RecipeRepository) {
    var finalDishList= mutableListOf<RecipeItem>()
    var finalNameList: MutableList<String> = mutableListOf()

    fun execute(){
        var infredietCummons: MutableList<String> = mutableListOf()
        var recipeItems = recipeRepository.getRecipeItems()
        for (collectedIngredient in collectedIngredients) {
            for (countryI in choseCountrys) {
                var i = 0
                for (item in recipeItems) {
                    if (countryI == item.stepsMap.keys.toString()) {
                        infredietCummons.add(i, item.ingredientMap.keys.toString())
                        if (infredietCummons[i].contains(collectedIngredient)) {
                            finalDishList.add(i, item)
                            i++
                        }
                    }
                }
            }
        }
        var i = 0
        for (finalItem in finalDishList) {
            finalNameList.add(i, finalItem.stepsMap.keys.toString())
            i++
        }
    }
}