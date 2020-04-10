package patterns.src.decorator;

public class Header2 extends ComponentDecorator{

    public Header2(Component component) {
        super(component);
    }

    public void printTicket(){
        System.out.println("===============================================");
        System.out.println("######HEADER2#######");
        System.out.println("===============================================");
        super.printTicket();
    }
}
