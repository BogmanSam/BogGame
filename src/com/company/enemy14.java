package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/17/2017.
 */
public class enemy14 extends GameObject
{
    public enemy14()
    {
        super("Enemy2", 25, 25, "SuperCharger.png");
        setPosition(200, 200);
        setRectangleCollider(12.5f, 12.5f);

        Player_3.maxEnemies++;


    }
    @Override public void update(float dt)
    {
        GameObject player_3 = ObjectManager.getGameObjectByName("Player_3");
        Vec2 vector = new Vec2();

        vector.setX(player_3.getPositionX() - getPositionX());
        vector.setY(player_3.getPositionY() - getPositionY());
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
            Player_3.enemyCounter++;
            dead = true;






        }


    }
}

