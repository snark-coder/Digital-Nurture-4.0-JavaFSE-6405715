package InventoryManagement;
import java.util.*;
public class Task {
    int taskId;
    String taskName;
    String status;
    

    static LinkedList<Task> tasks = new LinkedList<>();
    

    public Task(int taskId, String taskName, String status){
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
       
    }



    public void add(){
        tasks.add(this);
    }

    public int search(){
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i) == this){
                System.out.println( "Task "+this.taskId+" found at the position "+i);
                return i;
            }
        }

        System.out.println("The given   Task isnt here!");
        return -1;
    }

    public static void traverse(){
        for(int i=0;i<tasks.size();i++){
            System.out.println("Details of  Task "+i);
            System.out.println( "Task Id: "+tasks.get(i).taskId);
            System.out.println("Name: "+tasks.get(i).taskName);
            System.out.println("Position: "+tasks.get(i).status);
            
        }
    }

    public void delete(){
        int pos = this.search();
        if(pos != -1){
            tasks.remove(pos);
        }
    }

    public static void main(String[] args){
        Task t1 = new   Task(1, "Learn Java", "Completed");
        Task t2 = new   Task(2, "Finish UX course", "Pending");
        Task t3 = new   Task(3, "Film a video", "Completed");
        Task t4 = new   Task(4, "Journal", "Postponed");

        t1.add();
        t2.add();
        t3.add();
        t4.add();

        t1.search();
        traverse();
        t2.delete();
        traverse();
        t2.search();
    }
}
