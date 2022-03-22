package com.example.searchcuisineappliction.domain.model

class RecipeItem {
    var ingredientMap : Map<String, String>

    var stepsMap : Map<String, String>

    constructor(ingredientMap : Map<String, String>, stepsMap : Map<String, String>){
        this.ingredientMap=ingredientMap
        this.stepsMap=stepsMap
    }
}