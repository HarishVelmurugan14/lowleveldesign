package aa102_TicTacToe.strategies;

import aa102_TicTacToe.models.Board;
import aa102_TicTacToe.models.Move;

public interface WinningStrategy
{
    boolean checkWinner(Board board, Move move);
    void handleUndo(Move move);
}
