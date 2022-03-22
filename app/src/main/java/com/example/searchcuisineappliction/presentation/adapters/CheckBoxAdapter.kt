package com.example.searchcuisineappliction.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchcuisineappliction.domain.listener.FavoriteFoodOnClickListener
import com.example.searchcuisineappliction.R

class CheckBoxAdapter(private val checkBoxs: MutableList<String>, private val onClickListener: FavoriteFoodOnClickListener) :
    RecyclerView.Adapter<CheckBoxAdapter.CheckBoxHolder>() {

    class CheckBoxHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textTV: TextView = view.findViewById<View>(R.id.textViewItem) as TextView
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CheckBoxHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.check_box_item, parent, false)
        return CheckBoxHolder(view)
    }

    override fun onBindViewHolder(holder: CheckBoxHolder, position: Int) {
        val checkBox: String = checkBoxs[position]
        holder.textTV.text = checkBox
        holder.textTV.setOnClickListener{onClickListener.onClicked(checkBox)}
    }

    override fun getItemCount(): Int {
        return checkBoxs.size
    }
}