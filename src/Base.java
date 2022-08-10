//
//  File: Main.java
//  Author: AJ Blooi
//  Purpose: Lets you set and get all fan functions,
//  fan is 3 speed with an off feature and has 2 directions 
//  

public class Base{

    private int speed = 0;
    private String b;
    private int direction = 1; 

    // For creating Fan object
    public Base()
    {  
    }

    // Sets the speed of the fan incementing 
    // by 1 going up to 3 then resets to 0
    public void setSpeed()
    {
        if (speed == 3) {
			speed = 0;
		} else {
			speed = speed + 1;
		}
    }

    // Gets the speed for displaying 
    public int getSpeed()
    {
        return speed;
    }

    // Sets the direction either 1 or 0, with 
    // 1 being forward and 0 being backwards
    public void setDirection()
    {   
        direction = (direction == 1) ? 0 : 1;
    }

    // Gets the direction for displaying as a string
    public String getDirection()
    {
        if(direction == 1){
			b = "Forwards";
		}
		else b  = "Backwards";
        return b;
    }

}

