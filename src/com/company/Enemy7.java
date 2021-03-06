package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Enemy7 extends GameObject {

    public Enemy7()
    {
        super("Enemy7", 200, 200, "balded.png");
        setPosition(-800, 800);
        setRectangleCollider (100, 100);




    }



    @Override public void update(float dt)
    {
        GameObject player_2 = ObjectManager.getGameObjectByName("Player_2");
        Vec2 vector = new Vec2();


        vector.setX(player_2.getPositionX() - getPositionX());
        vector.setY(player_2.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 0.3f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }
}

