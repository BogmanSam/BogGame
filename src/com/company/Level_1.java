package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
//import edu.digipen.graphics.Graphics;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.PFRandom;

import java.awt.event.KeyEvent;
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
        enemy.setPositionX(getRandomValue(-600,600));
        enemy.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy);

        GameObject enemy2 = new com.company.Enemy2();
        ObjectManager.addGameObject(enemy2);

        GameObject enemy3= new com.company.Enemy3();
        ObjectManager.addGameObject(enemy3);

        GameObject enemy4 = new com.company.Enemy4();
        ObjectManager.addGameObject(enemy4);

        GameObject Rock = new com.company.Rock();
        Rock.setPositionX(getRandomValue(-600, 600));
        Rock.setPositionY(getRandomValue(-600, 600));
        ObjectManager.addGameObject(Rock);
        //Graphics.setDrawCollisionData(true);
        //Graphics.setCollisionDataColor(0, 1, 0);

        for(int i= 0; i< 40; ++i)
        {
            Rock = new Rock();
            Rock.setPosition(PFRandom.randomRange(-700, 700), PFRandom.randomRange(-700, 700));
            ObjectManager.addGameObject(Rock);

        }



    }

    @Override
    public void initialize() {


    }
    public static float dtcounter=0;

    @Override
    public void update(float dt) {
        PhysicsResolution.resolveContacts(dt);
        dtcounter += dt;
        System.out.println(dtcounter);

        if(InputManager.isTriggered(KeyEvent.VK_R))
        {
            GameLevelManager.restartLevel();
        }
    }




    @Override
    public void uninitialize() {

    }
}
