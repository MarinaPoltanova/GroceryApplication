package com.example.searchcuisineappliction.domain.repository

import com.example.searchcuisineappliction.domain.model.*

interface RecipeRepository {

    fun getRecipeItems(): MutableList<RecipeItem>

    fun getCountryItaly(): CountryFoodListModel

    fun getCountryUkrine(): CountryFoodListModel

    fun getCountryArmeny(): CountryFoodListModel

    fun getCountryAmerica(): CountryFoodListModel

    fun getCountryVengria(): CountryFoodListModel

    fun getFreeIngredient(): FreeIngredientsModel

    fun setCollectedGroceryList(setParams: CollectedGroceryListModel) :Boolean

    fun setFavoriteFood(setParams : FavoriteFoodModel): Boolean

    fun getRecipeInfo(): FinalRecipeModel
}