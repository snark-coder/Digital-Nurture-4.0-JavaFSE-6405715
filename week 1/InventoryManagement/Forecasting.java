package InventoryManagement;

public class Forecasting {
    public static void recursive(int i){
        if(i >= 10){
            System.out.println("The maximum future value reached!");
            return;
        }

        recursive(i+1);
    }

    public static void main(String[] args){
        recursive(0);
    }
}
