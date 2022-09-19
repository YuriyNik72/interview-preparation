

public class Main {
    public static void main(String[] args) {
        LinkedList.List list = new LinkedList.List();
        ArrayList arList = new ArrayList();
        System.out.println("LinkedList");
        // Insert the values
        list.addFront(1);
        list.addFront(10);
        list.addFront(3);
        list.addFront(7);

        list.addBack(8);
        list.addBack(2);
        list.addBack(4);
        list.addBack(5);

        list.addAfter(5,6);
        list.addAfter(2,9);

        // Print the LinkedList
        list.printList(list);
        System.out.println("--------------");

        // Delete the values
        list.delEl(4);
        list.deleteLast();
        list.deleteFirst();
        list.printList(list);

        //ArrayList
        arList.addEnd(1);
        arList.addEnd(2);
        arList.addEnd(3);
        arList.addEnd(4);
        arList.set(5,3);
        arList.set(6,2);
        System.out.println("ArrayList");
        System.out.println("Элемент по указанному индексу " + arList.get(1));
        System.out.println("Добавление элементов");
        arList.addEnd((int) 34.56);
        arList.printAllElements();
        System.out.println("Удаление элемента");
        arList.remove(2);
        arList.printAllElements();
    }
}
