package util;

import java.util.Comparator;

public interface Prioritizer <T> extends Comparator<T>  {
	/*Pre-Condition: 1)System is in insertion phase
	 * */
	void insert(T obj1, int i);
	
	
	void changePhase();
	
	/*Pre-Condition:1) System is in Removal phase
	 * 				2) Prioritizer needs to have atleast one element i.e it cannot be empty
	 * */
	void removeNextInorder();
	
	/*Pre-Condition:1) System is in Removal phase
	 * 				2) Prioritizer needs to have atleast one element i.e it cannot be empty
	 * */
	void removeAny();
	
	int getSize();
	
	/*True denotes in insertion phase and false denotes in removal phase*/
	boolean isInInsertionPhase();
	
	

}
