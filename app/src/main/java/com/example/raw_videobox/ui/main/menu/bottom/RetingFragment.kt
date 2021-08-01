package com.example.raw_videobox.ui.main.menu.bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.raw_videobox.R
import com.example.raw_videobox.databinding.MainFragmentBinding

class RetingFragment : Fragment() {
    private var _binding: MainFragmentBinding? = null
    private val binding
    get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}