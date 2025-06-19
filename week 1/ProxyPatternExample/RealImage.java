package ProxyPatternExample;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading "+filename);
    }
    
    public void display(){
        System.out.println("This is a Real Image");
    }
}
    

