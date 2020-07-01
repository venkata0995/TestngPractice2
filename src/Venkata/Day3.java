package Venkata;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3
{
    @AfterClass
    public void Homeloan3()
    {
        System.out.println("homeloan3");
    }
    @AfterSuite
    public void Carloan3()
    {
        System.out.println("Carloan3");
    }
    @AfterMethod
    public void personalloan3()
    {
        System.out.println("personalloan3");
    }
}
