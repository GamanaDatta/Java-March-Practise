package Java_Sessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList -- default class with methods
		//dynamic array -- maintains the order --index based arraylist
		
		//ArrayList is a raw type.
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0

		ar.add(100);//0
		ar.add("naveen");//1
		
		System.out.println(ar.size());//2
		
		ar.add('A');//2
		ar.add(true);//3
		ar.add(500);//4
		
		System.out.println(ar.size());//5
		
		ar.add(12.33); //5
		
		System.out.println(ar.size());//6

//		ar.remove(5);
//		
//		System.out.println(ar.size());//5
		
		System.out.println(ar);

		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		//System.out.println(ar.get(6));//IndexOutOfBoundsException
		//System.out.println(ar.get(-1));

		//print all the value from arraylist: iterate the arraylist: using for loop:
		//index for loop:
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));//100 200 300 400 500 12.33
		}

		//for each loop:
		
			
			
		//ArrayList with Generics: <DataType -- non primitive>
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
			
		ArrayList<Byte> bList = new ArrayList<Byte>();
		ArrayList<Short> sList = new ArrayList<Short>();

		System.out.println("--------------");
		ArrayList<Double> dList = new ArrayList<Double>();

		dList.add(12.33);//0
		dList.add(23.44);//1
		dList.add(100.0);//2
		System.out.println(dList.size());
		System.out.println(dList);
		
		System.out.println("--------------");
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Ravi");
		empList.add("Pooja");
		
		System.out.println(empList.size());
		System.out.println(empList);
		
		//for each :
		for(String e: empList) {
			System.out.println(e);
		}
		
		System.out.println("-------------");
		//empdata: name, age, salary, gender, isActive
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");//0
		empDataList.add(30);//1
		empDataList.add(34.33);//2
		empDataList.add('m');//3
		empDataList.add(true);//4
		
		System.out.println(empDataList.size());
		System.out.println(empDataList);
			
		for(Object e : empDataList)	{
			System.out.println(e);
		}
		//default capacity = vc = 10
				ArrayList<Integer> marksList1 = new ArrayList<Integer>();//vc=10, pc=0
				
				System.out.println(marksList1.size());
				
//				marksList.add(100);
//				marksList.add(200);

				ArrayList<String> empList1 = new ArrayList<String>();//vc=10, pc=0
				empList1.add("Tom");
				empList1.add("Peter");
				empList1.add("Ravi");
				empList1.add("Pooja");
				//pc=4, vc=6
				
				//
				ArrayList<Integer> mList = new ArrayList<Integer>(20);//vc=20, pc=0
				//0 to 19: All filled
				//vc=0, pc=20
				//add one more value
				//LF=pc/2 => 20/2 = 10

				//
				ArrayList<Integer> pList = new ArrayList<Integer>(5);//vc=5, pc=0
				//0 to 4: all filled
				//vc=0, pc=5
				//add one more value
				//vc=pc/2=>5/2=>2
				
				System.out.println("---------");
				ArrayList<String> stList = new ArrayList<String>();//vc=10, pc=0
				stList.add("Tom");//0
				stList.add("Peter");//1
				stList.add("Ravi");//2
				stList.add("Pooja");//3
				stList.add("Ashwini");//4
				stList.add("Anjani");//5
				
				
				stList.remove("Pooja");
				stList.add(3, "Harshita");
				
				System.out.println(stList);
				stList.add(3, "Pooja");
				System.out.println(stList);

				
				
				
//				System.out.println(stList.size());//6
//				System.out.println(stList);
//				stList.remove(2);
//				System.out.println(stList);
//				System.out.println(stList.size());//5
//				
//				stList.remove("Pooja");
//				System.out.println(stList);
//				System.out.println(stList.size());//5
		//
//				
//				stList.set(0, "Naveen");//replace
//				System.out.println(stList);
//				System.out.println(stList.size());//5
				
//				stList.add(0, "Naveen");//add
//				System.out.println(stList);
				
				
				//
				ArrayList<Integer> numList = new ArrayList<Integer>();//vc=10, pc=0
				
				numList.add(1);//0
				numList.add(2);//1
				numList.add(3);//2
				numList.add(4);//3
				
				numList.removeAll(numList);
				System.out.println(numList.size());
				
				
//				
//				//numList.remove(6);
		//
//				numList.remove((Integer)20);
//				System.out.println(numList);

				
//				numList.remove(3);
//				System.out.println(numList);

//				for(int i=0; i<=50; i++) {
//					numList.add(i, i+1);
//				}
		//
//				System.out.println(numList);
				

	}

}
