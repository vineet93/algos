package com.vineet.stack;

import java.util.Arrays;

interface MyStack{

    public void push(int a);
    public int pop();
    public Boolean isEmpty();
    public Boolean isFull();
    public int peek();
    public void show();

}

public class MyStackImpl implements MyStack {

    int MAX_SIZE=5;
    int[] arr = new int[MAX_SIZE];
    int top;

     public MyStackImpl(){
         Arrays.fill(arr,-1);
         top = -1;
    }

    @Override
    public void push(int a) {
        if(!isFull()){
            arr[++top] = a;
        }else {
            System.out.println("Stack overflow");
        }
    }

    public void show() {
        for (int i:arr) {
            if(i!=-1)
                System.out.print(i);
        }
        System.out.println();
    }

    @Override
    public int pop() {

         if(!isEmpty()){
             int temp=arr[top];
             arr[top]= -1;
             top--;
             return temp;
         }else{
             System.out.println("No elemnts in stack");
             return -1;
         }
    }

    @Override
    public Boolean isEmpty() {
        return (top==-1);
    }

    @Override
    public Boolean isFull() {
        return (top==MAX_SIZE-1);
    }

    @Override
    public int peek() {
        return arr[top];
    }

    public static void main(String[] args) {



        MyStack stack = new MyStackImpl();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(2);

        System.out.println("Elements in Stack are " );
        stack.show();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       stack.pop();
    }
}
