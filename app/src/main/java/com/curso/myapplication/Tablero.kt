package com.curso.myapplication

object Tablero {

    class puzzle() {

       var pegs: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3, 4),
                                            intArrayOf(5, 6, 7, 8),
                                            intArrayOf(9, 10, 11, 12),
                                            intArrayOf(13, 14, 15, 16))

        fun left(fila: Int): Unit{


            var temp1 = pegs[fila][0]
            var temp2 = pegs[fila][1]
            var temp3 = pegs[fila][2]
            var temp4 = pegs[fila][3]

            pegs[fila][0] = temp2
            pegs[fila][1]= temp3
            pegs[fila][2]= temp4
            pegs[fila][3]= temp1


        }
        fun right(fila: Int): Unit {


            var temp1 = pegs[fila][0]
            var temp2 = pegs[fila][1]
            var temp3 = pegs[fila][2]
            var temp4 = pegs[fila][3]

            pegs[fila][0] = temp4
            pegs[fila][1]= temp1
            pegs[fila][2]= temp2
            pegs[fila][3]= temp3


        }
        fun up(columna: Int): Unit {

            var temp1 = pegs[0][columna]
            var temp2 = pegs[1][columna]
            var temp3 = pegs[2][columna]
            var temp4 = pegs[3][columna]

            pegs[0][columna] = temp2
            pegs[1][columna]= temp3
            pegs[2][columna]= temp4
            pegs[3][columna]= temp1



        }
        fun down(columna: Int): Unit {



            var temp1 = pegs[0][columna]
            var temp2 = pegs[1][columna]
            var temp3 = pegs[2][columna]
            var temp4 = pegs[3][columna]

            pegs[0][columna] = temp4
            pegs[1][columna]= temp3
            pegs[2][columna]= temp2
            pegs[3][columna]= temp1


        }
        fun getPeg(): Array<IntArray>{
            return pegs
        }
        init {
            //printTablero()

        }

    }


}