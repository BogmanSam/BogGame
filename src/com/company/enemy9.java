package com.company;

/**
 * Created by sam.richard on 7/21/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by logan.katzer on 7/21/2017.
 */
public class enemy9 extends GameObject {  public enemy9()
{
    super("Enemy5", 50, 50, "bad_ejnjs.png");
    setRectangleCollider(25, 25);

    Player_2.maxEnemies++;


}



    @Override public void update(float dt)
    {
        GameObject player_2 = ObjectManager.getGameObjectByName("Player_2");
        Vec2 vector = new Vec2();




        vector.setX(player_2.getPositionX() - getPositionX());
        vector.setY(player_2.getPositionY() - getPositionY());
        vector.normalize();
        float speed = 1f;
        setPositionX(getPositionX() + vector.getX() * speed);
        setPositionY(getPositionY() + vector.getY() * speed);


    }
    boolean dead = false;

    @Override
    public void collisionReaction(GameObject collidedWith)
    {
        PhysicsResolution.addContact(this, collidedWith);
        if(dead == false && collidedWith.getName().equals(("Bullet")))
        {
            kill();
            Player_2.enemyCounter++;
            dead = true;





        }


    }
}

