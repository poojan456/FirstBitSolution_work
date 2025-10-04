package P1;
import p2.Dnode;

public class DLL {
    Dnode start;
    Dnode end;
    int count = 0;
    
    
    public static void main(String[] args) {
        Dnode n1 = new Dnode(10);
        Dnode n2 = new Dnode(30);
        Dnode n3 = new Dnode(20);
        Dnode ref1 = new Dnode(100);

        DLL demo = new DLL();
        
        demo.insertAtEnd(n1);
        demo.insertAtEnd(n2);
        demo.insertAtEnd(n3);
        
        demo.insertAtEnd(ref1);

        demo.insertAtAnyPos(new Dnode(99), 3); // insert 99 at position 3
        demo.insertAtBeg(new Dnode(5));               
        demo.insertAtAnyPos(new Dnode(200), 7); // insert at end using position
        demo.deleteAtBeg();
        demo.deleteAtEnd();
        demo.deleteAtAnyPos(4);
        
        

        System.out.println("Forward traversal:");
        demo.display();
    }

  
    void insertAtBeg(Dnode ref) {
        if (start == null) {
            start = ref;
            end = ref;
        } else {
            ref.next = start;
            start.prev = ref;
            start = ref;
        }
        count++;
    }
    
    void insertAtEnd(Dnode ref) {
        if (start == null) {
            start = ref;
            end = ref;
        } else {
        	
            end.next = ref;
            ref.prev = end;
            end = ref;
        }
        
        count++;
    }
                                                                                                                                                                                                                                                          
    void insertAtAnyPos(Dnode ref, int pos) {
        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid Position!");
            return;
        }
        
        if (pos == 1) {
        	
            insertAtBeg(ref);
        }

        // case 2: insert at end
        if (pos == count + 1) {
            insertAtEnd(ref);
            return;
        }
        
        // case 3: insert in middle
        Dnode current;
        if (pos <= count / 2) {
            current = start;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
        } else {
            current = end;
            for (int i = count; i > pos - 1; i--) {
                current = current.prev;
            }
        }

        ref.next = current.next;
        ref.prev = current;
        current.next.prev = ref;
        current.next = ref;
        count++;
    }
    
    void deleteAtBeg() {
        if (start == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        if (start == end) { // only one node
            start = null;
            end = null;
        } else {
            start = start.next;
            start.prev = null;
        }
        count--;
    }
    
    
    void deleteAtEnd() {
        if (end == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        if (start == end) { // only one node present
            System.out.println("Deleted: " + end.getData());
            start = null;
            end = null;
        } else {
            System.out.println("Deleted: " + end.getData());
            end = end.prev;     // move end to previous node
            end.next = null;    // remove link to old last node
        }
        count--;
    }

    
    void deleteAtAnyPos(int pos) {
        if (pos < 1 || pos > count) {
            System.out.println("Invalid Position!");
            return;
        }

        // case 1: delete at beginning
        if (pos == 1) {
            deleteAtBeg();
            return;
        }

        // case 2: delete at end
        if (pos == count) {
            deleteAtEnd();
            return;
        }

        // case 3: delete in middle
        Dnode current;
        if (pos <= count / 2) {
            current = start;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
        } else {
            current = end;
            for (int i = count; i > pos; i--) {
                current = current.prev;
            }
        }

        System.out.println("Deleted: " + current.getData());
        current.prev.next = current.next;
        current.next.prev = current.prev;

        count--;
    }


    
    public void display() {
        if (start == null) {
            System.out.println("List is empty");
            
        } else {
            Dnode itr = start;
            
            while (itr != null){
            	
                System.out.print("[" + itr.getData() + "] -> ");
                
                itr = itr.next;
            }
            System.out.println("null");
        }
    }
}


