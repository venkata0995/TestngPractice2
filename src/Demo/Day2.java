package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day2
{

        @AfterTest
        public void Homeloan2()
        {
            System.out.println("homeloan2");
        }
        @Test
        public void Carloan2()
        {
            System.out.println("Carloan2");
        }
        @BeforeClass
        public void personalloan2()
        {
            System.out.println("personalloan2");
        }
}
