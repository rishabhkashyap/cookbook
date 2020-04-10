package patterns.src.decorator;

public class Footer2 extends ComponentDecorator {

    public Footer2(Component component) {
        super(component);
    }

    public void printTicket() {
        super.printTicket();
        System.out.println("===============================================");
        System.out.println("######FOOTER2#######");
        System.out.println("===============================================");

    }
}
