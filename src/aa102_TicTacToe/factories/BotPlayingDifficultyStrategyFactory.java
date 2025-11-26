package aa102_TicTacToe.factories;

import aa102_TicTacToe.models.BotDifficultyLevel;
import aa102_TicTacToe.strategies.BotDifficultStrategy;
import aa102_TicTacToe.strategies.EasyDifficultStrategy;
import aa102_TicTacToe.strategies.HardDifficultStrategy;
import aa102_TicTacToe.strategies.MediumDifficultStrategy;

public class BotPlayingDifficultyStrategyFactory
{
    public static BotDifficultStrategy
    getBotDifficultStrategyByLevel(BotDifficultyLevel botDifficultyLevel)
    {
        BotDifficultStrategy botDifficultyStrategy;
        if(botDifficultyLevel == BotDifficultyLevel.EASY)
        {
            botDifficultyStrategy = new EasyDifficultStrategy();
        }else if (botDifficultyLevel == BotDifficultyLevel.MEDIUM)
        {
            botDifficultyStrategy = new MediumDifficultStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.HARD) {
            botDifficultyStrategy = new HardDifficultStrategy();
        }else {
            throw new IllegalArgumentException("Invalid botDifficulty level");
        }

        return botDifficultyStrategy;
    }
}
