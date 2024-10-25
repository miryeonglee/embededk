package javabasic;

public class HelloJava {

	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 30;
 
 System.out.println((number1 + number2) + " > 더하기");
 System.out.println((number1 - number2) + " > 빼기");
 System.out.println((number1 * number2) + " > 곱하기");
 System.out.println((number1 % number2) + " > 나누기");
 System.out.println((number1 % number2) + " > 나누기 나머지");

double korean = 80.5;
double math = 80.5;
double english = 80.5;
//
//System.out.println( "총점" + (korean + math + english));
//System.out.println( "평균" + ((korean + math + english)/3));

//정답

double sum = (korean + math + english);
double avg = (sum /3);

System.out.println(sum);
System.out.println(avg);



	}
} //class
      