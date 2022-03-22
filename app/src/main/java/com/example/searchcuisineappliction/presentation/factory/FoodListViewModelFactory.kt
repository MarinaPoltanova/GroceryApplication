package com.example.searchcuisineappliction.presentation.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.domain.usecases.CreateFavoriteFoodUseCase
import com.example.searchcuisineappliction.domain.usecases.GetFoodListUseCase
import com.example.searchcuisineappliction.presentation.view_model.FoodListViewModel

class FoodListViewModelFactory(
    context: Context,
    collectedIngredients: MutableList<String>,
    choseCountrys: MutableList<String>
) : ViewModelProvider.Factory {

    private val recipeRepository = RecipeRepositoryImpl()
    private val createFavoriteFoodUseCase =
        CreateFavoriteFoodUseCase(recipeRepository = recipeRepository)
    private val getFoodListUseCase =
        GetFoodListUseCase(collectedIngredients, choseCountrys, recipeRepository = recipeRepository)

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FoodListViewModel(
            collectedIngredients = mutableListOf(),
            choseCountrys = mutableListOf(),
            getFoodListUseCase = getFoodListUseCase,
            createFavoriteFoodUseCase = createFavoriteFoodUseCase
        ) as T

    }

}