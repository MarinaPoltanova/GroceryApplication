package com.example.searchcuisineappliction.presentation.view_model

import androidx.lifecycle.ViewModel
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.domain.listener.FavoriteRecipeOnClickListener
import com.example.searchcuisineappliction.domain.model.FavoriteFoodModel
import com.example.searchcuisineappliction.domain.usecases.CreateFavoriteFoodUseCase
import com.example.searchcuisineappliction.domain.usecases.GetFoodListUseCase
import com.example.searchcuisineappliction.presentation.adapters.PreviewReciepeAdapter

class FoodListViewModel(
    collectedIngredients: MutableList<String>,
    choseCountrys: MutableList<String>,
     val createFavoriteFoodUseCase : CreateFavoriteFoodUseCase,
    val getFoodListUseCase:GetFoodListUseCase
) : ViewModel() {

//    private val recipeRepository = RecipeRepositoryImpl()
//    private val createFavoriteFoodUseCase =
//        CreateFavoriteFoodUseCase(recipeRepository = recipeRepository)
    lateinit var favoriteRecipe: String

//     getFoodListUseCase =
//        GetFoodListUseCase(collectedIngredients, choseCountrys, recipeRepository = recipeRepository)

    val specialFoodList = getFoodListUseCase.finalNameList
    val adapter =
        PreviewReciepeAdapter(specialFoodList, object : FavoriteRecipeOnClickListener {
            override fun onClicked(specialFood: String) {
                favoriteRecipe = specialFood
                var params = FavoriteFoodModel(favoriteFood = favoriteRecipe)
                var result = createFavoriteFoodUseCase.execute(param = params)
            }
        })
}
