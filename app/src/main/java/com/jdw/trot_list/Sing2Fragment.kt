package com.jdw.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Sing2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sing2, container, false)

        view.findViewById<ImageView>(R.id.img1).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing2Fragment_to_sing1Fragment)
        }

        view.findViewById<ImageView>(R.id.img3).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing2Fragment_to_sing3Fragment)
        }


        return view
    }


}