package AdapterPatternExample;

public class Adapter implements PaymentProcessor {

    Adaptee adaptee = new Adaptee();
    @Override
    public void processPayment(String paymentGateway){
        System.out.println("This is the adapter class overriding process payment method");

        if(paymentGateway == "phonepe"){
            adaptee.phonepe();
        }
        else if(paymentGateway == "razorpay"){
            adaptee.razorpay();
        }else{
            System.out.println("Incompatible payment gateway.");
        }
        
    }

    public static void main(String[] args){
        Adapter adapter = new Adapter();
        adapter.processPayment("phonepe");
        adapter.processPayment("razorpay");
        adapter.processPayment("razorpe");
    }
}
