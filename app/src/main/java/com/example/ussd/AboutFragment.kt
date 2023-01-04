package com.example.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussd.databinding.FragmentAboutBinding
import com.example.ussd.models.MyTemplate

class AboutFragment : Fragment() {
    private lateinit var binding: FragmentAboutBinding
    private lateinit var myTemplate: MyTemplate
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(layoutInflater)

        myTemplate = arguments?.getSerializable("keyTemp") as MyTemplate

        binding.apply {
            tvName.text = myTemplate.name
            tvAbout.text = myTemplate.about
        }

        return binding.root
    }


}