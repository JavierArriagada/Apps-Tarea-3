package com.curso.myapplication

import android.app.ListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity2 : ListActivity() {

    private var colores = arrayOf(
        "Cruz",
        "Ayuda"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

// setContentView(R.layout.activity_main)
        listAdapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, colores)
    }
    override fun onListItemClick(parent: ListView, v: View, pos: Int, id: Long) {


        /*val c: Int = coloresRGB[pos].toInt()
        parent.getChildAt(pos).setBackgroundColor(c)*/

        if(pos == 0){

            atiendeCruz(v)

        }else if (pos == 1){
            atiendeCreditos(v)
        }

    }

    fun atiendeCruz(view: View) {
        // val i = Intent(this, Main2Activity::class.java)
        val i = Intent("com.curso.myapplication.MainActivity")
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }


    fun atiendeCreditos(view: View) {
        // val i = Intent(this, Main2Activity::class.java)
        val i = Intent("com.curso.myapplication.MainActivity4")
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }
}


