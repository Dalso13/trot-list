package com.jdw.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController


class Sing1Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sing1, container, false)

        view.findViewById<ImageView>(R.id.img2).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing1Fragment_to_sing2Fragment)
        }

        view.findViewById<ImageView>(R.id.img3).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing1Fragment_to_sing3Fragment)
        }

        return view
    }
}