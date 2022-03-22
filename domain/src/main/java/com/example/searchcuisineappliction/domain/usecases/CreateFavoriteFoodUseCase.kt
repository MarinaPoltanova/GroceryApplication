package com.example.searchcuisineappliction.domain.usecases

//import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.domain.model.FavoriteFoodModel
import com.example.searchcuisineappliction.domain.repository.RecipeRepository

class CreateFavoriteFoodUseCase(private val recipeRepository: RecipeRepository) {

    fun execute(param:FavoriteFoodModel): Boolean{
return recipeRepository.setFavoriteFood(setParams = param)

    }
}