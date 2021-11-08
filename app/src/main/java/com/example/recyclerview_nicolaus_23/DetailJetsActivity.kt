package com.example.recyclerview_nicolaus_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailJetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jets)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val jets = intent.getParcelableExtra<Jets>(MainActivity.INTENT_PARCELABLE)

        val imgJets = findViewById<ImageView>(R.id.img_item_photo)
        val nameJets = findViewById<TextView>(R.id.tv_item_name)
        val descJets = findViewById<TextView>(R.id.tv_item_description)

        imgJets.setImageResource(jets?.imgJets!!)
        nameJets.text = jets.nameJets
        descJets.text = jets.descJets
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}