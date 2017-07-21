package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;



import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;



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
public class Player_3 extends GameObject {
    public Vec2 direction = new Vec2(1.0f, 0.0f);
    public static int enemyCounter = 0;
    public static int maxEnemies = 0;

    public Player_3() {
        super("Player_3", 28, 28, "omananna.png");
        setRectangleCollider(13f, 13f);
        maxEnemies = 0;
        enemyCounter = 0;
    }

    private void shoot() {

        ObjectManager.addGameObject(new Bullet(direction, getPosition()));
    }

    @Override
    public void update(float dt) {
        System.out.println("currEnemy Count: " + enemyCounter);
        System.out.println("maxEnemy Count: " + maxEnemies);
        if (enemyCounter >= maxEnemies) {
            //do stuff
            GameLevelManager.goToLevel(new won());
        }

        float movementSpeed = 3.0f;
        float rotationSpeed = 1.0f;
        float shootingdelay = 1.15f;

        if (InputManager.isPressed(KeyEvent.VK_UP)) {
            setRotation(0);
            direction.set(0.0f, 1.0f);
            if (Level_3.dtcounter >= shootingdelay) {
                System.out.println("Shoot Allowed");
                shoot();
                Level_3.dtcounter = 0;
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_DOWN)) {
            setRotation(180);
            direction.set(0.0f, -1.0f);
            if (Level_3.dtcounter >= shootingdelay) {
                System.out.println("Shoot Allowed");
                shoot();
                Level_3.dtcounter = 0;
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_LEFT)) {
            setRotation(270);
            direction.set(-1.0f, 0.0f);
            if (Level_3.dtcounter >= shootingdelay) {
                System.out.println("Shoot Allowed");
                shoot();
                Level_3.dtcounter = 0;
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_RIGHT)) {
            setRotation(90);
            direction.set(1.0f, 0.0f);


            boolean haswaited;
            if (Level_3.dtcounter >= shootingdelay) {
                System.out.println("Shoot Allowed");
                shoot();
                Level_3.dtcounter = 0;
            }


        }

        if (InputManager.isPressed(KeyEvent.VK_W)) {
            float y = getPositionY();
            y += 4;
            setPositionY(y);
        }
        if (InputManager.isPressed(KeyEvent.VK_S)) {
            float y = getPositionY();
            y += -4;
            setPositionY(y);
        }
        if (InputManager.isPressed(KeyEvent.VK_A)) {
            float x = getPositionX();
            x += -4;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_D)) {
            float x = getPositionX();
            x += 4;
            setPositionX(x);
        }
    }


    @Override
    public void collisionReaction(GameObject collidedWith) {
        PhysicsResolution.addContact(this, collidedWith);
        if (collidedWith.getName().equals(("Enemy9")) || collidedWith.getName().equals(("Enemy10")) || collidedWith.getName().equals(("Enemy11")) || collidedWith.getName().equals(("Enemy12")) || collidedWith.getName().equals(("Enemy13")) || collidedWith.getName().equals(("Enemy14"))  || collidedWith.getName().equals(("Enemy15")) || collidedWith.getName().equals(("Enemy16"))) {
            GameLevelManager.goToLevel(new MainMenu2());


        }


    }
}