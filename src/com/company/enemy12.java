package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class enemy12 extends GameObject {

    public enemy12()
    {
        super("enemy12", 60, 60, "rok.png");
        setPosition(PFRandom.randomRange(-500, 500), PFRandom.randomRange(-500, 500));
        setRectangleCollider(30, 30);
        Player_3.maxEnemies++;




    }



    boolean dead = false;
    @Override public void update(float dt)
    {
        GameObject player_3 = ObjectManager.getGameObjectByName("Player_3");
        Vec2 vector = new Vec2();


        vector.setX(player_3.getPositionX() - getPositionX());
        vector.setY(player_3.getPositionY() - getPositionY());
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
            Player_3.enemyCounter++;

            dead = true;




        }


    }
}
