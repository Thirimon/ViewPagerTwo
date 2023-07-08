package com.example.viewpagertwo

import android.content.Context
import android.graphics.Color
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagertwo.databinding.ItemHolderBinding

class ViewPageAdapter(
    private val context: Context,
    private val labelList:MutableList<String>,
    private val colorList:MutableList<String>
    ):RecyclerView.Adapter<ViewPageAdapter.ViewPageHolder>(){

    class ViewPageHolder(private val itemHolderBinding:ItemHolderBinding):RecyclerView.ViewHolder(itemHolderBinding.root){
      fun bind(label:String,color:String)
      {
          itemHolderBinding.label.text=label
          itemHolderBinding.root.setBackgroundColor(Color.parseColor(color))
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPageHolder {
        val binding=ItemHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewPageHolder(binding)
    }

    override fun getItemCount(): Int {
       return labelList.size
    }

    override fun onBindViewHolder(holder: ViewPageHolder, position: Int) {
       val text=labelList[position]
       val color=colorList[position]
        holder.bind(text,color)

    }


}