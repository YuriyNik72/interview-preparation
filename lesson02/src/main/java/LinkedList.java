

public class LinkedList {
    LinkedList next;    // указатель на следующий элемент
    int data;            // данные
//}

    static class List {
        private  LinkedList head;       // указатель на первый элемент
        private  LinkedList tail;       // указатель последний элемент

        void addFront(int data) {       //добавить спереди
            LinkedList a = new LinkedList();  //создаём новый элемент
            a.data = data;              //инициализируем данные.
            // указатель на следующий элемент автоматически инициализируется как null
            if (head == null) {           //если список пуст
                head = a;               //то указываем ссылки начала и конца на новый элемент
                tail = a;               //т.е. список теперь состоит из одного элемента
            } else {
                a.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
                head = a;               //а указатель на первый элемент теперь ссылается на новый элемент
            }
        }

        void addBack(int data) {          //добавление в конец списка
            LinkedList a = new LinkedList();  //создаём новый элемент
            a.data = data;
            if (tail == null)           //если список пуст
            {                           //то указываем ссылки начала и конца на новый элемент
                head = a;               //т.е. список теперь состоит из одного элемента
                tail = a;
            } else {
                tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
                tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
            }
        }

        void addAfter(int prevEl, int nextEl) {//Добавление в произвольное место
            LinkedList t = this.head;                //Получаем ссылку на первоэлемент
            while (t != null) {
                if (prevEl == t.data) {
                    LinkedList e = new LinkedList();
                    e.data = nextEl;
                    e.next = t.next;
                    t.next = e;
                    t = e;
                }
                t = t.next;
            }
        }

        void deleteFirst() {
            head = head.next;
        }

        void deleteLast() {
            LinkedList current = head;
            LinkedList temp = head;
            while (current.next != null) {
                temp = current;
                current = current.next;
            }
            current = temp;
            current.next = null;
        }

        void delEl(int data) {      //удаление элемента
            if (head == null)        //если список пуст -
                return;             //ничего не делаем

            if (head == tail) {     //если список состоит из одного элемента
                head = null;        //очищаем указатели начала и конца
                tail = null;
                return;             //и выходим
            }
            if (head.data == data) {    //если первый элемент - тот, что нам нужен
                head = head.next;       //переключаем указатель начала на второй элемент
                return;                 //и выходим
            }
            LinkedList t = head;       //иначе начинаем искать
            while (t.next != null) {    //пока следующий элемент существует
                if (t.next.data == data) {  //проверяем следующий элемент
                    if (tail == t.next)      //если он последний
                    {
                        tail = t;           //то переключаем указатель на последний элемент на текущий
                    }
                    t.next = t.next.next;   //найденный элемент выкидываем
                    return;                 //и выходим
                }
                t = t.next;                //иначе ищем дальше
            }
        }

        void printList(List list) {         //печать списка
            LinkedList t = this.head;       //получаем ссылку на первый элемент
            while (t != null)               //пока элемент существуе
            {
                System.out.print(t.data + " "); //печатаем его данные
                t = t.next;                     //и переключаемся на следующий
            }
            System.out.println();
        }

//

    }
}
