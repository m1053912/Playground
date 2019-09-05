package Analysis.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Testcase {
	@BeforeClass
	public static void setupbefore() throws Exception{
		System.out.println("before class");
	}
    @Before
    public void setup() throws Exception{
    	System.out.println("before");
    }
    @Test
public void maxtest() {
		
		assertEquals(5,Operations.max(new int[] {1,2,3,4,5}));
		assertEquals(-1,Operations.max(new int[] {-1,-2,-3,-4,-5}));
	}
@Test  
public void testCube(){  
    System.out.println("test case cube");  
    assertEquals(27,Operations.cube(3));  
}  
@Test  
public void testReverseWord(){  
    System.out.println("test case reverse word");  
    assertEquals("dlrow olleh",Operations.reverseWord("hello world"));  
}  
@After  
public void tearDown() throws Exception {  
    System.out.println("after");  
}  
@AfterClass  
public static void tearDownAfterClass() throws Exception {  
    System.out.println("after class");  
}  



}
