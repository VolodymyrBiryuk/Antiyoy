package yio.tro.antiyoy.menu.behaviors.menu_creation;

import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.behaviors.Reaction;
import yio.tro.antiyoy.menu.scenes.Scenes;

public class RbTutorialIndex extends Reaction {


    @Override
    public void reactAction(ButtonYio buttonYio) {
        Scenes.sceneTutorialIndex.create();
    }
}
