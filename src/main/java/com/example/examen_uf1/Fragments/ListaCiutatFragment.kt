package com.example.examen_uf1.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_uf1.R
import com.example.examen_uf1.Recycler.RecyclerViewAdapter

class ListaCiutatFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v: View = inflater.inflate(R.layout.fragment_lista_ciutat, container, false)
        var llistat: MutableList<String>  = ArrayList()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_ciutat, container, false)
        var recyclerView: RecyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter : RecyclerViewAdapter = RecyclerViewAdapter(llistat, context);
        recyclerView.adapter = adapter

        recyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        return v;
    }

}


