package com.example.searchcuisineappliction.presentation.view_model

import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.domain.listener.FavoriteFoodOnClickListener
import com.example.searchcuisineappliction.domain.model.CollectedGroceryListModel
import com.example.searchcuisineappliction.domain.usecases.CreateFavoriteGroceryListUseCase
import com.example.searchcuisineappliction.domain.usecases.GetGroceryListUseCase
import com.example.searchcuisineappliction.presentation.adapters.CheckBoxAdapter

class GroceryListViewModel(
    private val getGroceryListUseCase:GetGroceryListUseCase,
    private val createFavoriteGroceryListUseCase:CreateFavoriteGroceryListUseCase

): ViewModel() {

    var freeIgredientsResult = getGroceryListUseCase.execute().freeIgredients
    var collectedIngredientsResult: MutableList<String> = mutableListOf()

    val adapter = CheckBoxAdapter(freeIgredientsResult, object : FavoriteFoodOnClickListener {
        override fun onClicked(freeIgredient: String) {
            collectedIngredientsResult.add(freeIgredient)
            var params = CollectedGroceryListModel(collectedGroceryList = collectedIngredientsResult)
            var result: Boolean = createFavoriteGroceryListUseCase.execute(param = params)
        }
    })

}