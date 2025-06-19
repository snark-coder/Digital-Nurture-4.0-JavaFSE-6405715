package InventoryManagement;
import java.util.*;
public class Order {

    int orderId;
    String customerName;
    float totalPrice;
    static int ind = 0;
    static ArrayList<Order> orders = new ArrayList<>();

    public Order(int oid, String custName, float totPrice){
        this.orderId = oid;
        this.customerName = custName;
        this.totalPrice = totPrice;
        orders.add(this);
    }
    public static void main(String[] args){
        Order order1 = new Order(1, "Durga", 7000);
        Order order2 = new Order(2, "Kundan", 8000);
        Order order3 = new Order(3, "Chandrakala", 6000);
        Order order4 = new Order(4, "Venkat", 5000);
        Order order5 = new Order(5, "Vaishnavi", 4000);
        bubble_sort();
        quick_sort();
    }

    static void bubble_sort(){
        float[] order_price = new float[orders.size()];

        for(int i=ind;i<orders.size();i++){
            order_price[i] = (orders.get(i)).totalPrice;
        }

        // for(int i=0;i<order_price.length;i++){
        //     System.out.print(order_price[i]+" ");
        // }

        for(int i=0;i<orders.size();i++){
            for(int j=0;j<orders.size()-i-1;j++){
                if(order_price[j]>order_price[j+1]){
                float temp = order_price[j];
                order_price[j] = order_price[j+1];
                order_price[j+1] = temp;
                }

            }
        }

        for(int i=0;i<order_price.length;i++){
            System.out.print(order_price[i]+" ");
        }
        System.out.println();
    }

    static void quick_sort(){
         float[] order_price = new float[orders.size()];

        for(int i=ind;i<orders.size();i++){
            order_price[i] = (orders.get(i)).totalPrice;
        }

        partition(order_price, 0, order_price.length-1);

        for(int i=0;i<order_price.length;i++){
            System.out.print(order_price[i]+" ");
        }

        System.out.println();
    }

    static int partition(float[] arr, int low, int high) {
       
        float pivot = arr[high];
        
        
        int i = low - 1;

       
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        
        swap(arr, i + 1, high);  
        return i + 1;
    }

 
    static void swap(float[] arr, int i, int j) {
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   
    static void quickSort(float[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
