import java.util.Scanner;

public class CalcTax {

    // Method to compute amountSalary tax
    public static double computeIncomeTax(double amountSalary, Boolean localEmployee) {
        double tax = 0;
        if(localEmployee == Boolean.TRUE)
        {

            if(amountSalary >=0 && amountSalary < 18000)
            {
                tax = 0;
            }
            else if(amountSalary >= 18000 && amountSalary < 30000)
            {
                tax = amountSalary * 0.1;
            }
            else if(amountSalary >= 30000 && amountSalary < 50000)
            {
                tax = 2000 + ((amountSalary - 30000) * 0.18);
            }
            else if(amountSalary >= 50000 && amountSalary < 100000)
            {
                tax = 5000 + ((amountSalary - 50000) * 0.20);
            }
            else if(amountSalary >= 100000)
            {
                tax = 10000 + ((amountSalary - 100000) * 0.30);
            }
            else
            {
                return -1;
            }
        }
        else if(localEmployee == Boolean.FALSE)
        {
            if(amountSalary >=0 && amountSalary < 18000)
            {
                tax = amountSalary * 0.1;
            }
            else if(amountSalary >= 18000 && amountSalary < 30000)
            {
                tax = amountSalary * 0.15;
            }
            else if(amountSalary >= 30000 && amountSalary < 50000)
            {
                tax = 4000 + ((amountSalary - 30000) * 0.20);
            }
            else if(amountSalary >= 50000 && amountSalary < 100000)
            {
                tax = 10000 + ((amountSalary - 50000) * 0.25);
            }
            else if(amountSalary >= 100000)
            {
                tax = 20000 + ((amountSalary - 100000) * 0.35);
            }
            else{
                return -1;
            }
        }
        else {
            return -1;
        }
        return Double.parseDouble(String.format("%.2f", tax));
    }

    public static void main(String[] args) {



        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your income: $");
            double amountSalary = scanner.nextDouble();
            if(amountSalary < 0)
            {
                throw new RuntimeException("-1");
            }
            System.out.print("Are you a local employee? (true/false): ");
            Boolean localEmployee = scanner.nextBoolean();


            double incomeTax = computeIncomeTax(amountSalary, localEmployee);


            System.out.println("Your income tax is: $" + incomeTax);

            scanner.close();

        } catch (Exception e) {
            throw new RuntimeException("-1");
        }

    }
}