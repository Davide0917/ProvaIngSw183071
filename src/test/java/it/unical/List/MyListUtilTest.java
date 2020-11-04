package it.unical.List;

import org.junit.*;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.joda.time.*;

public class MyListUtilTest {

	private static MyListUtil listUtil;
	private static DateTime dt;

	@BeforeClass
	public static void getAll() {
		listUtil = new MyListUtil();
		dt = new DateTime();
		System.out.println("Time init:" + dt.toString());
	}

	
	@Test
	public void setCrescenteListWorks() {
		assertEquals(new LinkedList<Integer>(), listUtil.setCrescenteList(new LinkedList<Integer>()));
		assertEquals(Arrays.asList(1, 5, 9), listUtil.setCrescenteList(Arrays.asList(5, 1, 9)));
		assertEquals(Arrays.asList(-5, 5, 9), listUtil.setCrescenteList(Arrays.asList(5, 9, -5)));
		assertEquals(Arrays.asList(1, 4, 4, 9, 12, 18, 19),
				listUtil.setCrescenteList(Arrays.asList(4, 1, 9, 19, 18, 12, 4)));

	}

	@Test
	public void setDecrescenteListWorks() {
		assertEquals(new LinkedList<Integer>(), listUtil.setDecrescenteList(new LinkedList<Integer>()));
		assertEquals(Arrays.asList(9, 5, 1), listUtil.setDecrescenteList(Arrays.asList(5, 1, 9)));
		assertEquals(Arrays.asList(9, 5, -10), listUtil.setDecrescenteList(Arrays.asList(5, -10, 9)));
		assertEquals(Arrays.asList(19, 17, 12, 12, 5, 4, 1),
				listUtil.setDecrescenteList(Arrays.asList(5, 12, 1, 19, 17, 4, 12)));

	}

	@AfterClass
	public static void closeTime() {
		dt = new DateTime();
		System.out.println("Time end: " + dt.toString());
	}
}
