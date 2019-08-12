package com.example.galleryapp

import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        var imageList = arrayOfNulls<ImageView>(12)
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //take args, add to list
    fun addImageToList(image: Int) {
        val newIV = ImageView(this)

    }

        addImageToList(R.drawable.abstract_abstract_expressionism_art_2505693)
        addImageToList(R.drawable.adventure_automobile_classic_2533092)
        addImageToList(R.drawable.aerial_photography_aerial_shot_aerial_view_2583847)
        addImageToList(R.drawable.afterglow_beach_cliff_2555285)
        addImageToList(R.drawable.alley_architecture_buildings_2526517)
        addImageToList(R.drawable.architectural_design_architecture_bridge_2540653)
        addImageToList(R.drawable.beautiful_breathtaking_canada_day_2526105)
        addImageToList(R.drawable.bloom_blossom_flora_2567011)
        addImageToList(R.drawable.close_up_colorful_colors_2529148)
        addImageToList(R.drawable.clouds_coconut_trees_daylight_2486168)
        addImageToList(R.drawable.colorful_colourful_houses_2501965)
        addImageToList(R.drawable.wallpaper_astronomy_astrophotography_2538107)

        imageList.forEach{
            it.layoutParams=layoutParams
            it.adjustViewBounds= true
            it.setPadding(2)
            if ()
                ll_right_column.addView(it)
            else
                ll_left_column.addView(it)
        }

        }
    }
}
