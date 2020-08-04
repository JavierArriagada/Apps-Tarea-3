package com.curso.myapplication

object Tablero {

    class puzzle() {

       var pegs: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3, 4),
                                            intArrayOf(5, 6, 7, 8),
                                            intArrayOf(9, 10, 11, 12),
                                            intArrayOf(13, 14, 15, 16))

        fun left(fila: Int, columna: Int): Unit{
            if(columna > 1 &&  pegs[fila][columna] == 1 && pegs[fila][columna-2]== 0 && pegs[fila][columna-1]== 1){

                pegs[fila][columna]= 0
                pegs[fila][columna-1]= 0
                pegs[fila][columna-2]= 1

            }else{
                //println("No es posible mover ficha")
            }

        }
        fun right(fila: Int, columna: Int): Unit {

            if(columna < 5 &&  pegs[fila][columna] == 1 && pegs[fila][columna+2]== 0 && pegs[fila][columna+1]== 1){

                pegs[fila][columna]= 0
                pegs[fila][columna+1]= 0
                pegs[fila][columna+2]= 1

            }else{
                //println("No es posible mover ficha")
            }
        }
        fun up(fila: Int, columna: Int): Unit {



            if(fila > 1 &&  pegs[fila][columna] == 1 && pegs[fila-1][columna]== 1 && pegs[fila-2][columna]== 0){

                pegs[fila][columna]= 0
                pegs[fila-1][columna]= 0
                pegs[fila-2][columna]= 1


            }else{
                //println("No es posible mover ficha")
            }
        }
        fun down(fila: Int, columna: Int): Unit {



            if(fila < 5 &&  pegs[fila][columna] == 1 && pegs[fila+1][columna]== 1 && pegs[fila+2][columna]== 0){

                pegs[fila][columna]= 0
                pegs[fila+1][columna]= 0
                pegs[fila+2][columna]= 1


            }else{
                //println("No es posible mover ficha")
            }
        }
        fun getPeg(): Array<IntArray>{
            return pegs
        }
        init {
            //printTablero()

        }

    }
    class Diamante(){
        var pegsDiamond: Array<IntArray> = arrayOf(intArrayOf(2, 2, 2, 2, 1, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 1, 1, 1, 2, 2, 2),
            intArrayOf(2, 2, 1, 1, 1, 1, 1, 2, 2),
            intArrayOf(2, 1, 1, 1, 1, 1, 1, 1, 2),
            intArrayOf(1, 1, 1, 1, 0, 1, 1, 1, 1),
            intArrayOf(2, 1, 1, 1, 1, 1, 1, 1, 2),
            intArrayOf(2, 2, 1, 1, 1, 1, 1, 2, 2),
            intArrayOf(2, 2, 2, 1, 1, 1, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 1, 2, 2, 2, 2)
        )

        fun left(fila: Int, columna: Int): Unit{
            if(columna > 1 &&  pegsDiamond[fila][columna] == 1 && pegsDiamond[fila][columna-2]== 0 && pegsDiamond[fila][columna-1]== 1){

                pegsDiamond[fila][columna]= 0
                pegsDiamond[fila][columna-1]= 0
                pegsDiamond[fila][columna-2]= 1

            }else{
                //println("No es posible mover ficha")
            }

        }
        fun right(fila: Int, columna: Int): Unit {

            if(columna < 7 &&  pegsDiamond[fila][columna] == 1 && pegsDiamond[fila][columna+2]== 0 && pegsDiamond[fila][columna+1]== 1){

                pegsDiamond[fila][columna]= 0
                pegsDiamond[fila][columna+1]= 0
                pegsDiamond[fila][columna+2]= 1

            }else{
                //println("No es posible mover ficha")
            }
        }
        fun up(fila: Int, columna: Int): Unit {



            if(fila > 1 &&  pegsDiamond[fila][columna] == 1 && pegsDiamond[fila-1][columna]== 1 && pegsDiamond[fila-2][columna]== 0){

                pegsDiamond[fila][columna]= 0
                pegsDiamond[fila-1][columna]= 0
                pegsDiamond[fila-2][columna]= 1


            }else{
                //println("No es posible mover ficha")
            }
        }
        fun down(fila: Int, columna: Int): Unit {



            if(fila < 7 &&  pegsDiamond[fila][columna] == 1 && pegsDiamond[fila+1][columna]== 1 && pegsDiamond[fila+2][columna]== 0){

                pegsDiamond[fila][columna]= 0
                pegsDiamond[fila+1][columna]= 0
                pegsDiamond[fila+2][columna]= 1


            }else{
                //println("No es posible mover ficha")
            }
        }
        fun getPeg(): Array<IntArray>{
            return pegsDiamond
        }
        init {
            //printTablero()

        }
    }

}