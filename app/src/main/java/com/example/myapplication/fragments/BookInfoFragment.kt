package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.findFragment
import com.example.myapplication.R


class BookInfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_book_info, container, false)
        val imgView= view.findViewById<ImageView>(R.id.imageView)
        val txtV= view.findViewById<TextView>(R.id.textView7)
        val txt5 =view.findViewById<TextView>(R.id.textView8)

        val bundle = this.arguments
        if (bundle != null) {
            val myInt = bundle.getInt("img", 0)
            val myString = bundle.getString("title", "")
            val myDesc = bundle.getString("desc", "")
            val wigni = bundle.getString("passi","")
            imgView.setImageResource(myInt)
            txtV.text = myString
            txt5.text= myDesc
        }



        return view

    }
}

