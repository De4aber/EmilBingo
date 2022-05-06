package com.de4aber.emilbingo

import androidx.lifecycle.ViewModel

class BoardViewModel: ViewModel() {

    var tiles = mutableListOf<BingoTile>()
    var rowAmount = 5
    var colAmount = 5

    init {
        createBoardFields()
    }

    var list = listOf("Dyb stemme","Pive stemme","2 Hænder foran øjne","1 Hånd foran øjne","2 Hænder i hår","1 Hånd i hår","Tomat ansigt","Siger noget dumt","\"Jeg smelter\"","\"Nej men prøv lige at hør\"","Misser i beer pong","Ironien faktisk er på plads","Laver en reel god joke","Lyver i Meyer","Rammer i beer pong","Tager et shot","Drikker 1 øl","\"Økosystem\"","Flirter med en pige","Snakker for at undgå stilhed","\"Du nedern\"","\"Du pinlig\"","\"Det ironi\"","Laver en \"Joke\"").toMutableList()


    fun createBoardFields() {
        tiles.clear()

        var i = 0
        while (i < rowAmount) {
            var j = 0
            while (j < colAmount) {
                tiles.add(BingoTile(i, j))
                j++
            }
            i++
        }
    }

}
