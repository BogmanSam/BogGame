package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Enemy8 extends GameObject {

    public Enemy8()
    {
        super("Enemy8", 60, 60, "rok.png");
        setPosition(PFRandom.randomRange(-500, 500), PFRandom.randomRange(-500, 500));
        setRectangleCollider(30, 30);
        Player_2.maxEnemies++;




    }



    boolean dead = false;
    @Override public void update(float dt)
    {
        GameObject player_2 = ObjectManager.getGameObjectByName("Player_2");
        Vec2 vector = new Vec2();


        vector.setX(player_2.getPositionX() - getPositionX());
        vector.setY(player_2.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 0.005f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);


    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        if(dead == false && collidedWith.getName().equals(("Bullet")))
        {
            kill();
            Player_2.enemyCounter++;

            dead = true;




        }


    }
}
