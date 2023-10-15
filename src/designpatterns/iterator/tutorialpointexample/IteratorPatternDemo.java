package designpatterns.iterator.tutorialpointexample;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator iter = namesRepository.getIterator();

        // Forward iteration
        System.out.println("Forward Iteration:");
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

        // Reverse iteration
        System.out.println("\nReverse Iteration:");
        while (iter.hasPrevious()) {
            String name = (String) iter.previous();
            System.out.println("Name: " + name);
        }
    }
}