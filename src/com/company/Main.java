package com.company;

import com.company.MainMenu;
import edu.digipen.Game;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.EmptyLevel;

public class Main {

    public static void main(String[] args) {
        Game.initialize(1920, 1080, 60, new MainMenu());

        while(Game.getQuit() == false)
        {
            Game.update();

        }
        Game.destroy();

    }
}
