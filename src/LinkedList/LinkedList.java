/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author minter
 */
public class LinkedList<T> {

    private Node<T> head;

    public void addFirst(Node<T> newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            
            newNode.nextNode = head;
            head = newNode;
        
        }
    }

    public void addFirst(T data) {
        addFirst(new Node<>(data));
    }

    public void addLast(Node<T> newNode) {
        if (isEmpty()) {
            addFirst(newNode);
        } else {
            Node<T> tmp = head;
            while (tmp.nextNode != null) {
                tmp = tmp.nextNode;
            }
            tmp.nextNode = newNode;
        }
    }

    public void addLast(T data) {
        addLast(new Node<>(data));
    }

    public void addAfter(T search, T data) {

        if (isEmpty()) {
            System.out.println("Empty list");
        } else {

            Node<T> tmp = head;

            while (tmp != null) {

                if (tmp.data.equals(search)) {
                    Node<T> newNode = new Node<>(data);
                    newNode.nextNode = tmp.nextNode;
                    tmp.nextNode = newNode;
                    return;
                }

                tmp = tmp.nextNode;

            }

        }
    }

    public void addBefore(T search,T data){
        
        if(isEmpty()){
            System.out.println("Empty List");
        }else{
            
            Node<T> tmp=head;
            
            while(tmp.nextNode!=null){
                
                if(tmp.nextNode.data.equals(search)){
                    Node<T> newNode=new Node<>(data);
                    newNode.nextNode=tmp.nextNode;
                    tmp.nextNode=newNode;
                    return;
                }
                tmp=tmp.nextNode;
            }
            
            
        }
        
    }
    
    public void remove(T search){
        
        if(isEmpty()){
            System.out.println("Empty List");
        }else{
            
            Node<T> tmp=head;
            
            if(tmp.data.equals(search)){
                head=tmp.nextNode;
                return;
            }
            
            
            while(tmp.nextNode!=null){
                
                if(tmp.nextNode.data.equals(search)){
                    
                    tmp.nextNode=tmp.nextNode.nextNode;
                    return;
                }
                
                tmp=tmp.nextNode;
                
            }
            System.out.println("Not Found");
            
            
            
        }
        
        
    }
    
    
    
    
    public void print() {

        if (isEmpty()) {
            System.out.println("Liste boş");
        } else {
            Node<T> tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " -> ");
                tmp = tmp.nextNode;
            }
            System.out.println(" null");
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

}
