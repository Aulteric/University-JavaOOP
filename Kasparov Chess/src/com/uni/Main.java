package com.uni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please insert the following information in the shown format so you will be able to play the game");
        System.out.println("There are two options.");
        System.out.println("Move Current Row position, Current Column position, Row you wish to move it to, Column you wish to move it to.");
        System.out.println("Blast, Row you wish to blast, Column you wish to blast (it's only available if the piece has the ability)");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine().split(" ");
    }
}
