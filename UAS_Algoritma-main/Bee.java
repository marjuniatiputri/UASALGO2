import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        {
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2,getY());
    }
}
}
}

