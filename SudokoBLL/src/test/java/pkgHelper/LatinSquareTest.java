package pkgHelper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void doesElementExist_Test2() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 8;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };

		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test3() {

		int[] arr1 = { 1, 2, 3, 4, 1 };
		int[] arr2 = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr1);

		assertEquals(bExpected, bActual);

		assertEquals(0, Arrays.compare(arr1, arr2));

	}
}