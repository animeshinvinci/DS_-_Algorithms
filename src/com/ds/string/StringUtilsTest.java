/* 
 * Animesh
 * May 25, 2014
 * 
 */
package com.ds.string;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Animesh
 *
 */
public class StringUtilsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ds.string.StringUtils#isPalindrome(java.lang.String)}.
	 */
	@Test
	public void testIsPalindrome() {
		assert  StringUtils.isPalindrome("2") == true;
		assert  StringUtils.isPalindrome("212") == true;
		assert  StringUtils.isPalindrome("122") == false;
		assert  StringUtils.isPalindrome("321") == false;
		assert  StringUtils.isPalindrome("iTopiNonAvevanoNipoti") == true;
	}

	/**
	 * Test method for {@link com.ds.string.StringUtils#reverseStringWithStack(java.lang.String)}.
	 */
	@Test
	public void testReverseStringWithStack() {
		assert  StringUtils.reverseStringWithStack("2") == "2";
		assert  StringUtils.reverseStringWithStack("221") == "122";
		assert  StringUtils.reverseStringWithStack("iTopiNonAvevanoNipoti") == "iTopiNonAvevanoNipoti";
	}

	/**
	 * Test method for {@link com.ds.string.StringUtils#reverseStringWithRecursion(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testReverseStringWithRecursion() {
		assert  StringUtils.reverseStringWithRecursion("2","") == "2";
		assert  StringUtils.reverseStringWithRecursion("221","") == "122";
		assert  StringUtils.reverseStringWithRecursion("iTopiNonAvevanoNipoti","") == "iTopiNonAvevanoNipoti";
	}

	/**
	 * Test method for {@link com.ds.string.StringUtils#reverseString(java.lang.String)}.
	 */
	@Test
	public void testReverseString() {
		assert  StringUtils.reverseString("2") == "2";
		assert  StringUtils.reverseString("221") == "122";
		assert  StringUtils.reverseString("iTopiNonAvevanoNipoti") == "iTopiNonAvevanoNipoti";

	}

}
