package Savitch;

import org.junit.Test;

public class RecursionTesting {  //THIS JUST testing. i THINK THE TRICK WITH RECUSION IS PRACTICE.
    public static void main(String[] args) {
//THIS IS RECURSION!!!!!!!

        Shit(4);

    }

    public static void Shit(int i) {
        if (i == 0) {
            System.out.println("This is the end");
        } else {
            System.out.println(i);
            Shit(i - 1);
        }
    }
}
