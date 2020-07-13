package com.example.massiv

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val massiv = arrayOf(4,45,234,234,23)

    var Texmassiv1:TextView?=null
    var Texmassiv2:TextView?=null
    var Texmassiv3:TextView?=null
    var Texmassiv4:TextView?=null
    var Texmassiv5:TextView?=null

    var Edmassiv1: EditText?=null
    var Edmassiv2: EditText?=null
    var Edmassiv3: EditText?=null
    var Edmassiv4: EditText?=null
    var Edmassiv5:EditText?=null
    var update:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initClicks()



        Edmassiv1?.setText(massiv[0].toString())
        Edmassiv2?.setText(massiv[1].toString())
        Edmassiv3?.setText(massiv[2].toString())
        Edmassiv4?.setText(massiv[3].toString())
        Edmassiv5?.setText(massiv[4].toString())



        val d=4
        val p =3.14
        val c= d*p

        Texmassiv1?.text= c.toString()


        val d1=45
        val p1=3.14
        val c1 =d1*p1

        Texmassiv2?.text= c1.toString()

        val d2 =234
        val p2 = 3.14
        val c2 = d2*p2
        Texmassiv3?.text= c2.toString()

        val d3 = 234
        val p3 =3.14
        val c3 = d3*p3
        Texmassiv4?.text=c3.toString()

        val d4 =23
        val p4 =3.14
        val c4 =d4*p4
        Texmassiv5?.text=c4.toString()

    }


    private fun initClicks(){

        val preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)
        update?.setOnClickListener {
            val Edtext=Edmassiv1?.text.toString()
            preference.edit().putString("Edtext",Edtext).apply()
            preference.edit().putString("texmassiv1",Texmassiv1?.text.toString()).apply()

            val Edtext2 = Edmassiv2?.text.toString()
            preference.edit().putString("Edtext1",Edtext2).apply()
            preference.edit().putString("Texmassiv2",Texmassiv2?.text.toString()).apply()

            val Edtext3 = Edmassiv3?.text.toString()
            preference.edit().putString("Edtext3",Edtext3).apply()
            preference.edit().putString("Texmassiv3",Texmassiv3?.text.toString()).apply()

            val Edtext4 = Edmassiv4?.text.toString()
            preference.edit().putString("Edtext4",Edtext4).apply()
            preference.edit().putString("Texmassiv4",Texmassiv4?.text.toString()).apply()

            val Edtext5 = Edmassiv5?.text.toString()
            preference.edit().putString("Edtext5",Edtext5).apply()
            preference.edit().putString("Texmassiv5",Texmassiv5?.text.toString()).apply()

        }

    }


    private fun initView(){
         Texmassiv1 =findViewById<TextView>(R.id.Texmassiv1)
         Texmassiv2 = findViewById<TextView>(R.id.Texmassiv2)
         Texmassiv3 = findViewById<TextView>(R.id.Texmassiv3)
         Texmassiv4 = findViewById<TextView>(R.id.Texmassiv4)
         Texmassiv5 = findViewById<TextView>(R.id.Texmassiv5)

        val update = findViewById<Button>(R.id.update)

        Edmassiv1 = findViewById<EditText>(R.id.Edmassiv1)
        Edmassiv2 = findViewById<EditText>(R.id.Edmassiv2)
         Edmassiv3 =findViewById<EditText>(R.id.Edmassiv3)
         Edmassiv4 = findViewById<EditText>(R.id.Edmassiv4)
         Edmassiv5 = findViewById<EditText>(R.id.Edmassiv5)


    }

}




