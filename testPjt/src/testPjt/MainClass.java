package testPjt;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
//		// implicit type conversion
//		// small -> big
		byte by = 10;
		int in = by;
		System.out.println("in ="+in);
	
//		// explicit type conversion
//		// big -> small
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar ="+bVar);
//		
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar ="+bVar);
//		
//		
		System.out.println("Good\tMorning");
		System.out.println("Good\nMorning");
		System.out.println("Good\'Morning\'");
		System.out.println("Good\"Morning\"");
//
//		
		System.out.printf("temerature %d.\n",10); // no change line in printf
		System.out.printf("expected date %d year %d month.\n",10,20); 
		System.out.printf("30(DEX) %d \n",30);
		System.out.printf("30(OCT) %o \n",30);
		System.out.printf("30(HEX) %x \n",30);
//
		System.out.printf("small char %c is big char %c.\n",'c','C');
		System.out.printf("small str %s is big str %s.\n","java","JAVA");
//		
		System.out.printf("d = %f\n", 1.2345);	
//		
		System.out.printf("%5d\n", 123);	
		System.out.printf("%5d\n", 1234);			
//		
		System.out.printf("%f\n", 1.23);			
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		
		int x = 10;
		int y = 20;
		System.out.println(x/y); // drop decimal cause it's int
//		
		int z = 10;
		System.out.println("++z :"+ (++z)); // z = z+1 // plus and print
		z = 10;
		System.out.println("--z :"+ (--z));
		System.out.println("z++ :"+ (z++)); // print and plus(in memory, it is 10)
		System.out.println("z :" + z);
//
		z = 10;
		System.out.println("z-- :" + (z--)); 	
		System.out.println("z :" + z);
//
//		// terany operator
		int n = 10; int m= 10;
		int result = 0;
		result = (n>m)? 100 : 200;
		System.out.println("result :" + result);
		
		// array 
		// 1 : declaration -> initialization
		int[] arr1 = new int[5]; // declaration
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;;
		arr1[3] = 4;
		arr1[4] = 5;
		System.out.println(arr1[0]);
//		
//		
//		//2 declare & initialization
		int[] arr2 = {10,20,30,40,50};
		System.out.println(arr2[0]);
		
//		String[] name = {"jisoo","jenny","lisa","park"};
//		int[] score = new int[5];
//		Scanner scanner = new Scanner(System.in); // object that waits user to input value
//		
//		System.out.printf("%s score :", name[0]);
//		score[0] = scanner.nextInt();
//		
//		System.out.printf("%s score :", name[1]);
//		score[1] = scanner.nextInt();
//		
//		System.out.printf("%s score :", name[2]);
//		score[2] = scanner.nextInt();
//		
//		System.out.printf("%s score :", name[3]);
//		score[3] = scanner.nextInt();
//		
//		
//		System.out.printf("%s score : \t%.2f\n", name[0], (double)score[0]);
//		System.out.printf("%s score : \t%.2f\n", name[1], (double)score[1]);
//		System.out.printf("%s score : \t%.2f\n", name[2], (double)score[2]);
//		System.out.printf("%s score : \t%.2f\n", name[3], (double)score[3]);
//
//		double average = (double)(score[0]+score[1]+score[2]+score[3])/4;
//		System.out.printf("------\naverage: \t%.2f",average);
//		
//		scanner.close();
		
		int[] attArr1 = {10,20,30,40,50,60};
		int[] attArr2 = null;
		int[] attArr3 = null;
		
		// array length
		System.out.println("attArr1.length :" + attArr1.length);
		
		// array element 
		System.out.println("attArr1 :" + Arrays.toString(attArr1));
		
		// array copy
		attArr3 = Arrays.copyOf(attArr1, attArr1.length); // not copying the memory address, just values
		System.out.println("attArr3 :" + Arrays.toString(attArr3));

		// array reference
		attArr2 = attArr1; // pointing same memory
		System.out.println("attArr1 :" + attArr1);
		System.out.println("attArr2 :" + attArr2);
		System.out.println("attArr3 :" + attArr3);
		
		
		// if
		int num1 = 10; int num2 = 20;
		
		if(num1 < num2) {
			System.out.println("num1 is lower than num2");
		} else if(num1 > num2) {
			System.out.println("num1 is bigger than num2");
		} else {
			System.out.println("num1 equals to num2");
		}
		
		// switch 
		System.out.print("enter your score :");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score) {
			case 100:
			case 90:
					System.out.println("good");
			break;
		
			case 80:
					System.out.println("soso");
			break;
		
			case 70:
					System.out.println("not good");
			break;
		
			default:
					System.out.println("try again!");
			break;		
		}
		
		inputNum.close();
//		
		// for loop
		System.out.print("INPUT NUM :");
		Scanner scanner2 = new Scanner(System.in);
		int inputNumm = scanner2.nextInt();
			
		for (int i =1 ; i<10; i++) {
			System.out.printf("%d * %d = %d\n", inputNumm, i ,(inputNumm*i));
		}
		
		//while
		System.out.print("INPUT NUM :");
		int num = scanner2.nextInt();
		int i = 1;
		while (i<10) {
			System.out.printf("%d * %d = %d\n", num, i , (num*i));
			i++;
		}
		
		// do ~ while: regardless of condition, first run always occurs and check while condition
		int v = 10;
		do {
			System.out.println("do at least once");
			v++; 
		} while (v<13); 
	}
}
