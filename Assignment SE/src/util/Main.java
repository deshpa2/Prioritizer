package util;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static  <T> void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        T t = null;
        
        Prioritizer1<Object, Comparator> p1 = null;
        //Prioritizer1<Object, Comparator> p2=new Prioritizer1<>();
        //Prioritizer1<Object, Comparator> p3=new Prioritizer1<>();
        
        Object obj1 = null;
        boolean flag=false;
        do {
        	System.out.println("Choose a prioritizer by entering 1,2 or 3");
            int prioritizer = sc.nextInt(); 
            System.out.println("Enter an operation from the following\n"
            		+ "1:Insert elements\n"
            		+ "2:Change Phase\n"
            		+ "3:Remove Next Item\n"
            		+ "4:Remove Any element\n"
            		+ "5 Get Size\n"
            		+ "6:Is In Insertion Phase?\n"
            		+ "7:Exit");
            int ch=sc.nextInt();
        	switch(ch) {
        	case 1:
        		if(prioritizer==1) {
        			System.out.println("Enter the size of the prioritizer");
        			int size=sc.nextInt();
        			
        			p1=new Prioritizer1<>(size,t);
        			for(int i=0;i<size;i++) {
        				System.out.println("Enter "+i+"th Element");
        				 obj1=sc.nextInt();
        				 p1.insert((T)obj1,i);
        			}
        			T[] input=(T[]) p1.getInput();
        			System.out.println("Input Received");
        			//System.out.println(input);
        			for (int i=0;i<input.length;i++) {
        				System.out.println(input[i]);
        			}
        			System.out.println(p1.getPhase());
        	break;		
        	}
        		if(prioritizer==2) {
        			System.out.println("Enter elements to insert");
        			//p2.insert((T)obj1,i);
        	}
        		if(prioritizer==3) {
        			System.out.println("Enter elements to insert");
        			 //obj1=sc.nextInt();
        		   // p3.insert((T)obj1,i);
        	}
        	case 2:
        		if(prioritizer==1) {
         			p1.changePhase();
        	}
        		if(prioritizer==2) {
        		  //p2.changePhase();
        	}
        		if(prioritizer==3) {
        			//p3.changePhase();
        	}
        		break;
        	case 3:
        		if(prioritizer==1) {
        			System.out.println("Removing Next Element");
        			p1.removeNextInorder();
        	}
        		if(prioritizer==2) {
        			System.out.println("Removing Next Element");
        			//p2.removeNextInorder();
        	}
        		if(prioritizer==3) {
        			System.out.println("Removing Next Element");
        			//p3.removeNextInorder();
        	}
        		break;
        	case 4:
        		if(prioritizer==1) {
        			System.out.println("Removing a random element");
        			p1.removeAny();
        	}
        		if(prioritizer==2) {
        			System.out.println("Removing a random element");
        			//p2.removeAny();
        	}
        		if(prioritizer==3) {
        			System.out.println("Removing a random element");
        			//p3.removeAny();
        	}
        		break;
        	case 5:
        		if(prioritizer==1) {
        			System.out.println("Getting size");
        			int size=p1.getSize();
        			System.out.println(size);
        	}
        		if(prioritizer==2) {
        			System.out.println("Getting size");
        			//p2.getSize();
        	}
        		if(prioritizer==3) {
        			System.out.println("Getting size");
        			//p3.getSize();
        	}
        		break;
        	case 6:
        		if(prioritizer==1) {
        			System.out.println("Checking for insertion phase");
        			boolean phase=p1.isInInsertionPhase();
        			if(phase) {
        				System.out.println("In Insertion Phase");
        			}else {
        				System.out.println("In Removal Phase");
        			}
        	}
        		if(prioritizer==2) {
        			System.out.println("Checking for insertion phase");
        			//p2.isInInsertionPhase();
        	}
        		if(prioritizer==3) {
        			System.out.println("Checking for insertion phase");
        			//p3.isInInsertionPhase();
        	}
        	break;
        	case 7:
        		flag=true;
        		break;
        }
        }while(flag==false);
        System.out.print("Terminated");      		      
	}
}
