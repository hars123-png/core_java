public class SinglyLinkedLIstEx {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

// Insert at end

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning o(n)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete by value

    public void delete(int key) {
        // if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // if head needa to be removed
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Key not found");
            return;
        }

    }


    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->"); 
            temp = temp.next;
        }
        System.out.println("null");
    }



    // main method

    public static void main(String[] args) {
        SinglyLinkedLIstEx list = new SinglyLinkedLIstEx();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("List after inserting at end:");
        list.display();

        list.insertAtBeginning(5);
        System.out.println("List after inserting at beginning:");
        list.display();

        list.delete(20);
        System.out.println("List after deleting 20:");
        list.display();
        
    }
    
}
