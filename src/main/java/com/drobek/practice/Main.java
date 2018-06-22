package com.drobek.practice;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String... arg){
        Menu menu = new Menu();
        LinkedList linkedList = new LinkedList();

        int userInput;


        do {
            menu.printMenu();
            userInput = scanner.nextInt();

           switch (userInput) {
               case 1:
                   linkedList.printList();
                   break;
               case 2:
                   System.out.println("enter value of new node: ");
                   int nodeToAdd = scanner.nextInt();
                   linkedList.addNode(nodeToAdd);
                   break;
               case 3:
                   linkedList.removeLast();
                   break;
               case 4:
                   break;
           }
       }while(userInput <=3 && userInput >0);


    }

}
