public class No<T> {
    private T no;
    private No<T> next;
    private No<T> previous;

    public No<T> getPrevious() {
        return previous;
    }

    public void setPrevious(No<T> previous) {
        this.previous = previous;
    }

    public T getNo() {
        return no;
    }

    public void setNo(T no) {
        this.no = no;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "no=" + no +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
