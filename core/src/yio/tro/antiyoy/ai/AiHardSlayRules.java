package yio.tro.antiyoy.ai;

import yio.tro.antiyoy.gameplay.GameController;
import yio.tro.antiyoy.gameplay.Unit;

import java.util.ArrayList;


public class AiHardSlayRules extends ArtificialIntelligence {

    public AiHardSlayRules(GameController gameController, int color) {
        super(gameController, color);
    }


    @Override
    public void makeMove() {
        moveUnits();

        spendMoneyAndMergeUnits();

        moveAfkUnits();
    }
}
