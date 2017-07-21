package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/19/2017.
 */
public class enemy15 extends GameObject
{

    public enemy15()
    {
        super("Enemy3", 200, 200, "BigBadGuy.png");
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
        float speed = 0.5f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }

}




