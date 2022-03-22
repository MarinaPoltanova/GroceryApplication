package com.example.searchcuisineappliction.presentation.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.searchcuisineappliction.domain.model.RecipeItem

open class DataModel : ViewModel(){
    val collectedIngredientsForFoodListFragment: MutableLiveData<MutableList<String>> by lazy{
        MutableLiveData<MutableList<String>>()
    }
    val choseCountrysForFoodListFragment: MutableLiveData<MutableList<String>> by lazy{
        MutableLiveData<MutableList<String>>()
    }
    val choseRecipeForRecipeFragment: MutableLiveData<MutableList<RecipeItem>> by lazy{
        MutableLiveData<MutableList<RecipeItem>>()
    }
    val titleForRecipeFragment: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}