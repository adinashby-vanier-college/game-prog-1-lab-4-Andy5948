// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameLostWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("You Lose:(", 180, 270);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }

    /**
     * 
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new  GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
