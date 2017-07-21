package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class Rock3 extends GameObject {
    public Rock3() {
        super("rock4", 60, 60, "rok.png");
        setRectangleCollider(30, 30);
        setMass(0);

    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        // PhysicsResolution.addContact(this, collidedWith);
    }
}
