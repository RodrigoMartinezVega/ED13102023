package tablashash;

public class EmpLinkedList {
	
    private Emp head;
public EmpLinkedList() {
	// TODO Auto-generated constructor stub
}

    
    public void remove(int id) {
        if (head == null) {
            return;
        }
        Emp temp = head;

        while (true) {
            if (temp.id == id) {
                
                head = temp.next;
                break;
            }

            if (temp.next == null) {
                break;
            }

            if (temp.next.id == id) {
               
                temp.next = temp.next.next;
                break;
            }

           
            temp = temp.next;
        }
    }

    
    public Emp key(int id) {
        if (head == null) {
            return null;
        }
        Emp temp = head;
        while (true) {
            if (temp.id == id) {
                break;
            }
            if (temp.next == null) {
                temp = null;
                break;
            }
            
            temp = temp.next;
        }
        return temp;
    }

   
    public void list(int no) {
        if (head == null) {
            System.out.println("Sección" + (no + 1) + "La lista vinculada está vacía");
            return;
        }
        System.out.print("Sección" + (no + 1) + "Información de la lista vinculada para");
        Emp temp = head;
        while (true) {
            System.out.print(temp + " --> ");
            if (temp.next == null) {
                break;
            }
            
            temp = temp.next;
        }
        System.out.println();
    }

    
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp temp = head;
        while (temp.next != null) {
         
            temp = temp.next;
        }
        temp.next = emp;
    }
}
