package aa102_TicTacToe.strategies;

import aa102_TicTacToe.models.Board;
import aa102_TicTacToe.models.Move;
import aa102_TicTacToe.models.Player;

public interface BotDifficultStrategy
{
    Move makeMove(Board board, Player player);
}
