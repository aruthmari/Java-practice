package com.aruth.practice;

public class DateCheck {
	static boolean formatCheck(String str) {
		if (str.charAt(2) != '/' || str.charAt(5) != '/')
			return false;
		else {
			String[] calendar = str.split("/");
			int[] nums = new int[3];
			int i = 0;
			for (String date : calendar) {
				nums[i] = Integer.valueOf(date);
				i++;
			}
			if (nums[0] > 31)
				return false;
			if (nums[1] > 12)
				return false;
			if (nums[2] != 2020)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "20/07/2020";
		if (formatCheck(str))
			System.out.println("The given date format is correct");
		else
			System.out.println("The given date is incorrect format");
	}

}
