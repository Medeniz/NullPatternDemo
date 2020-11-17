package be.intecbrussel;

public class CustomerFactory {

    final static String[] NAMES = {"Jack", "Tom", "Ferdinand", "Micheal"};

    public static AbstractCustomer getCustomer(String name) {
        for (String names : NAMES) {
            if (names.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
