
package com.company;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.PFRandom;

import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Level_3 extends GameLevel {
    float getRandomValue(float min, float max)
    {
        Random r= new Random();
        return r.nextFloat() * (max-min) +  min;
    }


    @Override
    public void create() {
        GameObject enemy9 = new com.company.Enemy9();
        enemy9.setPositionX(getRandomValue(-600,0));
        enemy9.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy9);
        for(int i= 0; i< 9; ++i)
        {
            enemy9 = new Enemy();
            enemy9.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy9);
        }

        GameObject enemy10 = new com.company.enemy10();
        enemy10.setPositionX(getRandomValue(-600,0));
        enemy10.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy9);
        for(int i= 0; i< 9; ++i)
        {
            enemy10 = new enemy10();
            enemy10.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy10);
        }

        GameObject enemy11 = new com.company.enemy11();
        enemy11.setPositionX(-300);
        enemy11.setPositionY(-300);
        ObjectManager.addGameObject(enemy11);
        for(int i= 0; i< 1; ++i)
        {
            enemy11 = new enemy11();
            enemy11.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy11);
        }

        GameObject enemy12 = new com.company.enemy12();
        ObjectManager.addGameObject(enemy12);


        GameObject Rock3 = new com.company.Rock3();
        Rock3.setPositionX(getRandomValue(-600, 600));
        Rock3.setPositionY(getRandomValue(-600, 600));
        ObjectManager.addGameObject(Rock3);
        //Graphics.setDrawCollisionData(true);
        //Graphics.setCollisionDataColor(0, 1, 0);

        for(int i= 0; i< 20; ++i)
        {
            Rock3 = new Rock3();
            Rock3.setPosition(PFRandom.randomRange(-700, 700), PFRandom.randomRange(-700, 700));
            ObjectManager.addGameObject(Rock3);

        }


        System.out.println("You winner");
        GameObject wonText = new GameObject("lolWin", 2000, 2000, "Bogman.png");
        ObjectManager.addGameObject(wonText);
        GameObject player_3 = new Player_3();
        ObjectManager.addGameObject(player_3);
        player_3.setPositionY(300);
        player_3.setPositionX(300);

        GameObject enemy13 = new com.company.enemy13();
        enemy13.setPositionX(getRandomValue(-600,0));
        enemy13.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy13);
        for(int i= 0; i< 9; ++i)
        {
            enemy13 = new enemy13();
            enemy13.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy13);
        }

        GameObject enemy14 = new com.company.enemy14();
        enemy14.setPositionX(getRandomValue(-600,0));
        enemy14.setPositionY(getRandomValue(-600,600));
        ObjectManager.addGameObject(enemy14);
        for(int i= 0; i< 9; ++i)
        {
            enemy14 = new Enemy6();
            enemy14.setPosition(PFRandom.randomRange(-600, 0), PFRandom.randomRange(-600, 600));
            ObjectManager.addGameObject(enemy14);
        }

        GameObject enemy15 = new com.company.enemy15();
        enemy15.setPositionX(-300);
        enemy15.setPositionY(-300);

        GameObject enemy16 = new com.company.enemy16();
        ObjectManager.addGameObject(enemy16);


        GameObject Rock4 = new com.company.Rock4();
        Rock4.setPositionX(getRandomValue(-600, 600));
        Rock4.setPositionY(getRandomValue(-600, 600));
        ObjectManager.addGameObject(Rock4);
        //Graphics.setDrawCollisionData(true);
        //Graphics.setCollisionDataColor(0, 1, 0);

        for(int i= 0; i< 20; ++i)
        {
            Rock4 = new Rock4();
            Rock4.setPosition(PFRandom.randomRange(-700, 700), PFRandom.randomRange(-700, 700));
            ObjectManager.addGameObject(Rock4);

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
