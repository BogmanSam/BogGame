package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
//import edu.digipen.graphics.Graphics;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.math.PFRandom;

import java.util.Random;

/**
 * Created by sam.richard on 7/18/2017.
 */
public class Level_1 extends GameLevel{
    float getRandomValue(float min, float max)
    {
        Random r= new Random();
        return r.nextFloat() * (max-min) +  min;
    }

    @Override
    public void create() {
        GameObject player_1 = new Player_1();
        ObjectManager.addGameObject(player_1);
        GameObject enemy = new com.company.Enemy();
        ObjectManager.addGameObject(enemy);
        GameObject enemy2 = new com.company.Enemy2();
        ObjectManager.addGameObject(enemy2);
        GameObject Rock = new com.company.Rock();
        Rock.setPositionX(getRandomValue(-600, 600));
        Rock.setPositionY(getRandomValue(-600, 600));
        ObjectManager.addGameObject(Rock);
        Graphics.setDrawCollisionData(true);
        Graphics.setCollisionDataColor(0, 1, 0);

        for(int i= 0; i< 25; ++i)
        {
            Rock = new Rock();
            Rock.setPosition(PFRandom.randomRange(-600, 600), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(Rock);

        }



    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float arg0) {
        PhysicsResolution.resolveContacts(arg0);
    }

    @Override
    public void uninitialize() {

    }
}
