package com.soniya;

import java.net.SocketOption;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	  isEvenOrOdd();
	  isPrime();
	  greatestNumber();
	  smallestNumber();
	  sumOfNNumbers();
       printingFibonacci();
      lessThanNTerm();
      nTerm();
     armStrongNumber();
     divisibilityTest();
     areaSquare();
     weekDays();
     averageOf();
     patternProgram();
     secondLargest();
     lcmAndHcf();
     vowelOrConsonent();
     multiplicationTable();
    }
    public static void isEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = sc.nextLong();

        if(num % 2 == 0){
            System.out.println("The number is a even number");
        }
        else if (num % 2 == 1){
            System.out.println("The number is a odd number");
        }
    }
    public static void isPrime(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        long n = s.nextLong();

        long sum = 1;
        for(int i=2; i<n/2; i++){
            if (n%i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum == 1 ? "prime" : "Not a prime");
    }
    public static void greatestNumber(){
        System.out.println("Program to find the biggest number among three numbers");
        Scanner scan = new Scanner(System.in);
        int array[] = new int[3];
        int size = array.length;
        System.out.println("Enter the three numbers");
        for(int i=0; i<size; i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int max = array[size-1];
        System.out.println("The biggest number is = " + max);
    }
    public static void smallestNumber(){
        System.out.println("Program to find the smallest number among three numbers");
        Scanner scan1 = new Scanner(System.in);
        int array1[] = new int[3];
        int size = array1.length;
        System.out.println("Enter the three numbers");
        for(int i=0; i<size; i++){
            array1[i] = scan1.nextInt();
        }
        Arrays.sort(array1);
        int min = array1[size-3];
        System.out.println("The smallest number is = " + min);
    }
    public static void sumOfNNumbers(){
        System.out.println("Program to find the sum of N numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int sum = 0;
        for ( int i=0; i<=num; i++){
            sum= sum+i;
        }
        System.out.println("Sum= " + sum);
    }
    public static void printingFibonacci(){
        System.out.println("Program to print Fibonacci series upto N term");
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the number");
        int fib = s4.nextInt();
        int result;
        int v1 =0;
        int v2 = 1;
        for(int i = 1; i<=fib; ++i){
            System.out.print(v1 + ", ");
            result = v1+v2;
            v1 = v2;
            v2 = result;
        }
      }
    public static void lessThanNTerm(){
        System.out.println("Program to print Fibonacci series less than N term");
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the number");
        int fib = s4.nextInt();
        int result;
        int v1 =0;
        int v2 = 1;
        for(int i = 1; i<fib; ++i){
            System.out.print(v1 + ", ");
            result = v1+v2;
            v1 = v2;
            v2 = result;
        }
    }
    public static void nTerm(){
        System.out.println("Program to print Fibonacci series of N term");
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the number");
        int fib = s4.nextInt();
        int result;
        int v1 =0;
        int v2 = 1;
        int term = v1;
        for(int i = 1; i<=fib; ++i) {
            //  System.out.print(v1 + ", ");
            term = v1;
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("The nth term is " + term);
    }
    public static void armStrongNumber(){
        System.out.println("Program to check armstrong or not");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int n = num;
        int temp;
        int total = 0;
        while (n != 0)
        {
            temp = n%10;
            total = total + temp*temp*temp;
            n = n/10;
        }
        if (total == num){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
    public static void divisibilityTest(){
        System.out.println("Divisibility program");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        System.out.println(num%2 == 0 ? "Divisible by 2" : "Not Divisible by 2");
        System.out.println(num%3 == 0 ? "Divisible by 3" : "Not Divisible by 3");
        System.out.println(num%5 == 0 ? "Divisible by 5" : "Not Divisible by 5");
        System.out.println(num%9 == 0 ? "Divisible by 9" : "Not Divisible by 9");
    }
    public static void areaSquare(){
        System.out.println("Program to find area");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side");
        int side = s.nextInt();
        System.out.println("Area of a Square = " + (side*side));
        Scanner l = new Scanner(System.in);
        System.out.println("Enter length");
        int length = l.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter breadth");
        int breadth = b.nextInt();
        System.out.println("Area of a rectangle = " + (length*breadth));
    }
    public static void weekDays(){
        System.out.println("Program to print Week days");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        switch(n) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static void averageOf(){
        System.out.println("Program to find average of 5 numbers");
        Scanner scan = new Scanner(System.in);
        int sum =0;
        double avg;
        int array[] = new int[5];
        System.out.println("Enter the numbers");

        for(int i = 0; i<array.length; i++){
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }
        avg = (double)sum/array.length;
        System.out.println("Sum =" + sum + "Average = " + avg);
    }
    public static void patternProgram(){
        int n=5;
        for (int i =1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void secondLargest(){
        System.out.println("Program to find the second largest number");
        Scanner scan1 = new Scanner(System.in);
        int array1[] = new int[5];
        int size = array1.length;
        System.out.println("Enter the five numbers");
        for(int i=0; i<size; i++){
            array1[i] = scan1.nextInt();
        }
        Arrays.sort(array1);
        int max = array1[size-2];
        System.out.println("The second largest number is = " + max);
    }
    public static void lcmAndHcf(){
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = x.nextInt();
        System.out.println("Enter the second number");
        int n2 = y.nextInt();
        int hcf=0;
        int lcm;
        for(int i = 1; i<=n1 || i<=n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);
        lcm = (n1 * n2)/hcf;
        System.out.println("lcm = " + lcm);
    }
    public static void vowelOrConsonent(){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the letter");
        char s = str.next().charAt(0);
        if(s =='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A'|| s=='E' || s=='O' || s=='I' || s=='U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonent");
        }
    }
    public static void multiplicationTable(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Program for multiplication table");
        System.out.println("Enter the number");
        int num = scan.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(i + "x" + num + "=" + (i*num));
        }
    }

}









