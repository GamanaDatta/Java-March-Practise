package Java_Sessions;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
		
		//2D literals array
		
				String data[][] = {
						{"macbook", "macbook pro", "apple", "InStock", "amazon"},
						{"imac", "iMAC", "apple", "InStock", null},
						{"samsung", "samsung monitor", "samsung", "out of stock", null},
						{"canon", "DSLR camera", "canon", "InStock", null},
				};
				
//				System.out.println(data.length);
//				System.out.println(data[0][4]);
//				System.out.println(data[0][3]);
//				System.out.println(data[3][2]);
//				
//				//System.out.println(data[4][2]);//AIOB
//				//data[0][4] = "Out of stock";//AIOB
//				//System.out.println(data[0][4]);
//				
//				data[0][1] = "macbook air";


				
				for(int i=0; i<=3; i++) {
					for(int j=0; j<=3; j++) {
						System.out.print(data[i][j]+" ");//10 11 12 13
					}
					System.out.println();
				}
				
				
				//
				String num[][] = new String [3][3];
				System.out.println(num[0][0]);//null
				
				//non primitive: default : null
				//primitive: respective: default
				

	}

}
