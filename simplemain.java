
import java.math.BigDecimal;

class simplemain{
    public static void main(String[] args) {
        Simpleinterest obj1 = new Simpleinterest("4500.00","7.5");
        Simpleinterest obj2 = new Simpleinterest("5");
        BigDecimal result = obj1.principle.multiply(obj1.interest).multiply(obj2.year).divide
        (new BigDecimal("100"));
        System.out.println("The simple interest is: " + result);



    }
}