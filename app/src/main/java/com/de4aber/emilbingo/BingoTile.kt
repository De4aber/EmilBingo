package com.de4aber.emilbingo

data class BingoTile (val row:Int, val col: Int ){
    var text: String = "null"
    var isClicked = false
    var position = 0

    fun getImage(): Int {
        return if (isClicked) {
            R.drawable.selected
        } else{
            (R.drawable.tilestyle)
        }
    }

    fun onClicked(): Int{
        isClicked = !isClicked

        return getImage()
    }
}
