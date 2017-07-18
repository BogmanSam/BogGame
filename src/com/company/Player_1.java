package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by sam.richard on 7/18/2017.
 */
public class Player_1 extends GameObject{
    public Player_1()
    {
        super ("Player_1",38,29,"Omana.png");
        setRectangleCollider(19,14.5f);
    }

    @ Override
    public void update(float dt)
    {

        if(InputManager.isPressed(KeyEvent.VK_UP))
        {
            float y = getPositionY();
            y +=20;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_DOWN))
        {
            float y = getPositionY();
            y +=-20;
            setPositionY(y);
        }
        if(InputManager.isPressed(KeyEvent.VK_LEFT))
        {
            float x = getPositionX();
            x +=-20;
            setPositionX(x);
        }
        if(InputManager.isPressed(KeyEvent.VK_RIGHT))
        {
            float x = getPositionX();
            x +=20;
            setPositionX(x);
        }
    }
}
