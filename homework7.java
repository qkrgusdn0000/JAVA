public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer {
    protected String model;
    protected int printedCount;
    protected int availableCount;
    abstract public boolean print();
}

class InkjetPrinter extends Printer {
    InkjetPrinter(String model, int availableCount){
        this.model=model;
        this.availableCount=availableCount;
    }
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.printf("%s: %d 매째 인쇄 실패 - 잉크 부족", model, printedCount + 1);
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}

class LaserPrinter extends Printer {
    LaserPrinter(String model, int availableCount){
        this.model=model;
        this.availableCount=availableCount;
    }
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.printf("\n%s: %d 매째 인쇄 실패 - 토너 부족", model, printedCount + 1);
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}
