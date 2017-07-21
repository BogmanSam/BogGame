package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.PFRandom;

import java.awt.event.KeyEvent;
import java.util.Random;
//import edu.digipen.graphics.Graphics;
import edu.digipen.graphics.Graphics;

/**
 * Created by sam.richard on 7/18/2017.
 */
public class Level_2 extends GameLevel{
    float getRandomValue(float min, float max)
    {
        Random r= new Random();
        return r.nextFloat() * (max-min) +  min;
    }


    @Override
    public void create() {
        System.out.println("You winner");
        GameObject wonText = new GameObject("lolWin", 2000, 2000, "Bogman.png");
        ObjectManager.addGameObject(wonText);
        GameObject player_2 = new Player_2();
        ObjectManager.addGameObject(player_2);
        player_2.setPositionY(300);
        player_2.setPositionX(300);

        GameObject enemy = new com.company.Enemy5();
        enemy.setPositionX(getRandomValue(-600,0));
        enemy.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy);
        for(int i= 0; i< 15; ++i)
        {
            enemy = new Enemy5();
            enemy.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy);
        }

        GameObject enemy6;
        enemy.setPositionX(getRandomValue(-600,0));
        enemy.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy);
        for(int i= 0; i< 10; ++i)
        {
            enemy6 = new Enemy6();
            enemy6.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy6);
        }

        GameObject enemy3 = new com.company.Enemy7();
        enemy3.setPositionX(-300);
        enemy3.setPositionY(-300);

        GameObject enemy4 = new com.company.Enemy8();
        ObjectManager.addGameObject(enemy4);


        GameObject Rock2 = new com.company.Rock2();
        Rock2.setPositionX(getRandomValue(-600, 600));
        Rock2.setPositionY(getRandomValue(-600, 600));
        ObjectManager.addGameObject(Rock2);
        //Graphics.setDrawCollisionData(true);
        //Graphics.setCollisionDataColor(0, 1, 0);

        for(int i= 0; i< 40; ++i)
        {
            Rock2 = new Rock2();
            Rock2.setPosition(PFRandom.randomRange(-700, 700), PFRandom.randomRange(-700, 700));
            ObjectManager.addGameObject(Rock2);

        }




    }

    @Override
    public void initialize() {
        //Player_1.enemyCounter=0;
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
