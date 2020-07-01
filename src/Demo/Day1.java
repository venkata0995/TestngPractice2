package Demo;

import org.testng.annotations.*;

public class Day1
{
    @BeforeTest
    public void Homeloan()
    {
        System.out.println("homeloan");
    }
    @BeforeSuite
    public void Carloan()
    {
        System.out.println("Carloan");
    }
    @BeforeMethod
    public void personalloan()
    {
        System.out.println("personalloan");
    }

}
