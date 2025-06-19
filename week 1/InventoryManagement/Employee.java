package InventoryManagement;

public class Employee {
    int empId;
    String name;
    String position;
    float salary;

    static Employee[] employees = new Employee[1000];
    static int index = 0;

    public Employee(int empId, String name, String position, float salary){
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }



    public void add(){
        employees[index] = this;
        index++;
    }

    public int search(){
        for(int i=0;i<index;i++){
            if(employees[i] == this){
                System.out.println("Employee "+this.empId+" found at the position "+i);
                return i;
            }
        }

        System.out.println("The given employee isnt here!");
        return -1;
    }

    public static void traverse(){
        for(int i=0;i<index;i++){
            System.out.println("Details of Employee "+i);
            System.out.println("Employee Id: "+employees[i].empId);
            System.out.println("Name: "+employees[i].name);
            System.out.println("Position: "+employees[i].position);
            System.out.println("Salary: "+employees[i].salary);
        }
    }

    public void delete(){
        int pos = this.search();
        int i = 0;
        if(pos != -1){
            for(i=pos;i<index-1;i++){
                employees[i] = employees[i+1];
            }

            employees[i] = null;
            index--;
        }
    }

    public static void main(String[] args){
        Employee e1 = new Employee(1, "Durga", "UX Designer", 300000);
        Employee e2 = new Employee(2, "Venkat", "Product Manager", 400000);
        Employee e3 = new Employee(3, "Chandrakala", "HR Manager",400000);
        Employee e4 = new Employee(4, "Kundan", "Employability Manager", 350000);

        e1.add();
        e2.add();
        e3.add();
        e4.add();

        e1.search();
        traverse();
        e2.delete();
        traverse();
        e2.search();
    }
}
