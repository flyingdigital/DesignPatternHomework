package com.flyingdigital;

public class Test {
    public static void main(String[] args) {
        Transform transform = new Car();

        Robot robot = new Robot(transform);
        robot.move();
        robot.say();
    }
}
