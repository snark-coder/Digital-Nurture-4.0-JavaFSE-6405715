package BuilderPatternExample;

public class Computer {
    int cpu;
    int ram;
    int storage;

    private Computer(Builder b){
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
    }

    

    void setram(int ram){
            
            this.ram = ram;
        }

        void setcpu(int cpu){
           
            this.cpu = cpu;
        }

        void setstorage(int storage){
           
            this.storage = storage;
        }

    static class Builder{

        int cpu;
    int ram;
    int storage;

        public Computer build(){
            return new Computer(this);
        }

        public Builder CPU(int cpu){
        this.cpu = cpu;
        return this;
    }

    public Builder RAM(int ram){
        this.ram = ram;
        return this;
    }

    public Builder Storage(int storage){
        this.storage = storage;
        return this;
    }

        
    }

    public static void main(String[] args){
        Computer computer = new Computer.Builder().CPU(64).RAM(56).Storage(128).build();
        System.out.println(computer.cpu);
    }
}
