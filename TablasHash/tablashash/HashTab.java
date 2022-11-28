package tablashash;

public class HashTab {
    private EmpLinkedList[] empLinkedListArray;
    private int size;

   //
    public HashTab(int size) {
       
        this.empLinkedListArray = new EmpLinkedList[size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

   
    public void remove(int id) {
        int is = hashFun(id);
        empLinkedListArray[is].remove(id);
    }

    
    public void key(int id) {
        int is = hashFun(id);
        Emp emp = empLinkedListArray[is].key(id);
        if (emp != null) {
            System.out.println("id valor correspondiente:" + emp);
        }
    }


   
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

   
    public void add(Emp emp) {

       
        int empLinkedListNO = hashFun(emp.id);

        
        empLinkedListArray[empLinkedListNO].add(emp);
    }

    
    private int hashFun(int id) {
        return id % size;
    }

}
