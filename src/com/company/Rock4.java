package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by logan.katzer on 7/21/2017.
 */

import edu.digipen.gameobject.GameObject;

/**
 * Created by logan.katzer on 7/19/2017.
 */
public class Rock4 extends GameObject
{
    public Rock4() {
        super("rock", 60, 60, "Rock.png");
        setRectangleCollider(30, 30);
        setMass(0);

    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        // PhysicsResolution.addContact(this, collidedWith);
    }
}

