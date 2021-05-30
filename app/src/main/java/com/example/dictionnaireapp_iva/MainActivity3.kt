package com.example.dictionnaireapp_iva

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var videoView=findViewById<VideoView>(R.id.videoView)
        var videoPath:String="android.resource://$packageName/${R.raw.cat_video}"
        var uri: Uri? = Uri.parse(videoPath)


        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}