package cn.com.zgfei.aidltest.test;


import java.util.LinkedList;

/**
 * 链表的实现
 *
 * 栈的实现
 *
 * 队列的实现
 *
 * 二叉树的实现
 */

public class OneTest {

    /**
     * 实现链表结构
     *
     * 单向链表
     * 双向链表
     */
    static class OneNode<T> {
        T item;
        OneNode<T> next;

        OneNode(T item, OneNode<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    static class TwoNode<T> {
        T item;
        TwoNode<T> left;
        TwoNode<T> right;
        TwoNode(T item, TwoNode<T> left, TwoNode<T> right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 栈的实现
     */
    static class MyStack<T> {
        LinkedList<T> linkedList = new LinkedList<>();

        public void addFirst(T t) {
            linkedList.addFirst(t);
        }

        public T removeFirst(T t) {
            return linkedList.removeFirst();
        }

        public T getFirst() {
            return linkedList.getFirst();
        }
    }

    /**
     * 队列的实现
     */
    static class MyQueue<T> {
        LinkedList<T> linkedList = new LinkedList<>();

        public void enqueue(T t) {
            linkedList.addLast(t);
        }

        public T dequeue() {
            return linkedList.removeFirst();
        }
    }

    /**
     * 二叉树的实现
     *
     * 二叉查找树
     */
    static class MyTwoTree<T extends Comparable<T>> {
        MyTwoTree<T> parent;
        T item;
        MyTwoTree<T> left;
        MyTwoTree<T> right;

        MyTwoTree(MyTwoTree<T> parent, T item, MyTwoTree<T> left, MyTwoTree<T> right) {
            this.parent = parent;
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    static class MySearchTwoTree<T extends Comparable<T>> {
        MyTwoTree<T> tree;

        MySearchTwoTree(MySearchTwoTree<T> parent, T item, MySearchTwoTree<T> left, MySearchTwoTree<T> right) {
        }

        public boolean search(T t) {
            MyTwoTree<T> current = tree;

            while (current != null) {
                if (t.compareTo(current.item) > 0) {
                    current = current.right;
                } else if (t.compareTo(current.item) < 0) {
                    current = current.left;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

}
