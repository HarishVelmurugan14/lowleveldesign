package aa102_TicTacToe.models;


import aa102_TicTacToe.factories.BotPlayingDifficultyStrategyFactory;
import aa102_TicTacToe.strategies.BotDifficultStrategy;

public class Bot extends Player
{
    private BotDifficultyLevel botDifficultyLevel;
    private BotDifficultStrategy botDifficultStrategy;

    public Bot(int id, String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botDifficultStrategy = BotPlayingDifficultyStrategyFactory.getBotDifficultStrategyByLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board)
    {
        System.out.println("Hey " +this.getName() + ", it's your turn.");
        return botDifficultStrategy.makeMove(board, this);
    }
}
