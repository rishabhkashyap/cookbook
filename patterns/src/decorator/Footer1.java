package patterns.src.decorator;

public class Footer1 extends ComponentDecorator{

    public Footer1(Component component) {
        super(component);
    }

    public void printTicket(){
        super.printTicket();
        System.out.println("===============================================");
        System.out.println("######FOOTER1#######");
        System.out.println("===============================================");


    }
}
