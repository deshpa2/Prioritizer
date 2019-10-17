package util;

import java.util.Arrays;
import java.util.Scanner;

public class Prioritizer2<T, Comparator> implements Prioritizer<T> {

	private int top = 0;
	private T contents[];
	private boolean flag;
	private int x = 0;
	private T newContents[];
	int index=0;

	@SuppressWarnings("unchecked")
	public Prioritizer2(int i) {
		// TODO Auto-generated constructor stub

		contents = (T[]) new Object[i];
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public T[] getContents() {
		return contents;
	}

	public void setContents(T[] contents) {
		this.contents = contents;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public T[] getNewContents() {
		return newContents;
	}

	public void setNewContents(T[] newContents) {
		this.newContents = newContents;
	}

	

	public int compare(@SuppressWarnings("rawtypes") Prioritizer1 o1, @SuppressWarnings("rawtypes") Prioritizer2 o2) {
		// TODO Auto-generated method stub
		
		return o1.getInput().length-o2.contents.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insert(T x, int a) {
		 flag=true;
		// TODO Auto-generated method stub
		int r = (int) x;
		for (int i = 0; i < r; i++) {
			System.out.println("Enter " + i + "th Element");
			@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);
			Object c = (Object) myObj.nextInt();
			contents[top++] = (T) c;
		}
		Arrays.sort(contents);
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}
	}

	@Override
	public void changePhase() {
		// TODO Auto-generated method stub
		if(flag) {
			flag=false;
			System.out.println("System Phase changed to Removal");
		}
		else {
			flag=true;
			System.out.println("System Phase changed to Insertion");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeNextInorder() {
		// TODO Auto-generated method stub
		 flag=false;
		 x=contents.length-1;
		for (int i = 0; i < contents.length; i++) {
			if (i == x) {
				newContents = (T[]) new Object[contents.length - 1];
				for (int j = 0; j < i; j++) {
					newContents[j] = contents[j];
				}
				for (int k = i; k < contents.length - 1; k++) {
					newContents[k] = contents[k + 1];
				}
				break;
			}
		}

		System.out.println("After removing index" + x);
		x++;

		for (int i = 0; i < newContents.length; i++) {
			System.out.println(newContents[i]);
		}
		top=newContents.length;
	}

	@Override
	public void removeAny() {
		// TODO Auto-generated method stub
		index=contents.length-1;
		 flag=false;
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[contents.length - 1];
       
		for (int i = 0, k = 0; i < contents.length; i++) {
			if (i == index) {
				continue;
			}
			newArray[k++] = contents[i];
		}

		System.out.println("After Removing element");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		top=newArray.length;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public boolean isInInsertionPhase() {
		// TODO Auto-generated method stub
		return flag;

	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
