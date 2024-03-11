package com.qunar.switchAndIfElse.test;

import com.qunar.switchAndIfElse.Animal;
import com.qunar.switchAndIfElse.Cat;
import com.qunar.switchAndIfElse.Rabbit;
import com.qunar.switchAndIfElse.Tiger;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/10
 * @description ：
 * @version: 1.0
 */
public class TestInt {
    public static void main(String[] args) {
        System.out.println(getAnimal(0));
        System.out.println(getAnimal(1));
        System.out.println(getAnimal(2));
        System.out.println(getAnimal(3));

        System.out.println(getAnimalBySwitch(0));
        System.out.println(getAnimalBySwitch(1));
        System.out.println(getAnimalBySwitch(2));
        System.out.println(getAnimalBySwitch(3));
    }

    public static Animal getAnimal(int n) {
        if (n == 1) {
            return new Cat();
        } else if (n == 200) {
            return new Rabbit();
        } else if (n == 666) {
            return new Tiger();
        } else {
            return null;
        }
    }

    public static Animal getAnimalBySwitch(int n) {
        switch (n) {
            case 1:
                return new Cat();
            case 200:
                return new Rabbit();
            case 666:
                return new Tiger();
            default:
                return null;
        }
    }
}
