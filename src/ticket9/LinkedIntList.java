package ticket9;

import java.util.List;

public class LinkedIntList{
    public class ListNode implements Cloneable{
        public int data;
        public ListNode next;
        public ListNode prev;
        public ListNode root;

        public ListNode clone() throws CloneNotSupportedException {
            ListNode clone = new ListNode();
            clone.data=this.data;
            clone.prev=this.prev;
            clone.next=this.next;
            return clone;
        }
    }
    private ListNode root;

    public LinkedIntList(){
        root = new ListNode();
        root.prev = null;
        root.next = null;
    }

    public void add(int data) throws CloneNotSupportedException {
        if (root.data==0){
            root.data=data;
            return;
        }
        ListNode currentNode=root;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next=new ListNode();

        currentNode.next.data=data;
        currentNode.next.prev=currentNode;
        currentNode.next.next=null;
    }

    public void removeDuplicates() throws CloneNotSupportedException {
        ListNode currentNode=root;

        while (currentNode!=null){
            int data = currentNode.data;

            ListNode currentRoot=currentNode;
            while (currentRoot.next != null){
                currentRoot = currentRoot.next;
                if (currentRoot.data == data){
                    ListNode prev=currentRoot.prev;
                    ListNode next=currentRoot.next;
                    prev.next=next;
                    if (next!=null) next.prev=prev;

                }
            }
            currentNode=currentNode.next;
        }
    }

    public void printList() throws CloneNotSupportedException {
        ListNode currentNode = root.clone();

        while (currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
}

/*
    LinkedIntList list=new LinkedIntList();
        list.add(14);
                list.add(8);
                list.add(14);
                list.add(12);
                list.add(1);
                list.add(14);
                list.add(11);
                list.add(8);
                list.add(8);
                list.add(10);
                list.add(4);
                list.add(9);
                list.add(1);
                list.add(2);
                list.add(5);
                list.add(2);
                list.add(4);
                list.add(12);
                list.add(12);
                list.printList();
                System.out.println("\n");
                list.removeDuplicates();
                list.printList();*/
// Билет 9 (Напишите метод removeDuplicates, который можно добавить в класс LinkedIntList)