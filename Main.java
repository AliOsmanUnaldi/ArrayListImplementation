package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList<String> myArrayList = new MyArrayList<String>();
		myArrayList.add("ali");
		
		myArrayList.add("afggdfli");
		myArrayList.add("564s");
		//myArrayList.print();
		myArrayList.remove(1);
		myArrayList.print();
		myArrayList.size();
		myArrayList.remove(0);
		myArrayList.remove(0);
		myArrayList.size();
		
	}

}
