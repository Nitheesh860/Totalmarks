package com.samco;

import java.util.Scanner;

public class TotalandAverage 
{
	

	public static void main(String[] args) {
		int  StudentId;
		String StudentName;
		int mark1,mark2,mark3,mark4,mark5;
		float  total,percentage,averagemark;
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five marks:");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
		mark4 = sc.nextInt();
		mark5 = sc.nextInt();
		total = mark1+mark2+mark3+mark4+mark5;
		averagemark = total/5;
		percentage = (total/5)*100;
		System.out.println("Total Marks:" +total);
		System.out.println("Average Marks:" +averagemark);
		System.out.println("Percentage marks:" +percentage);
		
	}

}

