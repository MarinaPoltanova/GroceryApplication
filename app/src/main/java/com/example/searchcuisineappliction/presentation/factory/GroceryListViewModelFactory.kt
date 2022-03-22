package com.example.searchcuisineappliction.presentation.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.domain.usecases.CreateFavoriteGroceryListUseCase
import com.example.searchcuisineappliction.domain.usecases.GetGroceryListUseCase
import com.example.searchcuisineappliction.presentation.view_model.GroceryListViewModel

class GroceryListViewModelFactory(context: Context): ViewModelProvider.Factory {

    private val recipeRepository= RecipeRepositoryImpl()
    private val getGroceryListUseCase = GetGroceryListUseCase(recipeRepository = recipeRepository)
    private var createFavoriteGroceryListUseCase = CreateFavoriteGroceryListUseCase(recipeRepository = recipeRepository)

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GroceryListViewModel(
            getGroceryListUseCase = getGroceryListUseCase,
            createFavoriteGroceryListUseCase = createFavoriteGroceryListUseCase
        ) as T
    }
}