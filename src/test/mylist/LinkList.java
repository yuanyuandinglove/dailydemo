package test.mylist;
public class LinkList {  
     public Node first; // ����һ��ͷ���  
     private int pos = 0;// �ڵ��λ��  
  
     public LinkList() {  
           this. first = null;  
     }  
  
     // ����һ��ͷ�ڵ�  
     public void addFirstNode( int data) {  
          Node node = new Node(data);  
          node. next = first;  
           first = node;  
     }  
  
     // ɾ��һ��ͷ���,������ͷ���  
     public Node deleteFirstNode() {  
          Node tempNode = first;  
           first = tempNode. next;  
           return tempNode;  
     }  
  
     // ������λ�ò���ڵ� ��index�ĺ������  
     public void add(int index, int data) {  
          Node node = new Node(data);  
          Node current = first;  
          Node previous = first;  
           while ( pos != index) {  
              previous = current;  
              current = current. next;  
               pos++;  
          }  
          node. next = current;  
          previous. next = node;  
           pos = 0;  
     }  
  
     // ɾ������λ�õĽڵ�  
     public Node deleteByPos( int index) {  
          Node current = first;  
          Node previous = first;  
           while ( pos != index) {  
               pos++;  
              previous = current;  
              current = current. next;  
          }  
           if(current == first) {  
               first = first. next;  
          } else {  
               pos = 0;  
              previous. next = current. next;  
          }  
           return current;  
     }  
  
     // ���ݽڵ��dataɾ���ڵ�(����ɾ����һ��)  
     public Node deleteByData( int data) {  
          Node current = first;  
          Node previous = first; //��ס��һ���ڵ�  
           while (current. data != data) {  
               if (current. next == null) {  
                    return null;  
              }  
              previous = current;  
              current = current. next;  
          }  
           if(current == first) {  
               first = first. next;  
          } else {  
              previous. next = current. next;  
          }  
           return current;  
     }  
  
     // ��ʾ�����еĽڵ���Ϣ  
     public void displayAllNodes() {  
          Node current = first;  
           while (current != null) {  
              current.display();  
              current = current. next;  
          }  
          System. out.println();  
     }  
  
     // ����λ�ò��ҽڵ���Ϣ  
     public Node findByPos( int index) {  
          Node current = first;  
           if ( pos != index) {  
              current = current. next;  
               pos++;  
          }  
           return current;  
     }  
  
     // �������ݲ��ҽڵ���Ϣ  
     public Node findByData( int data) {  
          Node current = first;  
           while (current. data != data) {  
               if (current. next == null)  
                    return null;  
              current = current. next;  
          }  
           return current;  
     }  
     public static void main(String []args){
    	 LinkList linkList = new LinkList();  
         linkList.addFirstNode(20);  
         linkList.addFirstNode(21);  
         linkList.addFirstNode(19);  
          //19,21,20  
         linkList.add(1, 22); //19,22,21,20  
         linkList.add(2, 23); //19,22,23,21,20  
         linkList.add(3, 99); //19,22,23,99,21,20  
         linkList.displayAllNodes();  
         Node node = linkList.deleteFirstNode();  
         System.out.println("node : " + node.data);  
//       linkList.displayAllNodes();  
//       node = linkList.deleteByPos(2);  
//       System.out.println("node : " + node.data);  
//       linkList.displayAllNodes();  
//       linkList.deleteFirstNode();  
         Node node1 = linkList.deleteByData(19);  
//       Node node = linkList.deleteByPos(0);  
    //     System. out.println( "node : " + node1. data);  
         linkList.displayAllNodes();  
         Node node11 = linkList.findByPos(0);  
         System. out.println( "node1: " + node11. data);  
         Node node2 = linkList.findByData(22);  
         System. out.println( "node2: " + node2. data);  
     }
}  