package com.company;

public class Arraylist<T> {

    private T[] arraylist;
    private int size;
    private int totalindex = 8;
    private int currentFirst;
    private int currentLast;
    private static int RESIZE_FACTOR = 2;

    public Arraylist(){
        this.arraylist = (T[]) new Object[totalindex];
        this.size = 0;
        this.currentFirst = 3;
        this.currentLast = 4;

    }

    public void addLast(T item){

    }

    public T removeFirst(){
        return null;
    }

    public T removeLast() {
        return null;
    }

    public T get(int index){
        return null;
    }

    public boolean isEmpty(){
        if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return this.size;
    }
}

