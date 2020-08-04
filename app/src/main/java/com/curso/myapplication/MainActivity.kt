package com.curso.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayDeque

class MainActivity : AppCompatActivity() {

    private fun transformar(inicial: Array<IntArray>): Array<Int> {

        var index = 0
        var newPeg = arrayOf(0,0,0,0,
                            0,0,0,0,
                            0,0,0,0,
                            0,0,0,0)

        var pegs  = inicial

        for (i in pegs.indices) {

            for (j in pegs[i].indices) {

                if (pegs[i][j] == 1) {
                    newPeg[index] = R.drawable.imagen01
                } else if (pegs[i][j] == 2) {
                    newPeg[index] = R.drawable.imagen02

                } else if (pegs[i][j] == 3) {
                    newPeg[index] = R.drawable.imagen03
                }
                else if (pegs[i][j] == 4) {
                    newPeg[index] = R.drawable.imagen04
                }
                else if (pegs[i][j] == 5) {
                    newPeg[index] = R.drawable.imagen05
                }
                else if (pegs[i][j] == 6) {
                    newPeg[index] = R.drawable.imagen06
                }
                else if (pegs[i][j] == 7) {
                    newPeg[index] = R.drawable.imagen07
                }
                else if (pegs[i][j] == 8) {
                    newPeg[index] = R.drawable.imagen08
                }
                else if (pegs[i][j] == 9) {
                    newPeg[index] = R.drawable.imagen09
                }
                else if (pegs[i][j] == 10) {
                    newPeg[index] = R.drawable.imagen10
                }
                else if (pegs[i][j] == 11) {
                    newPeg[index] = R.drawable.imagen11
                }
                else if (pegs[i][j] == 12) {
                    newPeg[index] = R.drawable.imagen12
                }
                else if (pegs[i][j] == 13) {
                    newPeg[index] = R.drawable.imagen13
                }
                else if (pegs[i][j] == 14) {
                    newPeg[index] = R.drawable.imagen14
                }
                else if (pegs[i][j] == 15) {
                    newPeg[index] = R.drawable.imagen15
                }
                else if (pegs[i][j] == 16) {
                    newPeg[index] = R.drawable.imagen16
                }

                index += 1
            }
        }
        return newPeg
    }





    public override fun onCreate(savedInstanceState: Bundle?) {


        //var stack = ArrayDeque<Array<IntArray>>()


        var juego = Tablero.puzzle()

        //stack.push(juego.getPeg())


        var tablero1 = transformar(juego.getPeg())

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val textView: TextView = findViewById(R.id.texto) as TextView
        var contador: String = count.toString()


        textView.setText(contador)

        /*textView.setOnClickListener {
            textView.text = "asdasds"
        }*/

        var gv = findViewById<GridView>(R.id.gridview)

        var adapter = MiAdapter(this, tablero1)
        gv.adapter = adapter

        var listen = 0
        var fila = 0
        var columna = 0
        var firstPos = 0
        //var count=0

        gv.onItemClickListener = AdapterView.OnItemClickListener { parent, v, pos, id ->
            if (listen == 1) {
                fila = firstPos / 4
                columna = firstPos % 4
                   //deberia funcionar haciendo click primero a una casilla y luego a la que este a la derecha, arriba, abajo o izquierda
                if (firstPos == pos + 1) {

                    juego.left(fila)
                    count += 1
                } else if (firstPos == pos - 1) {
                    juego.right(fila)
                    count += 1
                } else if (firstPos == pos - 4) {
                    juego.down(columna)
                    count += 1
                } else if (firstPos == pos + 4) {
                    juego.up(columna)
                    count += 1
                }
                contador = count.toString()
                textView.setText(contador)

                tablero1 = transformar(juego.getPeg())
                adapter = MiAdapter(this, tablero1)
                gv.adapter = adapter

                listen = 0
            } else {
                firstPos = pos

                tablero1 = transformar(juego.getPeg())
                if (tablero1[firstPos] == R.drawable.negro) {
                    tablero1[firstPos] = R.drawable.rojo
                    adapter = MiAdapter(this, tablero1)
                    gv.adapter = adapter
                    listen = 1
                }


            }
        }


    }


}