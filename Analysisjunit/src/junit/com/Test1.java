package junit.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		    System.out.println("test case equal"); 
		    boolean result=Example.compare("hello","hello");
		    assertEquals(true,result);  
		}  
	}


