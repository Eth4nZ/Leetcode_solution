package _794_valid_tic_tac_toe_state

/**
 * Created by eth4 on 9/3/18.
 */

class ValidTicTacToeState {
    fun validTicTacToe(board: Array<String>): Boolean {
        var countX = 0
        var countO = 0
        var fillingX = 0
        var fillingO = 0
        for (i in 0..2) {
            for (j in 0..2){
                if (board[i][j] == 'X') {
                    countX++
                }
                else if (board[i][j] == 'O') {
                    countO++
                }
            }
            if (board[i] == "XXX")
                fillingX++
            if (board[i] == "OOO")
                fillingO++
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X')
                fillingX++
            if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O')
                fillingO++
        }

        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
            fillingX++
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
            fillingX++
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
            fillingO++
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
            fillingO++


        if (countX < countO)
            return false

        if (countO - countX > 1 || countX - countO > 1)
            return false

        if (countO == countX && fillingX >= 1)
            return false

        if (countX - 1 >= countO && fillingO >= 1)
            return false


        return true
    }
}