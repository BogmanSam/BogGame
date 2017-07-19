package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
//import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;

/**
 * Created by sam.richard on 7/18/2017.
 */
public class Level_1 extends GameLevel{

    @Override
    public void create() {
        GameObject player_1 = new Player_1();
        ObjectManager.addGameObject(player_1);
        GameObject enemy = new com.company.Enemy();
        ObjectManager.addGameObject(enemy);
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
