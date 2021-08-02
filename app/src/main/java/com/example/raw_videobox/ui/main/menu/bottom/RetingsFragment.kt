package com.example.raw_videobox.ui.main.menu.bottom

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.raw_videobox.R

class RetingsFragment : Fragment() {

    companion object {
        fun newInstance() = RetingsFragment()
    }

    private lateinit var viewModel: RetingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.retings_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RetingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}