package com.example.examen_uf1.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_uf1.R

class RecyclerViewAdapter(llistat: MutableList<String>, context: Context?): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var llistat: MutableList<String> = llistat;
    var context: Context? = context;

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_list, parent, false))
    }



    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.txtCiutat.setText(llistat.get(position));
    }

    override fun getItemCount(): Int {
        return llistat.size;

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtCiutat: TextView = view.findViewById(R.id.txtCiutat);
    }



}




