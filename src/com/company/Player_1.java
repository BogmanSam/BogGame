package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
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
        super ("Player_1",38,29,"Omana.png");
        setRectangleCollider(19,14.5f);
    }
    private void shoot()
    {


        ObjectManager.addGameObject(new Bullet(direction, getPosition()));
    }

    @ Override
    public void update(float dt)
    {
        if(InputManager.isPressed(KeyEvent.VK_SPACE))
        {
            shoot();
        }
        float movementSpeed= 3.0f;
        float rotationSpeed= 1.0f;

        if(InputManager.isPressed(KeyEvent.VK_W))
        {
            float y = getPositionY();
            y +=10;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_S))
        {
            float y = getPositionY();
            y +=-10;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_A))
        {
            float x = getPositionX();
            x +=-10;
            setPositionX(x);
        }
        if(InputManager.isPressed(KeyEvent.VK_D))
        {
            float x = getPositionX();
            x +=10;
            setPositionX(x);
        }
    }
}
