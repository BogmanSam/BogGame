package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class enemy11 extends GameObject {

    public enemy11()
    {
        super("enemy11", 200, 200, "balded.png");
        setPosition(-800, 800);
        setRectangleCollider (100, 100);




    }



    @Override public void update(float dt)
    {
        GameObject player_3 = ObjectManager.getGameObjectByName("Player_3");
        Vec2 vector = new Vec2();


        vector.setX(player_3.getPositionX() - getPositionX());
        vector.setY(player_3.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 0.3f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);

    }
}


