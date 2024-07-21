package com.ar;
import java.util.Scanner;

import com.ar.except.StudentRollException;
import com.ar.model.Student;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll no. of the student: ");
		long roll= sc.nextLong();
		sc.nextLine();
		System.out.print("Enter name of the student: ");
		String sname= sc.nextLine();
		System.out.print("Enter masspercentage of the student: ");
		double mp= sc.nextDouble();
		Student st = null;
		try {
				if (roll<=0) {
					throw new StudentRollException(roll);
				}
				st = new Student(roll, sname, mp);
		}catch (StudentRollException ex) {
			System.out.println(ex);
			roll = -1;
			st= new Student(roll, sname, mp);
		}finally {
			System.out.println(st);
		}
	}

}
