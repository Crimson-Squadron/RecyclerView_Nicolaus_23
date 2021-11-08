package com.example.recyclerview_nicolaus_23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jetsList = listOf<Jets>(
            Jets(
                R.drawable.wyvern,
                "X-02S Wyvern",
                "The X-02S Wyvern is an evolution of the Erusean-made X-01 Basilisk. Just as its predecessor, the X-02S has variable-geometry wings and has extensive stealth capabilities. It also features an experimental Electromagnetic Launcher at a cost to the aircraft's mobility. Its signature variable wings maintain the aircraft's speed and attack power."
            ),
            Jets(
                R.drawable.phantom,
                "F-4 Phantom",
                "The F-4 Phantom is a tandem two-seat, twin-engine, all-weather, long-range supersonic jet interceptor and fighter-bomber originally developed by McDonnell Aircraft for the United States Navy. Proving highly adaptable, it first entered service with the Navy in 1961 before it was adopted by the United States Marine Corps and the United States Air Force, and by the mid-1960s it had become a major part of their air arms. Phantom production ran from 1958 to 1981 with a total of 5,195 aircraft built, making it the most produced American supersonic military aircraft in history, and cementing its position as an iconic combat aircraft of the Cold War."
            ),
            Jets(
                R.drawable.falcon,
                "F-16 Fighting Falcon",
                "The F-16 Fighting Falcon is a single-engine multirole fighter aircraft originally developed by General Dynamics for the United States Air Force (USAF). Designed as an air superiority day fighter, it evolved into a successful all-weather multirole aircraft. Over 4,600 aircraft have been built since production was approved in 1976. Although no longer being purchased by the U.S. Air Force, improved versions are being built for export customers. In 1993, General Dynamics sold its aircraft manufacturing business to the Lockheed Corporation, which in turn became part of Lockheed Martin after a 1995 merger with Martin Marietta."
            ),
            Jets(
                R.drawable.raptor,
                "F-22 Raptor",
                "The F-22 Raptor is an American single-seat, twin-engine, all-weather stealth tactical fighter aircraft developed for the United States Air Force (USAF). The result of the USAF's Advanced Tactical Fighter (ATF) program, the aircraft was designed primarily as an air superiority fighter, but also has ground attack, electronic warfare, and signal intelligence capabilities. The prime contractor, Lockheed Martin, built most of the F-22's airframe and weapons systems and conducted final assembly, while Boeing provided the wings, aft fuselage, avionics integration, and training systems."
            ),
            Jets(
                R.drawable.nighthawk,
                "F-117 Nighthawk",
                "The F-117 Nighthawk is a semi-retired American single-seat, twin-engine stealth attack aircraft that was developed by Lockheed's secretive Skunk Works division and operated by the United States Air Force (USAF). It was the first operational aircraft to be designed around stealth technology."
            ),
            Jets(
                R.drawable.rafale,
                "Rafale",
                "The Rafale is a French twin-engine, canard delta wing, multirole fighter aircraft designed and built by Dassault Aviation. Equipped with a wide range of weapons, the Rafale is intended to perform air supremacy, interdiction, aerial reconnaissance, ground support, in-depth strike, anti-ship strike and nuclear deterrence missions."
            ),
            Jets(
                R.drawable.gripen,
                "JAS 39 Gripen",
                "The JAS 39 Gripen is a light single-engine multirole fighter aircraft manufactured by the Swedish aerospace company Saab AB. The Gripen has a delta wing and canard configuration with relaxed stability design and fly-by-wire flight controls. Various versions have been built, grouped as A-, C- and E-series. Gripen A- and C-series are powered by the GE F404G engine (previously designated Volvo RM12) and the E-series is powered by the GE F414G engine, and has a top speed of Mach 2. Later aircraft are modified for NATO interoperability standards and air-to-air refuelling."
            ),
            Jets(
                R.drawable.gurevich,
                "MiG-25",
                "The MiG-25 is a supersonic interceptor and reconnaissance aircraft that is among the fastest military aircraft to enter service. Designed by the Soviet Union's Mikoyan-Gurevich bureau, it is one of the few combat aircraft built primarily using stainless steel. It was to be the last plane designed by Mikhail Gurevich, before his retirement."
            ),
            Jets(
                R.drawable.flanker,
                "Su-35",
                "The Su-35 is the designation for two improved derivatives of the Su-27 air-defence fighter. They are single-seat, twin-engine, supermaneuverable aircraft, designed by the Sukhoi Design Bureau and built by the Komsomolsk-on-Amur Aircraft Plant. The type was originally developed by the Soviet Union from the Su-27 and was known as the Su-27M. It incorporated canards and a multi-function radar giving it multi-role capabilities."
            ),
            Jets(
                R.drawable.felon,
                "Su-57",
                "The Su-57 is a single-seat, twin-engine stealth multirole fighter developed by Sukhoi. The aircraft is the product of the PAK FA fighter programme that would form the basis for a family of stealth combat aircraft. Sukhoi's internal designation for the aircraft is T-50. The Su-57 is the first fighter in Russian military service to feature stealth technology."
            ),
            Jets(
                R.drawable.foxhound,
                "MiG-31",
                "The MiG-31 is a supersonic interceptor aircraft that was developed for use by the Soviet Air Forces. The aircraft was designed by the Mikoyan design bureau as a replacement for the earlier MiG-25. the MiG-31 is based on and shares design elements with the MiG-25. The MiG-31 is among the fastest combat jets in the world. It continues to be operated by the Russian Air Force and the Kazakhstan Air Force following the end of the Cold War and the collapse of the Soviet Union in 1991."
            ),
            Jets(
                R.drawable.morgan,
                "ADFX-02 Morgan",
                "The ADFX-02 Morgan was an experimental combat aircraft built by the Belkan owned South Belka Munitions Factory. It was a more advanced variant of the ADFX-01 Morgan, featuring more offensive and defensive capabilities than it's counterpart. The ADFX-02 have an advance Laser Weapon System, Multi-Purpose Burst Missile, and an Electromagnetic Deflection System. it was used during the Belkan War where it was seen to be superior than any of the Osean jets "
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_jets)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = JetsAdaptor(this, jetsList){
            val intent = Intent (this, DetailJetsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}