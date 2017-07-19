package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;

/**
 * Created by sam.richard on 7/18/2017.
 */
import edu.digipen.math.Vec2;
public class Player_1 extends GameObject{
    public Vec2 direction= new Vec2(1.0f,0.0f);
    public Player_1()
    {
        super ("Player_1",28,28,"Omana.png");
        setRectangleCollider(13f,13f);
    }
    private void shoot()
    {



        ObjectManager.addGameObject(new Bullet(direction, getPosition()));
    }

    @ Override
    public void update(float dt)
    {

        float movementSpeed= 3.0f;
        float rotationSpeed= 1.0f;
        float shootingdelay = 0.5f;

        if(InputManager.isPressed(KeyEvent.VK_UP))
        {
            setRotation(0);
            direction.set(0.0f, 1.0f);
            if(Level_1.dtcounter >= shootingdelay)
            {
                System.out.println("Shoot Allowed");
                shoot();
                Level_1.dtcounter = 0;
            }
        }
        if(InputManager.isPressed(KeyEvent.VK_DOWN))
        {
            setRotation(180);
            direction.set(0.0f, -1.0f);
            if(Level_1.dtcounter >= shootingdelay)
            {
                System.out.println("Shoot Allowed");
                shoot();
                Level_1.dtcounter = 0;
            }
        }
        if(InputManager.isPressed(KeyEvent.VK_LEFT))
        {
            setRotation(270);
            direction.set(-1.0f, 0.0f);
            if(Level_1.dtcounter >= shootingdelay)
            {
                System.out.println("Shoot Allowed");
                shoot();
                Level_1.dtcounter = 0;
            }
        }
        if(InputManager.isPressed(KeyEvent.VK_RIGHT))
        {
            setRotation(90);
            direction.set(1.0f, 0.0f);


            boolean haswaited;
            if(Level_1.dtcounter >= shootingdelay)
            {
                System.out.println("Shoot Allowed");
                shoot();
                Level_1.dtcounter = 0;
            }


        }

        if(InputManager.isPressed(KeyEvent.VK_W))
        {
            float y = getPositionY();
            y +=4;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_S))
        {
            float y = getPositionY();
            y +=-4;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_A))
        {
            float x = getPositionX();
            x +=-4;
            setPositionX(x);
        }
        if(InputManager.isPressed(KeyEvent.VK_D))
        {
            float x = getPositionX();
            x +=4;
            setPositionX(x);
        }
    }


    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        if(collidedWith.getName().equals(("Enemy")) || collidedWith.getName().equals(("Enemy2"))  || collidedWith.getName().equals(("Enemy3")) || collidedWith.getName().equals(("Enemy4")))
        {
            GameLevelManager.goToLevel(new Level_1());




        }




    }
}
