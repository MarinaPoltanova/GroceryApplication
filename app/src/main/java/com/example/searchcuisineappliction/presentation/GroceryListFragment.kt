package com.example.searchcuisineappliction.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchcuisineappliction.presentation.view_model.DataModel
import com.example.searchcuisineappliction.R
import com.example.searchcuisineappliction.databinding.FragmentGroceryListBinding
import com.example.searchcuisineappliction.presentation.factory.GroceryListViewModelFactory
import com.example.searchcuisineappliction.presentation.view_model.GroceryListViewModel

class GroceryListFragment : Fragment() {

    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentGroceryListBinding

    private lateinit var viewModelGroceryList: GroceryListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGroceryListBinding.inflate(inflater)

        val linearLayoutManager = LinearLayoutManager(context?.applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.checkboxRV.layoutManager = linearLayoutManager

        viewModelGroceryList =
            ViewModelProvider(this, GroceryListViewModelFactory(this.requireContext())).get(
                GroceryListViewModel::class.java
            )

        binding.checkboxRV.adapter = viewModelGroceryList.adapter
        binding.groceryListFragment = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.searchButton.setOnClickListener { view: View ->
            if (viewModelGroceryList.collectedIngredientsResult.isNotEmpty()) {
                dataModel.collectedIngredientsForFoodListFragment.value =
                    viewModelGroceryList.collectedIngredientsResult
                Navigation.findNavController(view)
                    .navigate(R.id.action_groceryListFragment_to_countriesListFragment)
            } else {
                val choseCheckBoxToast =
                    Toast.makeText(context, "Не выбраны продукты", Toast.LENGTH_SHORT)
                choseCheckBoxToast.show()
            }
        }
    }
}

