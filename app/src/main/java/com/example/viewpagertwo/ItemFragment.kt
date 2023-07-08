package com.example.viewpagertwo

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagertwo.databinding.ItemHolderBinding

class ItemFragment: Fragment() {
    private lateinit var binding: ItemHolderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ItemHolderBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupData()
    }

    private fun setupData() {
        binding.label.text = getString(R.string.app_name)

        val color = arguments?.getString("color")
        binding.root.setBackgroundColor(Color.parseColor(color))

        val position = arguments?.getString("label")
        binding.label.text = position
    }

}