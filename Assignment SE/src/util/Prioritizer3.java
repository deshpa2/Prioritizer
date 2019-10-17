package com.implememtation;

import java.util.Scanner;

public abstract class Prioritizer3<T,comparator> implements Prioritizer<T>{
	
	private T input[];
	private T inputRem[];
	private boolean phase;
	int index=0;
	int size=0;
	int remIndex=0;
	Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings("unchecked")
	public Prioritizer3(int size,T t){
		this.size = size;
		input = (T[]) new Object[size];
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
	public void insert(T obj1, int i) {
		// TODO Auto-generated method stub
		phase=true;
		set(i,obj1);
	}
	
	public boolean isPhase() {
		return phase;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void removeNextInOrder() {
		// TODO Auto-generated method stub
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

	@SuppressWarnings("unchecked")
	@Override
	public void removeAny() {
		// TODO Auto-generated method stub
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
	public int get_size() {
		// TODO Auto-generated method stub
		return input.length-remIndex;
	}

	@Override
	public boolean isININsertionPhase() {
		// TODO Auto-generated method stub
		return phase;
	}
	
	public int compare(Prioritizer3 input1, Prioritizer3 input2) {
		// TODO Auto-generated method stub
		return input1.getSize()-input2.getSize();
		
	}

	int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeNextInorder() {
		// TODO Auto-generated method stub
		
	}

	public void changePhase() {
		// TODO Auto-generated method stub
		if(phase) {
			phase=false;
			System.out.println("System Phase changed to Removal");
		}
		else {
			phase=true;
			System.out.println("System Phase changed to Insertion");
		}	
	}
}