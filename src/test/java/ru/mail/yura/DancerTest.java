package ru.mail.yura;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.mail.yura.model.Dancer;

public class DancerTest {
	
	private Dancer dancer;
		
	@BeforeClass
    public static void beforeClass() {
        System.out.println("Before DancerTest.class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After DancerTest.class");
    }
 
    @Before
    public void initTest() {
    	dancer = new Dancer();
    }
 
    @After
    public void afterTest() {
    	dancer = null;
    }
 
    @Test
    public void testMove1() throws Exception {
    	ArrayList<Integer> testList = new ArrayList<Integer>();
    	testList.add(2);
    	testList.add(0);
    	testList.add(7);
        assertEquals(4, dancer.move(testList));
    }
    
    @Test
    public void testMove2() throws Exception {
    	ArrayList<Integer> testList = new ArrayList<Integer>();
    	testList.add(0);
    	testList.add(4);
    	testList.add(5);
        assertEquals(0, dancer.move(testList));
    }
    
    @Test
    public void testMove3() throws Exception {
    	ArrayList<Integer> testList = new ArrayList<Integer>();
    	testList.add(1);
    	testList.add(4);
    	testList.add(5);
        assertEquals(0, dancer.move(testList));
    }
    
    @Test
    public void testMove4() throws Exception {
    	ArrayList<Integer> testList = new ArrayList<Integer>();
    	testList.add(6);
    	testList.add(5);
    	testList.add(1);
    	testList.add(4);
    	testList.add(2);
    	testList.add(7);
        assertEquals(24, dancer.move(testList));
    }
	
}
