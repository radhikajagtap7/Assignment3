// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Queue queue = Queue.getInstance(4);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);


        queue.display();
        queue.display();
        queue.display();
        queue.display();
        queue.display();
        queue.display();



    }
}