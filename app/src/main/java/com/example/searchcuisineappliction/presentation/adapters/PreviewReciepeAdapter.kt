package com.example.searchcuisineappliction.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchcuisineappliction.domain.listener.FavoriteRecipeOnClickListener
import com.example.searchcuisineappliction.R

class PreviewReciepeAdapter(
    private val finalNameList: MutableList<String>,
    private val onClickListener: FavoriteRecipeOnClickListener
) :
    RecyclerView.Adapter<PreviewReciepeAdapter.ReciepeHolder>() {
    class ReciepeHolder(view: View) : RecyclerView.ViewHolder(view) {
        val reciepeTV: TextView = view.findViewById<View>(R.id.titleRecipeRadioButton) as TextView
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReciepeHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recipe_preview, parent, false)
        return ReciepeHolder(view)
    }

    override fun onBindViewHolder(holder: ReciepeHolder, position: Int) {
        val titlePreview: String = finalNameList[position]
        holder.reciepeTV.text = titlePreview
        holder.reciepeTV.setOnClickListener { onClickListener.onClicked(titlePreview) }
    }

    override fun getItemCount(): Int {
        return finalNameList.size
    }
}