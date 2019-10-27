package collection.impl;

import java.util.NoSuchElementException;

/**
 * Добавить метод addLast, добавить поле IntegerNode tail и
 * реализовать метод добавление в хвост
 */

public class ListAtmCollection<E> {
    Node<E> head;


    public ListAtmCollection(){

    }

    public void push(E item){
        if (head == null){
            head = (Node<E>) new Object();
            head.value = item;
        } else {
            Node<E> tmp = head;
            head = (Node<E>) new Object();
            head.value = item;
            head.next = tmp;
        }
    }

    public void append(E item){
        if (head == null){
            head = (Node<E>) new Object();
            head.value = item;
        }else{
            Node<E> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = (Node<E>) new Object();
            current.next.value = item;

        }
    }

    public boolean remove(Integer item){

        Node<E>  current = head;
        Node<E>  parent = head;
        while (current != null){
            if(current.value.equals(item)){
                parent.next = current.next;
                return true;
            }
            parent = current;
            current = current.next;
        }

        return false;

    }

    public E pop(){
        if(head == null)
            throw new NoSuchElementException();
        Node<E> tmp = head;
        head = head.next;
        return tmp.value;
    }




    class Node<E>{
        E value;
        Node<E> next;

    }
}


