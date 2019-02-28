package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean doesElementExist(int[] arr, int iValue) {

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == iValue) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasDuplicates(int[] arr) {
		int[] arrCopy = Arrays.copyOf(arr, arr.length);

		Arrays.sort(arrCopy);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arrCopy[i] == arrCopy[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {

		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) {

			boolean bFound = false;

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[j]) {
					bFound = true;
					break;
				}

			}
			if (bFound == false) {
				hasAllValues = false;
				break;
			}
		}
		return hasAllValues;

	}

	public int[] getColumn(int iCol) {

		int Column[];
		Column = new int[this.LatinSquare.length];

		for (int i = 0; i < this.LatinSquare.length; i++) {
			Column[i] = this.LatinSquare[i][iCol];
		}

		return Column;
	}

	public int[] getRow(int iRow) {
		return this.LatinSquare[iRow];
	}

	public boolean isLatinSquare() {
		boolean isLatinSquare = true;
		int[] requiredVals = new int[this.LatinSquare.length];

		for (int i = 0; i < this.LatinSquare.length; i++) {
			requiredVals[i] = i + 1;
		}

		if (containsZeros() == true) {
			isLatinSquare = false;
		}

		for (int i = 0; i < this.LatinSquare.length; i++) {
			if (hasDuplicates(this.getRow(i)) == true || hasAllValues(this.getRow(i), requiredVals) == false) {
				isLatinSquare = false;
				break;
			}
			if (hasDuplicates(this.getColumn(i)) == true || hasAllValues(this.getColumn(i), requiredVals) == false) {
				isLatinSquare = false;
				break;
			}
		}

		return isLatinSquare;
	}

	public boolean containsZeros() {
		for (int r = 0; r < this.LatinSquare.length; r++) {
			if (doesElementExist(this.LatinSquare[r], 0) == true) {
				return true;
			}
		}

		return false;
	}

}
