package com.noufal.learnspringframework;

import com.noufal.learnspringframework.game.GameRunner;
import com.noufal.learnspringframework.game.MarioGame;
import com.noufal.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJav {
    public static void main(String[] args) {
        var game = new MarioGame();
//        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(game);
//        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();

    }
}
