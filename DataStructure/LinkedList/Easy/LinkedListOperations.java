package DataStructure.LinkedList.Easy;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
       LinkedList<Integer> l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(0);
        l.add(10);

        for(int i = 0 ; i <l.size(); i++){
            System.out.println("== "+l.get(i));
        }

        l.remove();  //remove from start

        System.out.println("++++++++++++++++++++");
        for(int i = 0 ; i <l.size(); i++){
            System.out.println("== "+l.get(i));
        }

        l.remove(0);

        System.out.println("++++++++++++++++++++");
        for(int i = 0 ; i <l.size(); i++){
            System.out.println("== "+l.get(i));
        }

        l.remove(Integer.valueOf(0));

        System.out.println("++++++++++++++++++++");
        for(int i = 0 ; i <l.size(); i++){
            System.out.println("== "+l.get(i));
        }
    }
}
