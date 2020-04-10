package patterns.src.decorator;

public class Header1  extends ComponentDecorator{

    public Header1(Component component) {
        super(component);
    }

    public void printTicket(){
        System.out.println("===============================================");
        System.out.println("######HEADER1#######");
        System.out.println("===============================================");
        super.printTicket();
    }
}
