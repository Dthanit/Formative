import java.util.Scanner;
import java.util.*;
public class Formative 
{
	public static void main(String[]args)
	{

Person p = new Person(name,age);
String name = "Hero";
int age = 43;
System.out.println("Name is and "+name+" Age is "+age);
Student s = new Student();
name = "Hero";
age = 43;
System.out.println("Name is and "+name+" Age is "+age+"Student ID is "+studentId);
	}
class Person
{
private String name;
int age;
}
class Student extends Person
{
private String name;
int age;
private int studentId;
studentId = 1007089;

}
}