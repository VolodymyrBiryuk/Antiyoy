package yio.tro.antiyoy.menu.behaviors.editor;

import yio.tro.antiyoy.menu.behaviors.Reaction;
import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.scenes.Scenes;

public class RbEditorConfirmClearLevelMenu extends Reaction {

    @Override
    public void reactAction(ButtonYio buttonYio) {
        Scenes.sceneEditorConfirmClear.create();
    }
}
