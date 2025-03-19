package com.jdw.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Sing3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sing3, container, false)

        view.findViewById<ImageView>(R.id.img1).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing3Fragment_to_sing1Fragment)
        }

        view.findViewById<ImageView>(R.id.img2).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing3Fragment_to_sing2Fragment)
        }


        // 리스트 띄우기
        val rv = view.findViewById<RecyclerView>(R.id.rv)

        val items = mutableListOf<String>(
            "진정인가요",
            "가인이어라",
            "무명배우",
            "당신을 만나",
            "진정인가요",
            "가인이어라",
            "무명배우",
            "당신을 만나",
            "진정인가요",
            "가인이어라",
            "무명배우",
            "당신을 만나",
            "진정인가요",
            "가인이어라",
            "무명배우",
            "당신을 만나",
        )

        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        return view
    }


}