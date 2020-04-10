package patterns.src.decorator;

public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void printTicket() {
        component.printTicket();
    }
}
