public class Linkedlist<T> {
    private No<T> fist;
    private No<T> last;
    private No<T> previous;
    private No<T> current;
    public void add(User element){
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
    public String search(String cpfSearch){
        No<T> current = fist;
        if(current==null){
            System.out.println("Empty user list!!!");
            return null;
        }else{
            while(current!=null){
                if (current.getNo().getCpf().equals(cpfSearch)) {
                    System.out.println("\nUser found!!! "+
                    "\nName: "+current.getNo().getUserName()+
                    "\nEmail: "+current.getNo().getEmail()+
                    "\nCPF: "+current.getNo().getCpf()+"\n");
                    return current.getNo().getUserName();
                }
                current = current.getNext();
            }
        }
        return current.getNo().getUserName();
    }
    public boolean deleteUser(String nameUserDelete){
        No<T> current = fist;
        if(current==null){
            System.out.println("Empty user list!!!");
            return false;
        }else{
            while(current!=null){
                if (current.getNo().getUserName().equals(nameUserDelete)) {
                    try {
                        if(current.getNext()==null){
                            current=null;
                            fist=null;
                            last=null;
                            return true;
                        }
                        No<T>previous = current.getPrevious();
                        No<T>next = current.getNext();
                        previous.setNext(next);
                        next.setPrevious(previous);
                        current.setPrevious(null);
                        current.setNext(null);
                        return true;
                    }catch (Exception e){
                        System.out.println(e.getLocalizedMessage());
                        System.out.println(e.getMessage());
                        return false;
                    }
                }
                current = current.getNext();
            }
        }
        return false;
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
        sb.append("\n");
        return sb.toString();
    }
}
