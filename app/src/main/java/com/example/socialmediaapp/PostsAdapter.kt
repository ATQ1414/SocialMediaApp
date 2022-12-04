package com.example.socialmediaapp


import android.app.Activity
import android.text.style.UpdateAppearance
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.socialmediaapp.databinding.PostRowBinding

class PhotosAdapter(var photoList:ArrayList<PostItemForAdapter>, var adapteractiv : MainActivity):RecyclerView.Adapter<PhotosAdapter.ViewHolder>() {
    class ViewHolder(var binding: PostRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(PostRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photo = photoList[position]
        holder.binding.apply {


        }

    }

    override fun getItemCount(): Int {
        return photoList.size
    }
    fun updateAdapter(newList:ArrayList<PostItemForAdapter>){
        photoList = newList
        notifyDataSetChanged()
    }


}