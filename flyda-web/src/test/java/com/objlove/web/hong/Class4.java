package com.objlove.web.hong;

class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Stack {
    public Node stackTop;
    public Node stackBottom;

    public Stack() {
    }

    public Stack(Node stackTop, Node stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }
}


public class Class4<T> {
    public static void pushStack(Stack stack, int value) {
        Node newNode = new Node(value);
        newNode.next = stack.stackTop;
        stack.stackTop = newNode;
    }

    public static void traverse(Stack stack) {
        Node stackTop = stack.stackTop;
        while (stackTop != stack.stackBottom) {
            System.out.println(stackTop.data);
            stackTop = stackTop.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(new Node(), new Node());
        stack.stackBottom = stack.stackTop;
        stack.stackTop.next = null;
        pushStack(stack, 11);
        pushStack(stack, 22);
        pushStack(stack, 33);
        traverse(stack);

    }
}
