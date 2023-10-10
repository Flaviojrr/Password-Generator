public class Linkedlist<T> {
    private No<T> fist;
    private No<T> last;
    private No<T> previous;
    private No<T> current;

    public void add(T element){
        No<T> no = new No<T>();
        no.setNo(element);
        if(fist==null && last==null){
            fist=no;
            last=no;
            no.setPrevious(null);
        }else{
            fist.setPrevious(no);
            no.setNext(fist);
            fist=no;
            no.setPrevious(null);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("/////Users////");
        No<T> current = fist;

        while (current != null) {
            sb.append(current.getNo());
            if (current.getNext() != null) {
                sb.append("\n");
            }
            current = current.getNext();
        }

        sb.append("}");
        return sb.toString();
    }
}
