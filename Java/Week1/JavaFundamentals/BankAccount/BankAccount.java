// Type psvm and hit tab on line 1 to set up public static void main arg stuff
package Week1.JavaFundamentals.BankAccount;
public class BankAccount{
        double CheckingBalance = 0.0;
        double SavingsBalance = 0.0;
        double TotalBalance = 0.0;
        static int numberOfAccounts = 0;
        static double totalAcrossAccounts = 0;
        //constructor
        public BankAccount(){
            numberOfAccounts++;
        }
        //getter (gets the info)
        public double getCheckingBalance() {
            return CheckingBalance;
        }
        //setter (sets the info) this will not be used in this program since 
        // you dont set bank balances, you add to them. This is still useful.
        public void  setCheckingBalance(double number) {
            this.CheckingBalance = number;
        }
        //deposit (alters the amount for checking balance thru addition)
        public void depositCheckingBalance(double number){
            this.CheckingBalance += number;
            totalAcrossAccounts += number;
        }
        //withdrawal (removes money from the account)
        public void withdrawCheckingBalance(double number){
            if (number > this.CheckingBalance){
                System.out.print("Insufficient Funds.");
            }
            else{
            this.CheckingBalance -= number;
            totalAcrossAccounts -= number;
            }
        }
        //getter (gets the info)
        public double getSavingsBalance() {
            return SavingsBalance;
        }
        //setter (sets the info) this will not be used in this program since 
        // you dont set bank balances, you add to them. This is still useful.
        public void  setSavingsBalance(double number) {
            this.SavingsBalance = number;
        }
        //deposit (alters the amount for checking balance thru addition)
        public void depositSavingsBalance(double number){
            this.SavingsBalance += number;
            totalAcrossAccounts += number;
        }
        //withdrawal (removes money from the account)
        public void withdrawSavingsBalance(double number){
            if (number > this.SavingsBalance){
                System.out.print("Insufficient Funds.");
            }
            else{
            this.SavingsBalance -= number;
            totalAcrossAccounts -= number;
            }
        }
        //getter for total
        public double GetTotalBalance() {
            this.TotalBalance = this.SavingsBalance+this.CheckingBalance;
            return this.TotalBalance;
        }
        //check both balances
        public void getBalance() {
            GetTotalBalance();
            System.out.printf("Your checking balance is %.2f your savings balance is %.2f and your total balance is %.2f \n",this.CheckingBalance,this.SavingsBalance,this.TotalBalance);
        }
    }