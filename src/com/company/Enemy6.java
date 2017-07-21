package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Enemy6 extends edu.digipen.gameobject.GameObject {
    public Enemy6()
    {
        super("Enemy6", 25, 25, "Logan.png");
        setPosition(200, 200);
        setRectangleCollider(12.5f, 12.5f);

        Player_2.maxEnemies++;


    }
    @Override public void update(float dt)
    {
        GameObject player_2 = ObjectManager.getGameObjectByName("Player_2");
        Vec2 vector = new Vec2();

        vector.setX(player_2.getPositionX() - getPositionX());
        vector.setY(player_2.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 3.3f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }
    boolean dead = false;
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        PhysicsResolution.addContact(this, collidedWith);
        if(dead == false && collidedWith.getName().equals(("Bullet")))
        {
            kill();
            Player_2.enemyCounter++;
            dead = true;






        }


    }
}
