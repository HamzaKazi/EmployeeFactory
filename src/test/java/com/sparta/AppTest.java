package com.sparta;

import com.sparta.factory.EmployeeFactory;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    static class EmployeeFactoryTest {

        @Test
        void testGetEmployees() {
            try {
                int n = 10;
                String[] employees = EmployeeFactory.getEmployees(n);
                assertEquals(n, employees.length);

                String regex = "\\d{1,8}\t(?:Mr\\.||Ms\\.||Mrs\\.||Dr\\.||Drs\\.)\t[a-zA-Z ]+\t[a-zA-Z]\t[a-zA-Z ]+\t[MF]\t[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\t\\d{1,2}/\\d{1,2}/\\d{4}\t\\d{1,2}/\\d{1,2}/\\d{4}\t\\d+";
                Pattern pattern = Pattern.compile(regex);

                for (String employee : employees) {
                    assertTrue(pattern.matcher(employee).matches());
                }
            } catch (IOException e) {
                fail("IOException occurred while testing getEmployees");
            }
        }
    }
}
