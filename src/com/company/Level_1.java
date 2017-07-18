package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;

/**
 * Created by sam.richard on 7/18/2017.
 */
public class Level_1 extends GameLevel{

    @Override
    public void create() {
        GameObject player1 = new Player1();
        ObjectManager.addGameObject(player1);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float arg0) {

    }

    @Override
    public void uninitialize() {

    }
}
