package com.example.dictionnaireapp_iva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.content.Intent
import android.media.MediaPlayer
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var index:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val image = findViewById<ImageView>(R.id.imageView)
        val text = findViewById<TextView>(R.id.textView6)
        val textVideo = findViewById<TextView>(R.id.textView7)
        val button= findViewById<ImageView>(R.id.floatingActionButton)

        index =intent.getIntExtra("index",0)



        if (index==1){
            image.setImageDrawable((getResources().getDrawable(R.drawable.cat_image)))
            text.text=resources.getString(R.string.cat)
            textVideo.setTextColor(resources.getColor(R.color.blued_c))
            textVideo.text="Display video !"
            textVideo.setClickable(true)

            textVideo.setOnClickListener{
                val intent = Intent(this, MainActivity3::class.java)

                startActivity(intent)
            }
            button.setOnClickListener{
                var  sound:MediaPlayer =MediaPlayer.create(this,R.raw.cat_sound)
                sound.start()
            }

        }else if (index==2){
            image.setImageDrawable((getResources().getDrawable(R.drawable.dog_image)))
            text.text=resources.getString(R.string.dog)
            button.setOnClickListener{
                var  sound:MediaPlayer =MediaPlayer.create(this,R.raw.dog_sound)
                sound.start()
            }
        }else if (index==3){
            image.setImageDrawable((getResources().getDrawable(R.drawable.horse_image)))
            text.text=resources.getString(R.string.horse)
            button.setOnClickListener{
                var  sound:MediaPlayer =MediaPlayer.create(this,R.raw.horse_sound)
                sound.start()
            }
        }
        else if (index==4){
            image.setImageDrawable((getResources().getDrawable(R.drawable.raven_image)))
            text.text=resources.getString(R.string.raven)
            button.setOnClickListener{
                var  sound:MediaPlayer =MediaPlayer.create(this,R.raw.raven_sound)
                sound.start()
            }
        }



    }

}
