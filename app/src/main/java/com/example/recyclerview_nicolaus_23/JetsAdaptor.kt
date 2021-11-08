package com.example.recyclerview_nicolaus_23

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JetsAdaptor(private val context: Context, private val jets: List<Jets>, val listener: (Jets) -> Unit)
    : RecyclerView.Adapter<JetsAdaptor.JetsViewHolder>(){

    class JetsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgJets = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameJets = view.findViewById<TextView>(R.id.tv_item_name)
        val descJets = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(jets: Jets, listener: (Jets) -> Unit){
            imgJets.setImageResource(jets.imgJets)
            nameJets.text = jets.nameJets
            descJets.text = jets.descJets
            itemView.setOnClickListener {
                listener(jets)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JetsViewHolder {
        return JetsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_jets, parent, false)
        )
    }

    override fun onBindViewHolder(holder: JetsViewHolder, position: Int) {
        holder.bindView(jets[position], listener)
    }

    override fun getItemCount(): Int = jets.size
    }

