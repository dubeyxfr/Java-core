package ObjectJava;

class CafeShop {
    static int maxCapacity = 50; // Maximum number of customers in the cafe

    String shopName;
    int currentCustomers;
    String[] customers;

    // Constructor
    CafeShop(String shopName) {
        this.shopName = shopName;
        this.currentCustomers = 0;
        this.customers = new String[maxCapacity];
    }

    // Add a customer
    void addCustomer(String customerName) {
        if (currentCustomers >= maxCapacity) {
            System.out.println("Cafe is full! Cannot add more customers.");
            return;
        }
        customers[currentCustomers] = customerName;
        currentCustomers++;
        System.out.println(customerName + " has entered the cafe.");
    }

    // Remove last customer
    void removeCustomer() {
        if (currentCustomers > 0) {
            System.out.println(customers[currentCustomers - 1] + " has left the cafe.");
            currentCustomers--;
        } else {
            System.out.println("No customers in the cafe to remove.");
        }
    }

    // Show all customers
    void showCustomers() {
        System.out.println("Current customers in " + shopName + ":");
        if (currentCustomers == 0) {
            System.out.println("No customers right now.");
        } else {
            for (int i = 0; i < currentCustomers; i++) {
                System.out.println((i + 1) + ". " + customers[i]);
            }
        }
    }

    public static void main(String[] args) {
        CafeShop myCafe = new CafeShop("Java Beans Cafe");

        myCafe.addCustomer("Alice");
        myCafe.addCustomer("Bob");
        myCafe.showCustomers();

        myCafe.removeCustomer();
        myCafe.showCustomers();
    }
}
