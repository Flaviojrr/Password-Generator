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
            no.setNext(null);
        }else{
            last.setNext(no);
            no.setPrevious(last);
            no.setNext(null);
            last=no;
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
                if (current.getNo().getCpf().equals(nameUserDelete)){
                    try {
                        if(current.getNo().getCpf().equals(fist.getNo().getCpf())){
                            if(current.getNext()==null){
                                fist=null;
                                last=null;
                                return true;
                            }
                            fist=current.getNext();
                            fist.setPrevious(null);
                            fist.setNext(null);
                            current.setNext(null);
                            System.out.println("primeiro elemento da lista deletado");
                            return true;
                        }else if(current.getNo().getCpf().equals(last.getNo().getCpf())){
                            if(current.getPrevious()==null){
                                fist=null;
                                last=null;
                                return true;
                            }
                            last=current.getPrevious();
                            last.setNext(null);
                            current.setPrevious(null);
                            System.out.println("Ultimo elemento da lista deletado");
                            return true;
                        }else{
                            No<T>previous = current.getPrevious();
                            No<T>next = current.getNext();
                            previous.setNext(next);
                            next.setPrevious(previous);
                            current.setPrevious(null);
                            current.setNext(null);
                            System.out.println("Elemento em qualquer posição da lista deletado (tirando o primeiro e ultimo)");
                            return true;
                        }
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
