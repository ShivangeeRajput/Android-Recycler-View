package com.example.androidrec

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter constructor(
    private val getActivity: MainActivity,
    private val movieList: List<Movie>):
    RecyclerView.Adapter<RVAdapter.MyViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.movie_list_item,parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tvMovieTitle.text = movieList[position].title
        holder.ivMovieImage.setImageResource(movieList[position].image)

        holder.CardView.setOnClickListener {
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(itemView:View):  RecyclerView.ViewHolder(itemView) {

        val tvMovieTitle :TextView=itemView.findViewById(R.id.tvMovieTitle)
        val ivMovieImage:ImageView=itemView.findViewById(R.id.ivMovie)
        val CardView:CardView=itemView.findViewById(R.id.cardview)

    }


}