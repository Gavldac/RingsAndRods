
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
    }

    public static int countRodsWith3Colors(String str) {

        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add();
        }

        String rings = str;

        for (int i = 0; i < rings.length(); /* left blank to interate inside the loop */) {
            char color = rings.charAt(i++);
            int rodNum = Character.getNumericValue(rings.charAt(i++));

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
