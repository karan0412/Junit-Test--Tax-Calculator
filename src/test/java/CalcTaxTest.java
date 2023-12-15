import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTaxTest {

    /*----------------------------- BVA --------------------------------*/



    //Income < Boundary Income $0
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $-0.01 for income range $0 inclusive to $18000 exclusive - local employee")
    public void Test1Range1ForLocalEmployee() {
        double amountSalary = -0.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = -1;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $-0.01 for income range $0 inclusive to $18000 exclusive - international employee")
    public void Test1Range1ForInternationalEmployee() {
        double amountSalary = -0.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = -1;
        assertEquals(expectedTax, result, 0.001);
    }

    //-------------------------------------------------------------------------------------------

    //Income = Boundary Income $0
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $0 for income range $0 inclusive to $18000 exclusive - local employee")
    public void Test2Range1ForLocalEmployee() {
        double amountSalary = 0;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $0 for income range $0 inclusive to $18000 exclusive - international employee")
    public void Test2Range1ForInternationalEmployee() {
        double amountSalary = 0;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }

    //-------------------------------------------------------------------------------------------


    //Income > Boundary Income $0
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $0.01 for income range $0 inclusive to $18000 exclusive - local employee")
    public void Test3Range1ForLocalEmployee() {
        double amountSalary = 0.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $0.01 for income range $0 inclusive to $18000 exclusive - international employee")
    public void Test3Range1ForInternationalEmployee() {
        double amountSalary = 0.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------


    //Income < Boundary Income $18000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $17999.99 for income range $0 inclusive to $18000 exclusive - local employee")
    public void Test4Range1ForLocalEmployee() {
        double amountSalary = 17999.99;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $17999.99 for income range $0 inclusive to $18000 exclusive - international employee")
    public void Test4Range1ForInternationalEmployee() {
        double amountSalary = 17999.99;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 1800;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income = Boundary Income $18000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $18000 for income range $18000 inclusive to $30000 exclusive - local employee")
    public void Test1ForRange2LocalEmployee() {
        double amountSalary = 18000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 1800;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $18000 for income range $18000 inclusive to $30000 exclusive - international employee")
    public void Test1ForRange2InternationalEmployee() {
        double amountSalary = 18000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 2700;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income > Boundary Income $18000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $18000.01 for income range $18000 inclusive to $30000 exclusive - local employee")
    public void Test2ForRange2LocalEmployee() {
        double amountSalary = 18000.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 1800;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $18000.01 for income range $18000 inclusive to $30000 exclusive - international employee")
    public void Test2ForRange2InternationalEmployee() {
        double amountSalary = 18000.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 2700;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income < Boundary Income $30000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $29999.99 for income range $18000 inclusive to $30000 exclusive - local employee")
    public void Test3ForRange2LocalEmployee() {
        double amountSalary = 29999.99;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 3000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $29999.99 for income range $18000 inclusive to $30000 exclusive - international employee")
    public void Test3ForRange2InternationalEmployee() {
        double amountSalary = 29999.99;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 4500;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income = Boundary Income $30000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $30000 for income range $30000 inclusive to $50000 exclusive - local employee")
    public void Test1ForRange3LocalEmployee() {
        double amountSalary = 30000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 2000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $30000 for income range $30000 inclusive to $50000 exclusive - international employee")
    public void Test1ForRange3InternationalEmployee() {
        double amountSalary = 30000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 4000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income > Boundary Income $30000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $30000.01 for income range $30000 inclusive to $50000 exclusive - local employee")
    public void Test2ForRange3LocalEmployee() {
        double amountSalary = 30000.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 2000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $30000.01 for income range $30000 inclusive to $50000 exclusive - international employee")
    public void Test2ForRange3InternationalEmployee() {
        double amountSalary = 30000.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 4000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income < Boundary Income $50000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $49999.99 for income range $30000 inclusive to $50000 exclusive - local employee")
    public void Test3ForRange3LocalEmployee() {
        double amountSalary = 49999.99;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 5600;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $49999.99 for income range $30000 inclusive to $50000 exclusive - international employee")
    public void Test3ForRange3InternationalEmployee() {
        double amountSalary = 49999.99;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 8000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income = Boundary Income $50000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $50000 for income range $50000 inclusive to $100000 exclusive - local employee")
    public void Test1ForRange4LocalEmployee() {
        double amountSalary = 50000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 5000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $50000 for income range $50000 inclusive to $100000 exclusive - international employee")
    public void Test1ForRange4InternationalEmployee() {
        double amountSalary = 50000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 10000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income > Boundary Income $50000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $50000.01 for income range $50000 inclusive to $100000 exclusive - local employee")
    public void Test2ForRange4LocalEmployee() {
        double amountSalary = 50000.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 5000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $50000.01 for income range $50000 inclusive to $100000 exclusive - international employee")
    public void Test2ForRange4InternationalEmployee() {
        double amountSalary = 50000.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 10000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income < Boundary Income $100000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $99999.99 for income range $50000 inclusive to $100000 exclusive - local employee")
    public void Test3ForRange4LocalEmployee() {
        double amountSalary = 99999.99;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 15000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $99999.99 for income range $50000 inclusive to $100000 exclusive - international employee")
    public void Test3ForRange4InternationalEmployee() {
        double amountSalary = 99999.99;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 22500;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income = Boundary Income $100000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $100000 for income range $100000 and above - local employee")
    public void Test1ForRange5LocalEmployee() {
        double amountSalary = 100000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 10000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $100000 for income range $100000 and above - international employee")
    public void Test1ForRange5InternationalEmployee() {
        double amountSalary = 100000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 20000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

    //Income > Boundary Income $100000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income $100000.01 for income range $100000 and above - local employee")
    public void Test2ForRange5LocalEmployee() {
        double amountSalary = 100000.01;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 10000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for income $100000.01 for income range $100000 and above - international employee")
    public void Test2ForRange5InternationalEmployee() {
        double amountSalary = 100000.01;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 20000;
        assertEquals(expectedTax, result, 0.001);
    }




    /*----------------------------- EP --------------------------------*/


    //Income < $0
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for income any income less than $0 - local employee")
    public void Test1Partition1ForLocalEmployee() {
        double amountSalary = -5;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = -1;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income less than $0 - international employee")
    public void Test1Partition1ForInternationalEmployee() {
        double amountSalary = -5;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = -1;
        assertEquals(expectedTax, result, 0.001);
    }

    //-------------------------------------------------------------------------------------------


    //Income >= $0 and Income < $18000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for any income between $0 inclusive and $18000 exclusive - local employee")
    public void Test1Partition2ForLocalEmployee() {
        double amountSalary = 6000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 0;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income between $0 inclusive and $18000 exclusive - international employee")
    public void Test1Partition2ForInternationalEmployee() {
        double amountSalary = 6000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 600;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------


    //Income >=$18000 and Income < $30000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for any income between $18000 inclusive and $30000 exclusive - local employee")
    public void Test1Partition3ForLocalEmployee() {
        double amountSalary = 25000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 2500;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income between $18000 inclusive and $30000 exclusive - international employee")
    public void Test1Partition3ForInternationalEmployee() {
        double amountSalary = 25000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 3750;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------


    //Income >=$30000 and Income < $50000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for any income between $30000 inclusive and $50000 exclusive - local employee")
    public void Test1Partition4ForLocalEmployee() {
        double amountSalary = 40000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 3800;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income between $30000 inclusive and $50000 exclusive - international employee")
    public void Test1Partition4ForInternationalEmployee() {
        double amountSalary = 40000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 6000;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------


    //Income >= $50000 and Income < $100000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for any income between $50000 inclusive and $100000 exclusive - local employee")
    public void Test1Partition5ForLocalEmployee() {
        double amountSalary = 75000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 10000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income between $0 inclusive and $18000 exclusive - international employee")
    public void Test1Partition5ForInternationalEmployee() {
        double amountSalary = 75000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 16250;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------


    //Income >= $100000
    //Local employee = true
    @Test
    @DisplayName("Should output correct result for any income above $100000 inclusive - local employee")
    public void Test1Partition6ForLocalEmployee() {
        double amountSalary = 550000;
        boolean localEmployee = true;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 145000;
        assertEquals(expectedTax, result, 0.001);
    }

    //Local employee = false
    @Test
    @DisplayName("Should output correct result for any income above $100000 inclusive - international employee")
    public void Test1Partition6ForInternationalEmployee() {
        double amountSalary = 550000;
        boolean localEmployee = false;
        double result = CalcTax.computeIncomeTax(amountSalary, localEmployee);
        double expectedTax = 177500;
        assertEquals(expectedTax, result, 0.001);
    }


    //-------------------------------------------------------------------------------------------

}