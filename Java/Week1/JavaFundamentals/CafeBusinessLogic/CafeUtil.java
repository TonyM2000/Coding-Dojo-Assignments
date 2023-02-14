import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int count = 0;
        int sum = 0;
        while(count<=10){
            sum = sum+count;
            count++;
        }
        return sum;
    }
    double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0 ; i < prices.length; i++){
            total = total + prices[i];
        }
        return total;
    }
    void displayMenu(ArrayList<String> menuItems){
        for(String s : menuItems) {
            System.out.println(s);
        }
    }
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.printf("Hello %s !",userName);
        System.out.printf("There are %d people in front of you",customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

}
