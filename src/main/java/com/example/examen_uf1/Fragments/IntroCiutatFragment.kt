package com.example.examen_uf1.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.examen_uf1.DB.ciutatsDBHelper
import com.example.examen_uf1.R
import com.example.examen_uf1.model.ApiCall
import com.example.examen_uf1.model.ModelApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class IntroCiutatFragment : Fragment() {


    val dbHelper = activity?.let { ciutatsDBHelper(it) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?




    ): View? {
        // Inflate the layout for this fragment
        var view: View= inflater.inflate(R.layout.fragment_intro_ciutat, container, false);

        val nomCiutat : EditText = view.findViewById(R.id.nomCiutat);
        val boton: Button = view.findViewById(R.id.btnGuardar);

        var nomCiutatText: String = nomCiutat.toString();


        val retrofit = Retrofit.Builder()
            .baseUrl("https://openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        boton.setOnClickListener {



        val apiCall = retrofit.create(ApiCall::class.java)
        val call = apiCall.getData(nomCiutatText)

        call?.enqueue(object : Callback<ModelApi?> {
            override fun onResponse(call: Call<ModelApi?>, response: Response<ModelApi?>) {
                if (response.code() !== 200) {
                    Log.i("testApi", "checkConnection")
                    return
                }
                Log.i(
                    "testApi",
                    response.body()?.status + " - " + response.body()?.results?.sunrise
                )
            }

            override fun onFailure(call: Call<ModelApi?>?, t: Throwable?) {
                Toast.makeText(activity, "No se ha encontrado ciudad", Toast.LENGTH_SHORT).show()
            }
        })







    }
        return view;
}
    }


