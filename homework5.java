public class Homework5 {
    public static void main(String[] args){
        Computer com=new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor mo=new Monitor("24 inch", "Black", "45W");
    PersonalComputer pc=new PersonalComputer(com,mo);
    pc.turnOn();
    pc.printinfo();
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;
    PersonalComputer(Computer computer, Monitor monitor){
        this.computer=computer;
        this.monitor=monitor;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printinfo(){
        computer.printinfo();
        monitor.printinfo();
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;
    Monitor(String monitorSize, String color, String power){
        this.monitorSize=monitorSize;
        this.color=color;
        this.power=power;
    }
    public String getMonitorSize() { return monitorSize; }
    public String getColor() { return color; }
    public String getPower() { return power; }

    public void turnOn(){
        System.out.println("Turning on the Monitor");
    }
    public void printinfo(){
        System.out.println("The Spec of the monitor");
        System.out.println("Size:" + monitorSize);
        System.out.println("Color" + color);
        System.out.println("Power" + power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu=cpu;
        this.memory=memory;
        this.hd=hd;
        this.color=color;
        this.power=power;
    }
    public String getColor() { return color; }
    public String getCpu() { return cpu; }
    public String getHd() { return hd; }
    public String getMemory() { return memory; }
    public String getPower() { return power; }

    public void turnOn(){
        System.out.println("Turning ont the Conputer");
    }
    public void printinfo(){
        System.out.println("The Spec of the computer");
        System.out.println("CPU:" + cpu);
        System.out.println("Memory" + memory);
        System.out.println("HDD" + hd);
        System.out.println("Color" + color);
        System.out.println("CPU" + cpu);
    }
}