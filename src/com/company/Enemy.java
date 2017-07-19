package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/17/2017.
 */
public class Enemy extends GameObject
{
    public Enemy()
    {
        super("Enemy", 50, 50, "Boognish on Blue.png");
        setPosition(-200, -200);
        setRectangleCollider(25, 25);




    }



    @Override public void update(float dt)
    {
        GameObject player_1 = ObjectManager.getGameObjectByName("Player_1");
        Vec2 vector = new Vec2();


        vector.setX(player_1.getPositionX() - getPositionX());
        vector.setY(player_1.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 1f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        if(collidedWith.getName().equals(("Bullet")) || collidedWith.getName().equals(("Enemy2")))
        {
            kill();





        }


    }
}


