package com.curso.myapplication
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView
// Recibe como argumentos el contexto y el vector de referencias a imagenes a mostrar
class MiAdapter(c: Context, array: Array<Int>) : BaseAdapter() {
    private val miContexto = c
    private val imagenes = array
    // Esta funcion debe retornar un objeto View o un derivado de esta clase
// En este ejemplo, debe crear un objetoImageView conteniendo la imagen a mostrar
    override fun getView(pos: Int, convertView: View?, parent: ViewGroup?): View {
        val iv: ImageView
        if (convertView == null) {
// Para ahorrar tiempo y memoria, si el objeto ImageView ya existe,
// éste se recicla. En caso contrario, se crea uno nuevo
            iv = ImageView(miContexto)
            iv.layoutParams = AbsListView.LayoutParams(175, 175)
            iv.scaleType = ImageView.ScaleType.CENTER_CROP
            iv.setPadding(5, 5, 5, 5)
        } else {
            iv = convertView as ImageView
        }
        iv.setImageResource(imagenes[pos])
        return iv
    }
    // Un adapter DEBE implementar esta función que retorna el numero de elementos
    override fun getCount(): Int {
        return imagenes.size
    }
    // Un adapter DEBE implementar esta función que retorna un elemento dada su posición
    override fun getItem(pos: Int): Any {
        return imagenes[pos]
    }
    // Un adapter DEBE implementar esta función que retorna el número de la fila de
// un elemento dada su posición
    override fun getItemId(pos: Int): Long {
        return pos.toLong()
    }
}