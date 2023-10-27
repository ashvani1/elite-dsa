package DataStructure.LinkedList.Easy;

import java.util.HashMap;
import java.util.Map;

public class CustomLinkedList {

    Node removeZeroSumSublists(Node head) {
        //this map will hold sum of all nodes at each level and corresponding nodes
        Map<Integer, Node> map = new HashMap<>();
        int currentValue = 0;
        Node dummy = new Node(-1);
        dummy.next = head;
        map.put(0, dummy);
        Node curr = head;

        while (curr != null) {
            currentValue += curr.value;
            //if sum is present in map then we have nodes which are going to remove
            if (map.containsKey(currentValue)) {
                Node temp = curr;
                Node existingListForCurrentValue = map.get(currentValue);
                remove_nodes(map, existingListForCurrentValue, temp, currentValue);
                curr = temp.next;
            }
            //if sum of nodes is not available in map
            else {
                map.put(currentValue, curr);
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public void remove_nodes(Map<Integer, Node> map, Node start, Node end, int currentValue) {
        int t = currentValue;
        Node curr = start.next;
        while (curr != end) {
            t = t + curr.value;
            map.remove(t);
            curr = curr.next;
        }
        start.next = end.next;
    }
    CustomLinkedList() {
    }

    class Node {
        private Node next; //pointer
        private int value; //node value

        Node(int value) {
            this.value = value;
        }

    }

    private Node head;
    private Node tail;
    private int length = 0;

    CustomLinkedList(int value) {
        Node newNode = new Node(value);
        tail = newNode;
        head = newNode;
        length++;
    }
    //prepend
    public void addFirst(int data) {
        Node node = new Node(data);
        if(length == 0) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
        length++;
    }

    //append
    private void addLast(int data) {
        Node node = new Node(data);
        if (length == 0) {
            head = node;
            tail = node;
            //length++;
        } else {
            tail.next = node;
            tail = node;
            //length++;
        }

        length++;
    }

    private Node removeFirst() {
        if(length == 0)
        {
            System.out.println("LinkedList os empty, nothing to remove");
            return null;
        }
            Node temp = head;
            head = temp.next;
            temp.next = null;
            length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }
    private Node removeLast() {
        if(length == 0) {
            System.out.println("LinkedList is empty, nothing to remove");
            return null;
        }
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            //found second last item
            tail = temp;
            tail.next = null;
            length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    void getHead() {
        if(null != head)
            System.out.println("Head is " + head.value);
    }

    void getTail() {
        if(tail != null)
            System.out.println("Tail is " + tail.value);
    }

    void getLength() {
        System.out.println("Length is " + length);
    }

    private Node get(int index) {
        if(length == 0) {
            System.out.println("There is no data in linkedlist so returning null");
            return null;
        }
        else if(index < 0 || index >= length) {
            System.out.println("index is not valid so returning null");
            return null;
        }
        Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
        }
        return temp;
    }

    private void removeAll() {
        Node temp = head;
        head = null;
        tail = null;
        temp.next = null;
        length = 0;
    }
    private void printList() {
        if(length == 0)
            return;
        Node temp = head;
        while (null != temp) {
            if (temp.next == null) {
                System.out.println(temp.value);
                break;
            }
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    //set/override a new node on given index
    private boolean set(int index, int value) {
        //We can leverage get() method to find out Node on current index
        Node current = get(index);
        //If index is out of range this will give null value
        if(current != null) {
            current.value = value;
            return true;
        }
        return false;
    }

    //insert a new node at given index
    private boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }

        if(index == 0){
            addFirst(value);
            return true;
        }

        if(index == length) {
            addLast(value);
            return true;
        }
        Node newNode = new Node(value);
        //find location where we are gonna insert newNode
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    private Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        Node current = head;
        if(index == 0)
            return removeFirst();

        if(index == length-1)
            return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    private Node reverse() {
        if(length == 0){
            return null;
        }
        if(length == 1) {
            return head;
        }

        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        tail = head;
        head = prev;
        return prev;
    }

    public static void main(String[] args) {

        CustomLinkedList linkedList1 = new CustomLinkedList();
        linkedList1.addFirst(1);
 /*       linkedList1.printList();
        linkedList1.removeFirst();
        linkedList1.printList();*/
        linkedList1.addLast(2);
        linkedList1.addLast(30 );
        linkedList1.addLast(40);
        linkedList1.addLast(50);
        linkedList1.addLast(60);

       linkedList1.printList();
        linkedList1.removeLast();
        linkedList1.printList();
        linkedList1.getLength();
        linkedList1.getHead();
        linkedList1.getTail();
        linkedList1.printList();

        linkedList1.removeFirst();
        linkedList1.printList();

        linkedList1.removeAll();
        System.out.println("====");
        Node result = linkedList1.get(0);
        if(result != null)
            System.out.println(result.value);
        System.out.println("====");

        linkedList1.set(0,100);
        linkedList1.set(100, 90);
        linkedList1.set(-1, 10);
        System.out.println(linkedList1.length);;
        linkedList1.printList();

        linkedList1.getHead();
        linkedList1.getTail();
        linkedList1.addLast(20);
        linkedList1.addLast(30);
        linkedList1.addLast(40);
        linkedList1.addLast(50);
        linkedList1.addLast(60);
        linkedList1.printList();
        linkedList1.set(0,10000);
        linkedList1.set(100, 90);
        linkedList1.set(1, 1000);
        System.out.println(linkedList1.length);;
        linkedList1.printList();


        linkedList1.insert(1, 100);
        linkedList1.printList();
        linkedList1.insert(5, 500000);
        linkedList1.printList();
        linkedList1.insert(5, 5);
        linkedList1.printList();

        Node removedNode = linkedList1.remove(3);
        if(removedNode != null)
            System.out.println(removedNode.value);

        System.out.println("=");
        linkedList1.printList();
        linkedList1.reverse();
        System.out.println("==");
        linkedList1.printList();
        linkedList1.getTail();

    }
}
