//
//  File: Fan.java
//  Author: AJ Blooi
//  Purpose: Test file for the base of the fan
//

public class Fan{

    public static void main(String[] args) 
    {   
        // This is the fan object 
        Base fan = new Base();

        // Fan speed test
        System.out.println("The fan speed is " + fan.getSpeed());
        fan.setSpeed();
        System.out.println("The fan speed is " + fan.getSpeed());
        fan.setSpeed();
        System.out.println("The fan speed is " + fan.getSpeed());
        fan.setSpeed();
        System.out.println("The fan speed is " + fan.getSpeed());
        fan.setSpeed();
        System.out.println("The fan speed is " + fan.getSpeed());

        // Fan direction test
        System.out.println("The fan direction is " + fan.getDirection());
        fan.setDirection();
        System.out.println("The fan direction is " + fan.getDirection());
        fan.setDirection();
        System.out.println("The fan direction is " + fan.getDirection());
        fan.setDirection();
        System.out.println("The fan direction is " + fan.getDirection());
        fan.setDirection();
        System.out.println("The fan direction is " + fan.getDirection());

        // Fan test for both operations 
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
        fan.setDirection();
        fan.setSpeed();
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
        fan.setSpeed();
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
        fan.setSpeed();
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
        fan.setSpeed();
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
        fan.setSpeed();
        fan.setDirection();
        System.out.printf("The fan speed is %d and the direction is %s\n", fan.getSpeed(), fan.getDirection());
    }
}