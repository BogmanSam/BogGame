package com.company;



import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/18/2017.
 */
public class Bullet extends GameObject
{
    public Bullet()
    {
        super("Bullet", 3, 3, "GreenBall.png");

    }
    public Vec2 direction;
    private void shoot()
    {
        ObjectManager.addGameObject(new Bullet(direction, getPosition()));
    }
    public Bullet(Vec2 direction_, Vec2 location)
    {
        super("Bullet",3,3,"GreenBall.png");
        direction = new Vec2();
        direction.setX(direction_.getX());
        direction.setY(direction_.getY());
        setScaleX(3.0f);
        setScaleY(3.0f);
        setPosition(location);
        setRectangleCollider(1.5f, 1.5f);
    }

    @Override
    public void update(float dt)
    {
        setPositionX(getPositionX() + direction.getX() * 7.5f);
        setPositionY(getPositionY() + direction.getY() * 7.5f);
        if(isInViewport() == false)
        {
            kill();
        }
    }
    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        PhysicsResolution.addContact(this, collidedWith);
        if((collidedWith.getName().equals("Enemy"))||(collidedWith.getName().equals("Enemy2"))||(collidedWith.getName().equals("Enemy4")))
        {
            kill();
            //System.out.println("test");
        }


    }

}