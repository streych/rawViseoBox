package com.example.raw_videobox.ui.main.menu.bottom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.utils.widget.MockView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.raw_videobox.databinding.MainFragmentBinding
import com.example.raw_videobox.model.Appstate
import com.example.raw_videobox.model.data.Movie
import com.example.raw_videobox.ui.main.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private var _binding: MainFragmentBinding? = null
    private val binding
    get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getData().observe(viewLifecycleOwner, Observer { a -> renderData(a) })
    }


    private fun renderData(data: Appstate) {
        when (data) {
            is Appstate.Success -> {
                val movieData = data.movieData
                binding.loadingLayout.visibility = View.GONE

                populateData(movieData)
            }
            is Appstate.Loading -> {
                binding.loadingLayout.visibility = View.VISIBLE
            }
            is Appstate.Error -> {
                binding.loadingLayout.visibility = View.GONE
                Snackbar.make(binding.main, "Error connect to database, please check your password", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    private fun populateData(movieData: Movie){
        with(binding){

        }
    }

}