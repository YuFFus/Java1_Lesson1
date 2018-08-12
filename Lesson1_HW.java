/*
	* Java. Level 1. Lesson 1. Homework.
	* @author Yuriy Fedak
	* @version 12.08.2018
*/

class Lesson1_HW {
	byte t = 3;
	short s = -4;
	int i = -74;
	long l = 987L;
	float flo = 1.245f;
	double dob = 2.345;
	boolean bool = true;
	char ch = 'f';
	static int add (int a, int b, int c, int d) { 
		return (a*(b+(c/d)));
		}
	static boolean comp (int a, int b) {
		if ((a+b)>=10&&(a+b)<=20) return true;
		else return false;
		}
	static void signCheck (int a) {
		if (a>=0) System.out.println("Введенное значение положительное");
			else System.out.println("Введенное значение отрицательное");
		}
	static boolean signCheck1 (int a) {
		if (a<0) return true;
		else return false;
		}
	static void printname (String a) {
		System.out.println ("Привет, " + a);
		}
	static void yearCheck (int a) {
		if ((a % 4)==0) {
			if ((a % 400)==0) System.out.println("Год " + a + " является високосным!");
			else if ((a % 100)==0) System.out.println("Год  " + a + " не является високосным");
			else System.out.println("Год " + a + " является високосным");
			}
		else System.out.println ("Год " + a + "  не является високосным!");
		}
	public static void main(String[] args) {
		System.out.println ("Результат работы первого метода = " + add (1, 2, 6, 3));
		System.out.println ("Результат работы второго метода с аргументами 5+2 = " + comp(5, 2));
		System.out.println ("Результат работы второго метода с аргументами 10+5 = " + comp(10, 5));
		signCheck(1);
		signCheck(-2);
		System.out.println ("Результат работы четвертого метода с аргументом (-1) = " + signCheck1(-1));
		printname ("Юрий");
		yearCheck(1600);
		yearCheck(1500);
		yearCheck(1212);
		yearCheck(1211);
	}  
}
	
	