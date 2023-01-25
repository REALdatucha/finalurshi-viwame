package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.fragments.BookInfoFragment


class ReceptebisAdapter(private val booklist:ArrayList<Receptebi>)
    : RecyclerView.Adapter<ReceptebisAdapter.BookViewHolder>(){

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView =itemView.findViewById(R.id.poto)
        val textView: TextView =itemView.findViewById(R.id.textView)
        val agwera : TextView=itemView.findViewById(R.id.agwera)
        val pasi: TextView=itemView.findViewById(R.id.wignispasi)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)

        return BookViewHolder(view)




    }
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val recepti = booklist[position]
        holder.imageView.setImageResource(recepti.image)
        holder.textView.text = recepti.name
        holder.agwera.text=recepti.dec
        holder.pasi.text=recepti.pas



        holder.itemView.setOnClickListener {
            val bundle = Bundle()

            bundle.putString("title", recepti.name)
            bundle.putInt("img", recepti.image)
            bundle.putString("desc",recepti.dec)
            bundle.putString("passi",recepti.pas)


            val fragment  = BookInfoFragment()
            fragment.arguments = bundle

            (holder.itemView.context as FragmentActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, fragment,null)
                .addToBackStack(null)
                .commit()

        }


    }


    override fun getItemCount(): Int {
        return booklist.size

    }



}