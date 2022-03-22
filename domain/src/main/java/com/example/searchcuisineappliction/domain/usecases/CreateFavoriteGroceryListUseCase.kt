package com.example.searchcuisineappliction.domain.usecases

import com.example.searchcuisineappliction.domain.model.CollectedGroceryListModel
import com.example.searchcuisineappliction.domain.repository.RecipeRepository

class CreateFavoriteGroceryListUseCase(private val recipeRepository: RecipeRepository) {

    fun execute(param: CollectedGroceryListModel): Boolean {

        return recipeRepository.setCollectedGroceryList(setParams = param)
    }

}