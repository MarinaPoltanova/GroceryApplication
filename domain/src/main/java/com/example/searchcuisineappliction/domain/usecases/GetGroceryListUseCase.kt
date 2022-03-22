package com.example.searchcuisineappliction.domain.usecases

import com.example.searchcuisineappliction.domain.model.FreeIngredientsModel
import com.example.searchcuisineappliction.domain.repository.RecipeRepository

public class GetGroceryListUseCase(private val recipeRepository: RecipeRepository) {
    var ingredientFullList = mutableListOf<String>()
    lateinit var ingredientItem: MutableList<String>
    private var recips = recipeRepository.getRecipeItems()

    fun execute(): FreeIngredientsModel {
        var index = 0
        for (item in recips) {
            var chosenFoodList: MutableList<String> =
                recips[index].ingredientMap.keys.take(2).toMutableList()
            index++
            ingredientFullList += chosenFoodList
        }
        ingredientItem = ingredientFullList.distinct().toMutableList()
        return FreeIngredientsModel(ingredientItem)
    }
}