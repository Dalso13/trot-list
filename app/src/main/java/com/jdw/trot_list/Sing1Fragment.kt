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


class Sing1Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 네비게이션 화면 전환
        val view = inflater.inflate(R.layout.fragment_sing1, container, false)

        view.findViewById<ImageView>(R.id.img2).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing1Fragment_to_sing2Fragment)
        }

        view.findViewById<ImageView>(R.id.img3).setOnClickListener {
            it.findNavController().navigate(R.id.action_sing1Fragment_to_sing3Fragment)
        }

        // 리스트 띄우기
        val rv = view.findViewById<RecyclerView>(R.id.rv)

        val items = mutableListOf<String>(
            "막걸리 한잔",
            "찐이야",
            "니가 왜 거기서 나와"
        )

        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)



        return view
    }
}