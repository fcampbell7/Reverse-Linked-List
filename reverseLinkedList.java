//This code creates a linked list, then reverses it's order by unlinking and relinking all of the nodes.

class Main{

    public static void main(String[] args){
        System.out.println("Forwards linked list:");
        Node initialList = initialLinkedList();
        printLinkedList(initialList);


        //Reversed linked list
        Node node = initialList;
        Node prev = null;
        Node next;

        while(node != null){
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }

        System.out.println("\nReversed linked list:");
        printLinkedList(prev);    
    }

    public static Node initialLinkedList(){
        
        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        Node node4 = new Node("d");
        Node node5 = new Node("e");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        return node1;
    }

    static void printLinkedList(Node node){
        while(node!=null){
            node.print();
            node = node.getNext();
        }
    }

    static class Node{
        private String value;
        private Node next;

        public Node(String value){
            this.value = value;
            this.next = null;
        }

        public void setNext(Node n){
            this.next = n;
        }

        public Node getNext(){
            return(this.next);
        }

        public void print(){
            System.out.println(this.value);
        }

        public String getValue(){
            return(this.value);
        }
    }
}