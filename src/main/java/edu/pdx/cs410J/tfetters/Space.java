package edu.pdx.cs410J.tfetters;

enum Wall {horizontal, vertical};
enum Character {pacman, monster, both};
enum Items {dot, powerup};

/**
 * Created by David on 7/30/14.
 */
public class Space {


    public Space (Wall wall, Character character, Items items ){
        mWall = wall;
        
    }
    //dot
    //left
    //right
    //up
    //down

    //Vertical Wall
    //Horizontal Wall
    //If it's a wall it can't contain anything else

    //If it doesn't have a wall then it could be
    //Dot
    //Character (with invincible flag, whoever is invicinible is displayed)
    //
    char verticalWall = '|';
    char horizontalWall = '-';
    private Wall mWall = null;

    public boolean isWall(){
        if (mWall == null){
            return false;
        }
        else {
            return true;
        }
    }

    public char getIcon (){
        if (mWall.equals(Wall.horizontal)) {
            return '-';
        }
        else if(mWall.equals(Wall.vertical)){
            return '|';
        }

        else {
            return ' ';
        }
    }


}
