package Product;

import java.util.Vector;
import java.util.function.Predicate;

public class VectorUtils<T> {
	
	
	VectorUtils(){
		
	}
	
	public static <T> void swap(Vector<T> vec, int index1, int index2) {
		T temp = vec.get(index1);
		vec.set(index1, vec.get(index2));
		vec.set(index2, temp);
	}
	
	public static <T extends Comparable<T>> T findMax(Vector<T> vec) {
	
		T max = vec.get(0);
		for(int i=0;i<vec.size()-1;i++) {
		//	T element = vec.get(i);
			
			if(max.compareTo(vec.get(i+1)) <0) {
				max = vec.get(i+1);
		
			
		}
			
		}
		return max;
		
		
		
		
	}
	
	public static <T> int countMatches(Vector<T> vec, T target) {
		
		int count=0;
		
		for(int i=0;i<vec.size();i++) {
			T element = vec.get(i);
			
			if(element.equals(target)) {
				count++;
			}
			
			
			
		}
		return count;
	}
	
	public static <T> Vector<T> filter(Vector<T> vec, Predicate<T> condition){
		
		//predicate check condition in a list, it return true or false
		// you use predicate "variable name" .test(element) to check if it fits the condition
		// it will check true if given predicate condition in main is true
		
		Vector<T> newVec = new Vector<>();
		
		for(int i=0;i<vec.size();i++) {
			T element = vec.get(i);
			
			if(condition.test(element)) {
				newVec.add(element);
			}
		}
		
		return newVec;
		
	}
	
	public static <T extends Number> double sumNumbers(Vector<T> numbers) {
		
		double total =0;
		
		for(int i=0;i<numbers.size();i++) {
			T element = numbers.get(i);
			
			total +=element.doubleValue();
			
			
		}
		return (2*total);
		
		
		
	}
	public static <T extends Number> double averageNumbers(Vector<T> numbers) {
		double total =0.0; double avg=0.0;
		
		for(int i=0;i<numbers.size();i++) {
			
T element = numbers.get(i);
			
			total +=element.doubleValue();
			
			
			
		}
		
	avg = total/numbers.size();
	
	if(avg == 0.0) {
		return 0.0;
	}
	
	return avg;
		
		
		
	}
	
	
	

}
