package ProxyPatternExample;

// this si like a security guard that manages access to the real object (here, real Image)
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    public void display(){
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    public static void main(String[] args){
        Image image = new ProxyImage("smtg.jpg");

        
        image.display();


    }
}
