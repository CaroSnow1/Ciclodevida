package com.example.ciclodevida

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //para agregar musica
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LOGS", "onCreate()")

        //instanciar la musica
        mediaPlayer = MediaPlayer.create(this, R.raw.zeldatok)

        mediaPlayer.start()
    }

    override fun onStart(){
        super.onStart()
        Log.d("LOGS", "onStart()")
    }

    override fun onResume(){
        super.onResume()
        Log.d("LOGS", "onResume()")
    }

    override fun onPause(){
        super.onPause()
        Log.d("LOGS", "onResume()")
        //Para detener el audio
        mediaPlayer.pause()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LOGS", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LOGS", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LOGS", "onRestart()")
        mediaPlayer.start()
    }

}