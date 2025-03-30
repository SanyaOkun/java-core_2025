package laba3;
import java.util.NoSuchElementException;

public class Example12 {
    private Node head;
    private Node tail;
    private int size;

    public Example12() {
        head = null;
        tail = null;
        size = 0;
    }

    // а) Ввод с головы с использованием цикла
    public void createHead() {
        head = null;
        tail = null;
        size = 0;
        for (int i = 9; i >= 0; i--) {
            Node node = new Node(i);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
            size++;
        }
    }

    // а) Ввод с хвоста с использованием цикла
    public void createTail() {
        head = null;
        tail = null;
        size = 0;
        for (int i = 0; i <= 9; i++) {
            Node node = new Node(i);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }
    }

    // а) Вывод списка с использованием цикла
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current!= null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    // а) Добавление элемента в начало списка с использованием цикла
    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    // а) Добавление элемента в конец списка с использованием цикла
    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // а) Вставка элемента в список с указанным номером с использованием цикла
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node node = new Node(value);
            node.next = current.next;
            current.next = node;
            size++;
        }
    }

    // а) Удаление элемента с головы списка с использованием цикла
    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    // а) Удаление последнего элемента списка с использованием цикла
    public void removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next!= tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
    }

    // а) Удаление из списка элемента с указанным номером с использованием цикла
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    // б) Ввод с головы с использованием рекурсии
    public void createHeadRec() {
        head = null;
        tail = null;
        size = 0;
        createHeadRec(9, 0);
    }

    private void createHeadRec(int i, int n) {
        if (i < n) {
            return;
        }
        Node node = new Node(i);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
        createHeadRec(i - 1, n);
    }

    // б) Ввод с хвоста с использованием рекурсии
    public void createTailRec() {
        head = null;
        tail = null;
        size = 0;
        createTailRec(0, 10);
    }

    private void createTailRec(int i, int n) {
        if (i >= n) {
            return;
        }
        Node node = new Node(i);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        createTailRec(i + 1, n);
    }

    // б) Вывод списка с использованием рекурсии
    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRec(node.next);
    }

    public static void main(String[] args) {
        Example12 list = new Example12();
        list.createTail();
        System.out.println("Изначальный список: " + list.toString());

        Example12 list2 = new Example12();
        list2.createTail();
        System.out.println("Список с головы: ");
        list2.createHead();
        System.out.println(list2.toString());

        Example12 list3 = new Example12();
        list3.createTail();
        System.out.println("Список с хвоста: ");
        list3.createTail();
        System.out.println(list3.toString());

        Example12 list4 = new Example12();
        list4.createTail();
        list4.addFirst(10);
        System.out.println("Добавление элемента в начало: " + list4.toString());

        Example12 list5 = new Example12();
        list5.createTail();
        list5.addLast(11);
        System.out.println("Добавление элемента в конец: " + list5.toString());

        Example12 list6 = new Example12();
        list6.createTail();
        list6.insert(5, 12);
        System.out.println("Вставка элемента в список: " + list6.toString());

        Example12 list7 = new Example12();
        list7.createTail();
        list7.removeFirst();
        System.out.println("Удаление элемента с головы: " + list7.toString());

        Example12 list8 = new Example12();
        list8.createTail();
        list8.removeLast();
        System.out.println("Удаление последнего элемента: " + list8.toString());

        Example12 list9 = new Example12();
        list9.createTail();
        list9.remove(5);
        System.out.println("Удаление элемента с указанным номером: " + list9.toString());

        Example12 list10 = new Example12();
        list10.createTail();
        list10.createHeadRec();
        System.out.println("Ввод с головы (рекурсивно): " + list10.toStringRec());

        Example12 list11 = new Example12();
        list11.createTail();
        list11.createTailRec();
        System.out.println("Ввод с хвоста (рекурсивно): " + list11.toStringRec());

        Example12 list12 = new Example12();
        list12.createTail();
        System.out.println("Вывод списка (рекурсивно): " + list12.toStringRec());
    }
}