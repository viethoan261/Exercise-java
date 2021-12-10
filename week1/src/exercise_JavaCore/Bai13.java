package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Bai13 {
	//find AVG
    public static void findAverage (ArrayList<Integer> a) {
    	double sum = 0;
    	for(int i = 0; i < a.size(); i++) {
    		sum += a.get(i);
    	}
    	System.out.println("Average is: " + (double) Math.round((sum/a.size()) * 10) / 10);
	}
    //findMaxMin
    public static void findMaxMin(ArrayList<Integer> a) {
    	Collections.sort(a);
    	System.out.println("Max element is: " + a.get(a.size()-1));
    	System.out.println("Min element is: " + a.get(0));
    }
    //negative_Max_Min
    public static void negativeMaxMin(ArrayList<Integer> a) {
    	Collections.sort(a);
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	for(int i = 0; i < a.size(); i++) {
    		if(a.get(i) < 0) {
    			tmp.add(a.get(i));
    		} 	
    	}
    	if(tmp.size() == 0) System.out.println("There are no negative elements in the array");
    	else {
    	System.out.println("Max negative is: " + tmp.get(tmp.size() - 1));
    	System.out.println("Min negative is: " + tmp.get(0));  	
    }
    }
    //Positive_Max_Min
    	public static void positiveMaxMin(ArrayList<Integer> a) {
        	Collections.sort(a);
        	ArrayList<Integer> tmp = new ArrayList<Integer>();
        	for(int i = a.size() - 1; i >= 0; i--) {
        		if(a.get(i) > 0) {
        			tmp.add(a.get(i));
        		} 	
        	}
        	if(tmp.size() == 0) System.out.println("There are no positive elements in the array");
        	else {
        	System.out.println("Max negative is: " + tmp.get(0));
        	System.out.println("Min negative is: " + tmp.get(tmp.size() - 1));  	
        }
    }
    	//Even_Odd
    	public static void findEvenOdd(ArrayList<Integer> a) {
    		ArrayList<Integer> even = new ArrayList<Integer>();
    		ArrayList<Integer> odd = new ArrayList<Integer>();
    		for(int i = 0; i < a.size(); i++) {
    			if(a.get(i) >= 0 && a.get(i) % 2 == 0) {
    				even.add(a.get(i));
    			}
    			if(a.get(i) >= 0 && a.get(i) % 2 != 0) {
    				odd.add(a.get(i));
    			}
    		}
    		if(even.size() == 0 && odd.size() == 0) {
    			System.out.println("There are no even and odd number in the array");
    		} 
    		if(even.size() > 0 && odd.size() == 0) {
    			System.out.println("There are no odd number in the array");
    			System.out.print("The even number in the array: ");
    			for(int i = 0; i < even.size(); i++) {
    				System.out.print(even.get(i) + " ");
    			}
    			System.out.println();
    		} 
    		if(odd.size() > 0 && even.size() == 0) {
    			System.out.println("There are no even number in the array");
    			System.out.print("The odd number in the array: ");
    			for(int i = 0; i < odd.size(); i++) {
    				System.out.print(odd.get(i) + " ");
    			}
    			System.out.println();
    		} 
    		if(odd.size() > 0 && even.size() > 0){
    			System.out.print("The even number in the array: ");
    			for(int i = 0; i < even.size(); i++) {
    				System.out.print(even.get(i) + " ");
    			}
    			System.out.println();
    			System.out.print("The odd number in the array: ");
    			for(int i = 0; i < odd.size(); i++) {
    				System.out.print(odd.get(i) + " ");
    			}
    			System.out.println();
    		}
    	}
    	//add element
    	public static void insertElement(ArrayList<Integer> a, int index, int x) {
    		if(0 < index && index < a.size()) {
    			a.add(index, x);
    			System.out.print("Array after insert " + x + " to index " + index +" : "  );
    			for(int i = 0; i < a.size(); i++) {
    				System.out.print(a.get(i) + " ");
    			}
    		}else { 
    			System.out.println("Error");
    		}
    		System.out.println();
    	}
    	//remove element
    	public static void removeElement(ArrayList<Integer> a, int pos) {
    		if(0 < pos && pos < a.size()) {
    			a.remove(pos);
    			System.out.print("Array after remove ");
    			for(int i = 0; i < a.size(); i++) {
    				System.out.print(a.get(i) + " ");
    			}
    		}else { 
    			System.out.println("Error");
    		}
    		System.out.println();
    		
    	}
    	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr.add(x);
			arr1.add(x);
		}
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		System.out.println("Enter a number to insert: ");
		int num = sc.nextInt();
		System.out.println("Enter a pos to remove: ");
		int pos = sc.nextInt();
		findAverage(arr);
		findMaxMin(arr);
		negativeMaxMin(arr);
		positiveMaxMin(arr);
		findEvenOdd(arr);
		insertElement(arr, index, num);
		removeElement(arr1, pos);
	}
}
