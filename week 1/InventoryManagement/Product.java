package InventoryManagement;
import java.util.*;

class Product{

    int productId;
    String productName;
    int quantity;
    float price;
    

    

    static HashMap<Integer, Product> inventory = new HashMap<>();  
    static List<Integer> array = new ArrayList<>();

    public Product(int pId, String pName, int quant, float price){
        this.productId = pId;
        this.productName = pName;
        this.quantity = quant;
        this.price = price;
        this.add();
        array.add(this.productId);
    }
    public static void main(String[] args){
       Product p1 = new Product(1, "Laptop", 60, 789);
       Product p2 = new Product(2, "Pencils", 70, 100);
       Product p3 = new Product(3, "Paper", 200, 200);
       Product p4 = new Product(4, "Chargers", 60, 500);
       Product p5 = new Product(5, "Highlighters", 15, 300);
       Product p6 = new Product(6, "Highlighters", 15, 300);
       
       // add automatically when a product is added
       // update the product name
       p1.updateName("Desktop");
       display();
       // delete the product from the inventory
       
       p6.delete();
       display();
       p6.binary_search(p3);

       


        
    }

    void add(){
     inventory.put(this.productId, this);
    }

    void updateId(int pid){
   
     inventory.remove(this.productId);
        this.productId = pid;
     inventory.put(this.productId, this);
        
    }

    void updateName(String pname){
        
        this.productName = pname;
     inventory.put(this.productId, this);
        
    }

    void delete(){
        if (inventory.containsKey(this.productId)){
         inventory.remove(this.productId);
        }else{
            System.out.println(this.productName+" is not present in the inventory!");
        }
    }

   static void display(){
        System.out.println("The inventory is as follows: ");
        for(Integer pid: inventory.keySet()){
            Product p = inventory.get(pid);
        System.out.println(p.productName+" "+p.quantity+" "+p.price);
       }
    }

    void linear_search(Product p){
        for(int i=0;i<array.size();i++){
            if(array.get(i) == p.productId){
                System.out.println("The product is found at "+i);
            }
        }    
        
    }

    void binary_search(Product p){
       Collections.sort(array);
        int low = 0;
        int high = array.size()-1;
        
        while (low <= high){
            int mid = (int)((low+high)/2);

            if(array.get(mid) == p.productId){
                System.out.println("The product is found at "+mid);
                return;
            }

            if(mid > p.productId){
                high = mid-1;
            }

            else if(mid < p.productId){
                low = mid+1;
            }
        }

        System.out.println("Its not found!");
        return;
        
    }





    
}