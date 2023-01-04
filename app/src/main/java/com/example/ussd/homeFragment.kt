package com.example.ussd

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ussd.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {
            tariflar.setOnClickListener {
                findNavControl(0)
            }
            daqiqalar.setOnClickListener {
                findNavControl(1)
            }
            internet.setOnClickListener {
                findNavControl(2)
            }
            xizmatlar.setOnClickListener {
                findNavControl(3)
            }
            sms.setOnClickListener {
                findNavControl(4)
            }
            yangiliklar.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://beeline.uz/uz")))
            }
        }

        return binding.root
    }
    private fun findNavControl(code: Int){
        findNavController().navigate(R.id.listFragment, bundleOf("key" to code))
    }
}
