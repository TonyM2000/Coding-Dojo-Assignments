public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.00;
        double latte = 5.00;
        double capucchino = 8.00;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(displayTotalMessage + dripCoffee);
        System.out.println(isReadyOrder1 ? (customer1 + readyMessage): (customer1 + pendingMessage));
        System.out.println(isReadyOrder3 ? (customer3 + readyMessage + ", "+displayTotalMessage + dripCoffee): (customer3 + pendingMessage));
        System.out.println(isReadyOrder2 ? (displayTotalMessage + (latte+latte)+" "+customer2 + readyMessage) : (customer2 + pendingMessage));
        System.out.println(customer4 + displayTotalMessage + (latte-dripCoffee));
        // ** Your customer interaction print statements will go here ** //
    }
}
