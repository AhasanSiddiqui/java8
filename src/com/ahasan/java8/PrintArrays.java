package com.ahasan.java8;

import java.util.Arrays;

public class PrintArrays {
	public static void main(String[] args) {
		String [] language = { "Java","Python","Js","Ruby"};
			System.out.println(Arrays.toString(language));
			
			int [] intArray= {1,2,3,4,5,6};
			
			System.out.println(Arrays.toString(intArray));
	
			 // 2d array, need Arrays.deepToString
			
			String [] [] deepArrString= {{"ahasan1,ahasan2"},{"ahasan3,ahasan4"},{"ahasan5,ahasan6"}};
			System.out.println(Arrays.toString(deepArrString));
			// Output [[Ljava.lang.String;@15db9742, [Ljava.lang.String;@6d06d69c, [Ljava.lang.String;@7852e922]
			
			System.out.println(Arrays.deepToString(deepArrString));
			//[[ahasan1,ahasan2], [ahasan3,ahasan4], [ahasan5,ahasan6]]
			
			 int[][] deepArrayInt = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
		        System.out.println(Arrays.toString(deepArrayInt));
		        // Output : [[I@3a71f4dd, [I@7adf9f5f]

		        System.out.println(Arrays.deepToString(deepArrayInt));
		        // Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]

	}
}
