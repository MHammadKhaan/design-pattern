package designpatterns.iterator.tutorialpointexample;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public boolean hasPrevious(); // New method for checking previous element
    public Object previous();     // New method for getting the previous element
}