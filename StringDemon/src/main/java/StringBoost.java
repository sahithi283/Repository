import static org.junit.Assert.*;

import org.junit.Test;

public class StringBoost {
	StringBoosted sb=new StringBoosted();

	@Test
	public void testwith4ch() {
		
		assertEquals("BCD",sb.stringcode("ABCD"));
	}
	@Test
	public void testwith5ch() {
		
		assertEquals("BCD",sb.stringcode("AABCD"));
	}
	@Test
	public void testwith1ch() {
		
		assertEquals("",sb.stringcode("A"));
	}
	@Test
	public void testwith1chs() {
		
		assertEquals("B",sb.stringcode("B"));
	}
	@Test
	public void testwith2ch() {
		
		assertEquals("B",sb.stringcode("AB"));
	}
	@Test
	public void testwith2chr() {
		
		assertEquals("",sb.stringcode("AA"));
	}
	@Test
	public void testwith0ch() {
		
		assertEquals("",sb.stringcode(""));
	}
	@Test
	public void testwith10ch() {
		
		assertEquals("BCDEFGHJK",sb.stringcode("ABCDEFGHJK"));
	}
	@Test
	public void testwith3ch() {
		
		assertEquals("BCD",sb.stringcode("BCD"));
	}
	@Test
	public void testwith3chs() {
		
		assertEquals("BC",sb.stringcode("ABC"));
	}
}
