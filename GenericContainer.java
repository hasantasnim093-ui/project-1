package Product;

import java.util.Iterator;
import java.util.Vector;

public class GenericContainer<t> {

	Vector<t> items;
	
	 GenericContainer(){
		 items = new Vector<>();
	 }
	 

		
		void add(t item) {
			

		
			
			items.add(item);
			}
		
		
		
		t get(int index) {
			if(index == items.size()) {
				System.out.println("unable to recieve");
			}else {
				return items.get(index);
			}
			
			return null;
			
			
		}
		
		boolean remove(t item) {
			
			Iterator<t> it = items.iterator();
			
			while(it.hasNext()) {
				 
				t element = it.next();
				
				if(element.equals(item)) {
					it.remove();
					return true;
				}
			
			
			
			}
			
			return false;
			
			
			
			
			
		}
		
		int size()
		{
			return items.size();
		}
		
		Vector<t> getAll(){
		Vector<t> newVec = items;
		
		return newVec;
		
		
		
		
		
		
		
		
		
		
		}
		void clear() {
			items.clear();
		}
		
		boolean contains(t item) {
			
			for(t a : items) {
				if(a.equals(item)) {
					return true;
				}
			}
			
			return false;
			
			
		}
		
		void addAll(Vector<t> other) {
			
			
		for(int i =0;i<other.size();i++) {
			
			items.add(other.get(i));
				
				
			}
			
			
			
		}
			
			
			
			
			
			
			
			
			
		}
		
		
	
	
	

