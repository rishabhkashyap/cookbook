package patterns.src.decorator;

public class Footer3 extends ComponentDecorator {

    public Footer3(Component component) {
        super(component);
    }

    public void printTicket() {
        super.printTicket();
        System.out.println("===============================================");
        System.out.println("######FOOTER3#######");
        System.out.println("===============================================");
    }
}
