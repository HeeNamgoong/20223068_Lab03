import java.util.*;
//An exploration of basic input and output.
class BasicIO {
//Reads and processes string input.
public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
//get first input
//System.out.print("Enter your name: ");
//String name = stdin.nextLine();
////display output on console
//System.out.println("your name is " + name);
//int years = stdin.nextInt();
//System.out.println("your age is " + years);
//
//int day = years*365;
//System.out.println(day);
//
//System.out.print("How tall are you?: ");
//int height = stdin.nextInt();
//System.out.println("height: " + height);

int years = stdin.nextInt();
int month = stdin.nextInt();
int day = stdin.nextInt();
String name = stdin.next();
int age = stdin.nextInt();
int height = stdin.nextInt();
// 2005�� 09�� 06�� ���� ȫ�浿(20)�� Ű�� 160 cm �Դϴ�
System.out.printf("%d�� %d�� %d�� ���� %s(%d)�� Ű�� %d cm �Դϴ�", years, month, day, name, age, height);
} // method main
} // class BASIC_IO