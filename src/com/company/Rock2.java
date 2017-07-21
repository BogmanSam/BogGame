package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Rock2 extends GameObject {
    public Rock2() {
        super("rock2", 60, 60, "rok.png");
        setRectangleCollider(30, 30);
        setMass(0);

    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        // PhysicsResolution.addContact(this, collidedWith);
    }
}
