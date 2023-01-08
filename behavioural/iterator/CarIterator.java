package behavioural.iterator;

public interface CarIterator {
    Car getFirst();

    Car getCurrent();

    Car getNext();

    boolean isDone();

    void reset();
}
