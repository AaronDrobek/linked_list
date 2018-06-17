package com.drobek.practice;

public class LinkedList {
    Node initialNode;

    public void addNode(int nodeValue) {
        Node newNode = new Node();
        newNode.setValue(nodeValue);

        if (initialNode == null) {
            initialNode = newNode;
        } else {
            Node currentPointer = initialNode;
            while (currentPointer.getNext() != null) {
                currentPointer = currentPointer.getNext();
            }
            currentPointer.setNext(newNode);
        }
    }

    public void printList() {
        if (initialNode == null) {
            System.out.println("list is empty");
        } else {
            Node currentPointer = initialNode;
            System.out.print("here is the list " + initialNode.getValue());
            while (currentPointer.getNext() != null) {
                currentPointer = currentPointer.getNext();
                System.out.print("," + currentPointer.getValue());
            }
        }
    }


    public void removeLast() {
        if (initialNode != null) {
          if(initialNode.getNext()==null){
              initialNode = null;
          }
        } else {

            Node currentPointer = initialNode;
            while (currentPointer.getNext() != null) {
                    currentPointer = currentPointer.getNext();
                    if(currentPointer.getNext().getNext()==null ){
                        currentPointer = null;
                    }

                }
            }
        }

}
