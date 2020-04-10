package patterns.src.decorator;

public class Header3 extends ComponentDecorator{

    public Header3(Component component) {
        super(component);
    }

    public void printTicket(){
        System.out.println("===============================================");
        System.out.println("######HEADER3#######");
        System.out.println("===============================================");
        super.printTicket();
    }
}
