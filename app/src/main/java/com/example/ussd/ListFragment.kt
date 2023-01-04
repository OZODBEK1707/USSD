package com.example.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ussd.adapters.RvClick
import com.example.ussd.adapters.TempAdapter
import com.example.ussd.databinding.FragmentListBinding
import com.example.ussd.models.MyTemplate
import com.example.ussd.utils.MyData

class ListFragment : Fragment(), RvClick {
    private lateinit var binding: FragmentListBinding
    private lateinit var tempAdapter: TempAdapter
    var key = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)

        key = arguments?.getInt("key", 0,)!!

            when(key){
                0 -> showTemp(MyData.listTarif)
                1 -> showTemp(MyData.listDaqiqa)
                2 -> showTemp(MyData.listInternet)
                3 -> showTemp(MyData.listXizmat)
                4 -> showTemp(MyData.listSms)
            }

        return binding.root
    }
    private fun showTemp(list: List<MyTemplate>){
        tempAdapter = TempAdapter(list, this)
        binding.rvList.adapter = tempAdapter
    }

    override fun itemClick(myTemplate: MyTemplate) {
        findNavController().navigate(R.id.aboutFragment, bundleOf("keyTemp" to myTemplate))
    }

}