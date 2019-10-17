
package util;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Prioritizer1<T,Comparator>  implements Prioritizer<T>{
	

	//private T input[]=(T[])new Object[10];
	
	private T input[];
	private T inputRem[];
	private boolean phase;
	int index=0;
	int size=0;
	int remIndex=0;
	Scanner sc=new Scanner(System.in);
	
	public Prioritizer1(int size,T t){
		this.size = size;
		input= (T[]) new Object[size];
		}
	
	public T get(int i) {
        return input[i];
    }
	
	public void set(int i, T x) {
        input[i] = x;
    }
	
	public boolean compare(T t){
		return false;  
		
		}
	public boolean getPhase() {
		return this.phase;
	}
	
	@Override
	public void removeNextInorder() {
		phase=false;
		System.out.println("Before Sorting");
		for (int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		Arrays.sort(getInput());
		System.out.println("After Sorting");
		for (int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		for(int i = 0; i < input.length; i++){
            if(i==index){
               inputRem = (T[])new Object[input.length - 1];
               for(int j = 0; j < i; j++){
                   inputRem[j] = input[j];
               }
               for(int k = i; k < input.length - 1; k++){
                   inputRem[k] = input[k+1];
               }
               break;
            }
        }
		
		System.out.println("After removing index"+index);
		index++;
		remIndex++;
		for (int i=0;i<inputRem.length;i++) {
			
			System.out.println(inputRem[i]);
		}
		
		
	}
	
	public void setPhase(boolean phase) {
		this.phase = phase;
	}
	public T[] getInput() {
		return input;
	}
	public void setInput(T[] input) {
		this.input = input;
	}
	@Override
	public void insert(T obj1,int i) {
			phase=true;
			set(i,obj1);
			
			/*System.out.println("Displaying Content");
			for(int j=0;i<input.length;j++) {
				System.out.println(input[j]);
			}*/
	}

	public boolean isPhase() {
		return phase;
	}
	
	@Override
	public void changePhase() {
		if(phase) {
			phase=false;
			System.out.println("System Phase changed to Removal");
		}
		else {
			phase=true;
			System.out.println("System Phase changed to Insertion");
		}
		
	}

	@Override
	public void removeAny() {
		// TODO Auto-generated method stub
		phase=false;
		System.out.println("Before Sorting");
		for (int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		Arrays.sort(getInput());
		
		System.out.println("After Sorting");
		for (int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		index=input.length-1;
		for(int i = 0; i < input.length; i++){
            if(i==index){
               inputRem = (T[])new Object[input.length - 1];
               for(int j = 0; j < i; j++){
                   inputRem[j] = input[j];
               }
               for(int k = i; k < input.length - 1; k++){
                   inputRem[k] = input[k+1];
               }
               break;
            }
        }
		
		System.out.println("After removing index"+index);
		index++;
		remIndex++;
		for (int i=0;i<inputRem.length;i++) {
			
			System.out.println(inputRem[i]);
		}
	
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return input.length-remIndex;
	}

	@Override
	public boolean isInInsertionPhase() {
		// TODO Auto-generated method stub
		return phase;
	}

	public int compare(Prioritizer1 input1, Prioritizer1 input2) {
		// TODO Auto-generated method stub
		return input1.getSize()-input2.getSize();
		
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
