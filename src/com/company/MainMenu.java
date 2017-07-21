package com.company;

import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;


public class MainMenu extends GameLevel {


    @Override
    public void create()
    {
        GameObject startText = new GameObject("MainBackground", 900, 900, "MainMen.png");
        ObjectManager.addGameObject(startText);

    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float dt) {
        if(InputManager.isPressed(KeyEvent.VK_ESCAPE))
        {
            Game.quit();


        }
        if(InputManager.isPressed(KeyEvent.VK_SPACE))
        {
            GameLevelManager.goToLevel(new Level_1());
        }
        if(InputManager.isPressed(KeyEvent.VK_G))
        {
            GameLevelManager.goToLevel(new com.company.Level_2());
        }



    }

    @Override
    public void uninitialize() {

    }


}
