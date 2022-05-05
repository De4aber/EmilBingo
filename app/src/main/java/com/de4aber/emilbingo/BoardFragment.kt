package com.de4aber.emilbingo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class BoardFragment : Fragment() {

    private lateinit var boardRecyclerView: RecyclerView
    private var adapter: BoardAdapter? = null


    private val boardViewModel: BoardViewModel by lazy {
        ViewModelProvider(this).get(BoardViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_board, container, false)
        boardRecyclerView = view.findViewById(R.id.board_recycler_view) as RecyclerView
        boardRecyclerView.layoutManager = GridLayoutManager(context, boardViewModel.colAmount)
        boardViewModel.createBoardFields()

        updateUI()


        return view
    }

    private fun updateUI() {
        val boardFields = boardViewModel.tiles
        adapter = BoardAdapter(boardFields)
        boardRecyclerView.adapter = adapter
    }


    fun setupBoard(){
        boardViewModel.createBoardFields()
        boardRecyclerView.layoutManager = GridLayoutManager(context, boardViewModel.colAmount)
        updateUI()
    }

    companion object{
        fun newInstance(): BoardFragment {
            return BoardFragment()
        }
    }

    private inner class BoardHolder(view:View): RecyclerView.ViewHolder(view) {
        val btn : Button = itemView.findViewById(R.id.tile)



        fun bind(bingoTile: BingoTile){
            btn.setBackgroundResource(bingoTile.getImage())
            btn.setOnClickListener { btn.setBackgroundResource(bingoTile.onClicked()) }
            btn.text = bingoTile.text
        }

    }

    private inner class BoardAdapter(var tiles:List<BingoTile>) : RecyclerView.Adapter<BoardHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardHolder {
            val view = layoutInflater.inflate(R.layout.item_bingotile, parent, false)
            return BoardHolder(view)
        }

        override fun getItemCount(): Int {
            return tiles.size
        }

        override fun onBindViewHolder(holder: BoardHolder, position: Int) {
            val tileText = boardViewModel.list
            val boardField = tiles[position]
            boardField.position = position
            if(position == (boardViewModel.tiles.size/2)){
                boardField.text = "gratis"
                holder.apply {
                    btn.setBackgroundResource(boardField.onClicked())
                    btn.text = boardField.text
                }
            }
            else {
                boardField.text = getRandomElement(tileText)
                holder.bind(boardField)
            }
        }
    }
    fun <T> getRandomElement(list: MutableList<T>): T {
        val randomIndex = Random.nextInt(list.size)

        val result = list[randomIndex]
        list.removeAt(randomIndex)
        return result
    }

}