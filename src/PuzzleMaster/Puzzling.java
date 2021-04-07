package PuzzleMaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Puzzling {
	
	public static ArrayList<Integer> printSumReturnGreaterThan(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(arr[i] > 10) {
				newArr.add(arr[i]);
			}
		}
//		for(int value: arr) {
//		python style loop	
//		}
		System.out.println(sum);
		return newArr;
	}
	
	public static ArrayList<String> shuffleName(ArrayList<String> names ){
		Collections.shuffle(names);
		System.out.println(names);
		ArrayList<String> finalNames = new ArrayList<String>();
		for(String n: names ) {
			System.out.println(n);
			if(n.length()>5) {
                // names.remove(n);
				// modifying the array we loop though with the enhanced for loop
				// will break thins
				finalNames.add(n);
			}
		}
		
		System.out.println(finalNames);
		
		return finalNames;
		
	}
	
	public static void randomAlphabet(ArrayList<String> arr) {
		String first = arr.get(0);
		String last = arr.get(arr.size()-1);
		System.out.println("last " + last);
		System.out.println("first " + first);
		String vowels = "aeiouy";
		for(int i=0; i<vowels.length(); i++) {
			// I wanted to show off casting 
			// but Java made me do this
			// - Programmer 2021
			String vowel = "" + vowels.charAt(i);
			if(vowel.equals(first)) {
				System.out.println("a message.");
			}
		}
	}
	
	
	
	/*
	 * Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
	 * Print the sum of all numbers in the array. Also have the function 
	 * return an array that only includes numbers that are greater than 10 
	 * (e.g. when you pass the array above, it should return an array with 
	 * the values of 13,25,32)
	 * 
	 * Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	 * Shuffle the array and print the name of each person. Have the method also return an 
	 * array with names that are longer than 5 characters.
	 * 
	 * Create an array that contains all 26 letters of the alphabet 
	 * (this array must have 26 values). Shuffle the array and, after shuffling, 
	 * display the last letter from the array. Have it also display the first letter 
	 * of the array. If the first letter in the array is a vowel, have it display a message.
	 * 
	 * To shuffle a collection, you can use the shuffle method of the Collections 
	 * class. Collections Class documentation
	 * 
	 * Generate and return an array with 10 random numbers between 55-100.
	 * To get a random integer, you can use the nextInt method of the Random class. 
	 * Random Class documentation
	 * 
	 * Generate and return an array with 10 random numbers between 55-100 and have it 
	 * be sorted (showing the smallest number in the beginning). Display all the 
	 * numbers in the array. Next, display the minimum value in the array as well as 
	 * the maximum value.
	 * To sort a collection, you can use the sort method of the Collections class.
	 * 
	 * Create a random string that is 5 characters long.
	 * 
	 * Generate an array with 10 random strings that are each 5 characters long
	 * 
	 * */
	
	
	public static void main(String[] arrrrgs) {
		System.out.println("Who wants to be a puzzle master!");
		
		int[] arr = new int[] {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> result = printSumReturnGreaterThan(arr);
		System.out.println(result);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Nancy");
		names.add("Jinichi");
		names.add("Fujibayashi");
		names.add("Momochi");
		names.add("Ishikawa");
		shuffleName(names);
		
		String[] alpha = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> alphaList = new ArrayList<String>();
		for(String letter: alpha) {
			alphaList.add(letter);
		}
		Collections.shuffle(alphaList);
		System.out.println(alphaList);
		randomAlphabet(alphaList);
	}

}
