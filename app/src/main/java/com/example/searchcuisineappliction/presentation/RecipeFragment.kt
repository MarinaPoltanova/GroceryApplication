package com.example.searchcuisineappliction.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.presentation.view_model.DataModel
import com.example.searchcuisineappliction.domain.model.RecipeItem
import com.example.searchcuisineappliction.databinding.FragmentRecipeBinding
import com.example.searchcuisineappliction.domain.usecases.GetRecipeInfoUseCase

class RecipeFragment : Fragment() {

    lateinit var binding: FragmentRecipeBinding
    lateinit var finalDishList: MutableList<RecipeItem>
    lateinit var favoriteRecipe: String
    private val dataModel: DataModel by activityViewModels()

    private val recipeRepository = RecipeRepositoryImpl()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataModel.choseRecipeForRecipeFragment.observe(activity as LifecycleOwner, {
            finalDishList = it
        })
        dataModel.titleForRecipeFragment.observe(activity as LifecycleOwner, {
            favoriteRecipe = it
            binding.titleRecipeTextView.text = favoriteRecipe
        })

        val getRecipeInfoUseCase =
            GetRecipeInfoUseCase(finalDishList, favoriteRecipe, recipeRepository = recipeRepository)
        getRecipeInfoUseCase.execute()
        binding.ingredientsTextView.text = getRecipeInfoUseCase.execute().ingredients
        binding.stepsTextView.text = getRecipeInfoUseCase.execute().description

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecipeBinding.inflate(inflater)
        binding.recipeFragment = this
        return binding.root
    }

}

