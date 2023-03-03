package a123.LRUcache;

import java.util.HashMap;
import java.util.Map;

class MyLRUcache4 {

    private final Map<Integer, Node> map;
    private final Integer capacity;
    private Integer count;
    private Node head, tail;

    private class Node {
        public Integer key;
        public Integer value;
        public Node prev;
        public Node next;
    }

    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    //move node in between to the head
    private void moveToTheHead(Node node) {
        this.removeNode(node);
        this.addNode(node);
    }

    //pop the current tail
    private Node popTail() {
        Node res = tail.prev;
        this.removeNode(res);
        return res;
    }

    public MyLRUcache4(int capacity) {
        this.map = new HashMap<>();
        if (capacity < 1) throw new IllegalArgumentException("cacheSize must be greater or equal 1");
        this.count = 0;
        this.capacity = capacity;

        this.head = new Node();
        this.head.prev = null;

        this.tail = new Node();
        this.tail.next = null;

        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToTheHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;

            map.put(key, newNode);
            addNode(newNode);

            count++;
            if (count > capacity) {
                //pop the tail
                Node tail = popTail();
                map.remove(tail.key);
                count--;
            }
        } else {
            //update the value
            node.value=value;
            moveToTheHead(node);

        }
    }

}