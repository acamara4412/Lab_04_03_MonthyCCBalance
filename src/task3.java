public class task3{
    public static void main(String[] args) {
        double cardbalance = 5000.00;
        double interestrate = 0.17;

        double interestMonth1 = cardbalance * interestrate;
        cardbalance = cardbalance + interestMonth1; // Update total balance
        System.out.println("The interest due after one month is: $" + interestMonth1);


        double interestMonth2 = cardbalance * interestrate;
        System.out.println("The interest due after two months is: $" + interestMonth2);
    }
}



