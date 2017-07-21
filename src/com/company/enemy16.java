package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/19/2017.
 */
public class enemy16 extends GameObject
{
    public enemy16()
    {
        super("Enemy4", 60, 60, "EvilRock.png");
        setPosition(PFRandom.randomRange(-500, 500), PFRandom.randomRange(-500, 500));
        setRectangleCollider(30, 30);
        Player_1.maxEnemies++;




    }



    boolean dead = false;
    @Override public void update(float dt)
    {
        GameObject player_1 = ObjectManager.getGameObjectByName("Player_1");
        Vec2 vector = new Vec2();


        vector.setX(player_1.getPositionX() - getPositionX());
        vector.setY(player_1.getPositionY() - getPositionY());
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
            Player_1.enemyCounter++;

            dead = true;




        }


    }
}


