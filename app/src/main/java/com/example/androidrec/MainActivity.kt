package com.example.androidrec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var RecyclerView:RecyclerView? = null
    private var rvAdapter:RVAdapter? = null
    private var movieList= mutableListOf<Movie>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList= ArrayList()
        RecyclerView= findViewById<View>(R.id.rvMovie) as RecyclerView
        rvAdapter= RVAdapter(this@MainActivity,movieList)

        val layoutManager : RecyclerView.LayoutManager= GridLayoutManager(this,3)
        RecyclerView!!.layoutManager= layoutManager
        RecyclerView!!.adapter=rvAdapter

        prepareMovieListData()

    }

    private fun prepareMovieListData() {
        var movie=Movie("Barbie",R.drawable.bar)
        movieList.add(movie)

         movie=Movie("Doctor Strange",R.drawable.doc)
         movieList.add(movie)

         movie=Movie("Thor",R.drawable.thor)
         movieList.add(movie)

         movie=Movie("Harry Potter",R.drawable.harry)
         movieList.add(movie)

         movie=Movie("Openheimer",R.drawable.open)
         movieList.add(movie)
        movie=Movie("Spiderman",R.drawable.spidy)
        movieList.add(movie)
        movie=Movie("Venom",R.drawable.venom)
        movieList.add(movie)

    }
}