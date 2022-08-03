package addstudent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * @author Bethel Court
 */
class LinkedList {
    
    AddStudent first=null;
   
    public void addFirst(String id, String name){
        AddStudent node = new AddStudent(id,name);
        if(first==null)
            first=node;
        else{
            node.next=first;
            first=node;
        }
    }   
    
   public void Display(JTable table1){
        AddStudent current = first;
 
        int count = 0;
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        
        while(current!=null)
        {
            System.out.println(current.id + " "+ current.name);
            model.addRow(new Object[]{current.id, current.name});
            count++;
            current=current.next;
        } 
    }
}
    

