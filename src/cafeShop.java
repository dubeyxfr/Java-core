package ObjectJava;

class CafeShop {
    static int totalCustomers = 0; // Static variable
    static int maxMenuItems = 5;

    String cafeName;
    String[] menuItems;
    double[] menuPrices;
    int itemCount;
    int customerOrders;

    // Initialization block
    {
        totalCustomers++;
    }

    // Constructor
    CafeShop(String name) {
        this.cafeName = name;
        this.menuItems = new String[maxMenuItems];
        this.menuPrices = new double[maxMenuItems];
        this.itemCount = 0;
        this.customerOrders = 0;
    }

    // Add menu item
    void addMenuItem(String item, double price) {
        if (itemCount < maxMenuItems) {
            menuItems[itemCount] = item;
            menuPrices[itemCount] = price;
            itemCount++;
        } else {
            System.out.println("Menu is full! Cannot add more items.");
        }
    }

    // Show menu
    void showMenu() {
        System.out.println("\n--- " + cafeName + " Menu ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - ₹" + menuPrices[i]);
        }
    }

    // Order an item
    void orderItem(int choice, int quantity) {
        if (choice > 0 && choice <= itemCount) {
            double total = menuPrices[choice - 1] * quantity;
            customerOrders++;
            System.out.println("You ordered " + quantity + " x " + menuItems[choice - 1]);
            System.out.println("Bill for this order: ₹" + total);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static int getTotalCustomers() {
        return totalCustomers;
    }
}

// Main Class
class CafeApp {
    public static void main(String[] args) {
        CafeShop myCafe = new CafeShop("Java Cafe");

        // Add menu items
        myCafe.addMenuItem("Coffee", 50);
        myCafe.addMenuItem("Burger", 120);
        myCafe.addMenuItem("Pizza", 250);
        myCafe.addMenuItem("Sandwich", 100);
        myCafe.addMenuItem("Pasta", 150);

        // Show menu
        myCafe.showMenu();

        // Place orders
        myCafe.orderItem(1, 2); // 2 Coffee
        myCafe.orderItem(3, 1); // 1 Pizza

        // Show total customers
        System.out.println("\nTotal Customers Served: " + CafeShop.getTotalCustomers());
    }
}
