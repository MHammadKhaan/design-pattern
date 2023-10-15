package designpatterns.iterator.tutorialpointexample;

public class NameRepository implements Container {
    public String names[] = {"ashar", "awais", "hammad", "hozefa"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public Object previous() {
            if (this.hasPrevious()) {
                return names[--index];
            }
            return null;
        }
    }
}
