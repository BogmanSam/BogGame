package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/19/2017.
 */
public class Enemy3 extends GameObject
{

    public Enemy3()
    {
        super("Enemy3", 200, 200, "balded.png");
        setPosition(-800, 800);
        setRectangleCollider (100, 100);




    }



    @Override public void update(float dt)
    {
        GameObject player_1 = ObjectManager.getGameObjectByName("Player_1");
        Vec2 vector = new Vec2();


        vector.setX(player_1.getPositionX() - getPositionX());
        vector.setY(player_1.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 0.3f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }

}



