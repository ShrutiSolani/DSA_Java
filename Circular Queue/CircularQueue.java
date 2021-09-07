import java.util.*;

class CircularQueue {
    int front, rear, capacity;
    int[] queue;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        queue = new int[capacity];
    }

    public boolean enqueue(int val) {
        if(isFull()){
            return false;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%capacity;
        queue[rear] = val;
        return true;
    }

    public boolean dequeue() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%capacity;
        }
        return true;
    }

    public int front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }

    public int top() {
        if(isEmpty()){
            return -1;
        }
        return queue[rear];
    }

    public boolean isFull() {
        if(front == 0 && rear == capacity-1){
            return true;
        }
        if(front == rear+1){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(front == -1){
            return true;
        }
        return false;
    }
}
