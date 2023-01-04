package com.example.ussd.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussd.databinding.MyItemBinding
import com.example.ussd.models.MyTemplate

class TempAdapter(val list: List<MyTemplate>, val rvClick: RvClick): RecyclerView.Adapter<TempAdapter.Vh>(){



    inner class Vh(var myItemBinding: MyItemBinding): RecyclerView.ViewHolder(myItemBinding.root){
        fun onBind(myTemplate: MyTemplate, position: Int){
            myItemBinding.tvName.text = myTemplate.name
            myItemBinding.tvCode.text = myTemplate.code
            myItemBinding.tvAbout.text = myTemplate.about

            myItemBinding.root.setOnClickListener { rvClick.itemClick(myTemplate) }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
      return Vh(MyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount():Int = list.size
    }

interface RvClick{
    fun itemClick(myTemplate: MyTemplate)
}