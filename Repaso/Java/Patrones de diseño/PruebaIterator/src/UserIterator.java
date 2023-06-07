public interface UserIterator {
    User next();
    void reset();
    boolean hasMore();
}
