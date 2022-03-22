package com.example.searchcuisineappliction.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.searchcuisineappliction.R
import com.example.searchcuisineappliction.databinding.FragmentWelcomeScreenBinding
import com.example.searchcuisineappliction.presentation.view_model.WelcomeScreenViewModel

class WelcomeScreenFragment : Fragment() {
    private lateinit var viewModelWelcomeScreen:WelcomeScreenViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentWelcomeScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_screen, container, false)

        binding.startButton.setOnClickListener{view:View -> Navigation.findNavController(view).navigate(
            R.id.action_welcomeScreenFragment_to_groceryListFragment
        )}

        return binding.root
    }
}