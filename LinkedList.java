package RunDown;

import java.util.stream.IntStream;

public class LinkedList {
    private static class Node {
        boolean red;
        boolean green;
        boolean blue;
        

        Node next;

        public Node() {
            this.red = false;
            this.green = false;
            this.blue = false;
            this.next = null;
        }

        private void addColor(char c) {
            if (c == 'R')
                red = true;
            if (c == 'G')
                green = true;
            if (c == 'B')
                blue = true;
        }

        private boolean has3Colors() {
            return (red && green && blue);
        }
    }

    private Node head;
    private Node tail;
    int size;

    LinkedList() {
        head = null;
        tail = null;
    }

    private void add() {
        Node newNode = new Node();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static int countRodsWith3Colors(String ringInfo) {

        LinkedList list = new LinkedList();
        
        //Since we are told to expect 10 rods each time 
        //we will create 10 nodes to hold their information
        IntStream.range(0, 10).forEach(i -> list.add());
      

        for (int i = 0; i < ringInfo.length(); /* left blank to interate inside the loop */) {
            char color = ringInfo.charAt(i++);
            int rodNum = Character.getNumericValue(ringInfo.charAt(i++));

            Node current = list.head;
            for (int j = 0; j < rodNum; j++) {
                current = current.next;
            }

            current.addColor(color);
        }

        int counter = 0;
        Node current = list.head;
        while (current != null) {
            if (current.has3Colors())
                counter++;

            current = current.next;
        }
        return counter;
    }

    // -----------------TEST CLIENT------------------------//
    // ----------------DO NOT MODIFY-----------------------//
    public static void main(String[] args) {
        String test1 = "B0B6G0R6R0R6G9";
        String test2 = "B0R0G0R9R0B0G0";
        String test3 = "G4";
        String test4 = "B7B1G6G0R9B3R1R1R7R1R1B1G7R8B2B0R0G9B9";
        String test5 = "";

        // Test case 1
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test1));
        System.out.println();

        // Test case 2
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test2));
        System.out.println();

        // Test case 3
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test3));
        System.out.println();

        // Test case 4
        System.out.println("Expected count = 3");
        System.out.println("Tested results = " + countRodsWith3Colors(test4));
        System.out.println();

        // Test case 5
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test5));
        System.out.println();
    }
}
