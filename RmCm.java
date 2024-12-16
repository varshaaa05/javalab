package com.jit.thirdsem;

public class RmCm {

	int arr[] []= {{1,2,7},{4,3,2},{8,3,5}};
	public static void main(String[] args) {
		RmCm obj=new RmCm();
		System.out.println("Row Major");
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				System.out.println(obj.arr[i][j]+"");
	System.out.println("cColumn Major");
	for (int i=0;i<3;i++)
		for (int j=0;j<3;j++)
			System.out.println(obj.arr[i][j]+"");
	}

}
