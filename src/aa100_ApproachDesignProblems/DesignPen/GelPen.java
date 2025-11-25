package aa100_ApproachDesignProblems.DesignPen;

public class GelPen extends Pen {

    public GelPen() {
        Refill refill = new Refill();
    }

    @Override
    public void write() {
        System.out.println("GelPen Writing");
    }
}
