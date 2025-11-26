package aa102_TicTacToe.strategies;

import aa102_TicTacToe.models.Board;
import aa102_TicTacToe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void handleUndo(Move move) {}
}
