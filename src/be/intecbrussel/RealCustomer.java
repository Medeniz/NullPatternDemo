package be.intecbrussel;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
