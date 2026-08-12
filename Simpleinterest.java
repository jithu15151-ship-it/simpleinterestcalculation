import java.math.BigDecimal;
public class Simpleinterest{
    BigDecimal principle;
    BigDecimal interest;
    BigDecimal year;
    Simpleinterest(String principle,String interest){
        this.principle=new BigDecimal(principle);
        this.interest= new BigDecimal(interest);
    }
    Simpleinterest(String year)
    {
        this.year=new BigDecimal(year);
    }
   
}