package com.example.searchcuisineappliction.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.searchcuisineappliction.presentation.view_model.DataModel
import com.example.searchcuisineappliction.R
import com.example.searchcuisineappliction.data.repository.RecipeRepositoryImpl
import com.example.searchcuisineappliction.databinding.FragmentCountriesListBinding
import com.example.searchcuisineappliction.presentation.view_model.CountriesListViewModel

class CountriesListFragment : Fragment() {
    private lateinit var viewModelCountryList: CountriesListViewModel
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentCountriesListBinding
    private val recipeRepository  = RecipeRepositoryImpl()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCountriesListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.firstCuisineButton.setOnClickListener { view: View ->
            dataModel.choseCountrysForFoodListFragment.value = recipeRepository.getCountryItaly().countryFood
            Navigation.findNavController(view)
                .navigate(R.id.action_countriesListFragment_to_foodListFragment)
        }

        binding.secondCuisineButton.setOnClickListener { view: View ->
            dataModel.choseCountrysForFoodListFragment.value = recipeRepository.getCountryUkrine().countryFood
            Navigation.findNavController(view)
                .navigate(R.id.action_countriesListFragment_to_foodListFragment)
        }

        binding.thirdCuisineButton.setOnClickListener { view: View ->
            dataModel.choseCountrysForFoodListFragment.value = recipeRepository.getCountryArmeny().countryFood
            Navigation.findNavController(view)
                .navigate(R.id.action_countriesListFragment_to_foodListFragment)
        }

        binding.forthCuisineButton.setOnClickListener { view: View ->
            dataModel.choseCountrysForFoodListFragment.value = recipeRepository.getCountryAmerica().countryFood
            Navigation.findNavController(view)
                .navigate(R.id.action_countriesListFragment_to_foodListFragment)
        }
        binding.fifthCuisineButton.setOnClickListener { view: View ->
            dataModel.choseCountrysForFoodListFragment.value = recipeRepository.getCountryVengria().countryFood

            Navigation.findNavController(view)
                .navigate(R.id.action_countriesListFragment_to_foodListFragment)
        }
    }
}
