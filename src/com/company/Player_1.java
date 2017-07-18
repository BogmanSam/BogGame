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
