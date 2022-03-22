package com.example.searchcuisineappliction.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchcuisineappliction.presentation.view_model.DataModel
import com.example.searchcuisineappliction.R
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.presentation.adapters.PreviewReciepeAdapter
import com.example.searchcuisineappliction.databinding.FragmentFoodListBinding
import com.example.searchcuisineappliction.domain.listener.FavoriteRecipeOnClickListener
import com.example.searchcuisineappliction.domain.model.FavoriteFoodModel
import com.example.searchcuisineappliction.domain.usecases.CreateFavoriteFoodUseCase
import com.example.searchcuisineappliction.domain.usecases.GetFoodListUseCase
import com.example.searchcuisineappliction.presentation.factory.FoodListViewModelFactory
import com.example.searchcuisineappliction.presentation.factory.GroceryListViewModelFactory
import com.example.searchcuisineappliction.presentation.view_model.FoodListViewModel
import com.example.searchcuisineappliction.presentation.view_model.GroceryListViewModel

class FoodListFragment : Fragment() {

    lateinit var specialFoodList: MutableList<String>
    lateinit var collectedIngredients: MutableList<String>
    lateinit var choseCountrys: MutableList<String>
    private lateinit var viewModelFoodList: FoodListViewModel
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentFoodListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodListBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.collectedIngredientsForFoodListFragment.observe(activity as LifecycleOwner, {
            collectedIngredients = it
        })
        dataModel.choseCountrysForFoodListFragment.observe(activity as LifecycleOwner, {
            choseCountrys = it
        })

        viewModelFoodList =
            ViewModelProvider(this, FoodListViewModelFactory(this.requireContext(), choseCountrys = choseCountrys, collectedIngredients =
            collectedIngredients)).get(
                FoodListViewModel::class.java
            )
        viewModelFoodList.getFoodListUseCase.execute()

        val linearLayoutManager = LinearLayoutManager(context?.applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.previewReciepeRV.layoutManager = linearLayoutManager

        binding.previewReciepeRV.adapter = viewModelFoodList.adapter
        binding.foodListFragment = this

        binding.cookButton.setOnClickListener { view: View ->
            dataModel.choseRecipeForRecipeFragment.value =
                viewModelFoodList.getFoodListUseCase.finalDishList
            dataModel.titleForRecipeFragment.value = viewModelFoodList.favoriteRecipe
            Navigation.findNavController(view)
                .navigate(R.id.action_foodListFragment_to_recipeFragment)
        }
    }
}
