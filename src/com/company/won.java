package com.company;

import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;


public class won extends GameLevel {


    @Override
    public void create()
    {
       System.out.println("You winner");
        GameObject startText = new GameObject("lolWin", 500, 500, "wyeye.png");
        ObjectManager.addGameObject(startText);


    }



    @Override
    public void initialize() {

    }

    @Override
    public void update(float dt) {
        if (InputManager.isPressed(KeyEvent.VK_SPACE)) {

            GameLevelManager.goToLevel(new MainMenu());


        }
    }


    @Override
    public void uninitialize() {

    }


}
