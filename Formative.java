public class Formative {
	public static void main(String[]args) {      
	Person p = new Person("Hero", 43);
	String n = p.getN();
	int a = p.getA();
	System.out.println("Name : "+n+" and Age : "+a);
    
    Student s = new Student("Mombro", 43, 1007089);
	String n1 = s.getN();
	int a1 = s.getA();
	int i = s.getSid();
	System.out.println("Name :  "+n1+" , Age : "+a1+" and Student ID : "+i);
	}
}

class Person 
{	
	private String name;
	private int age;
	
		Person(String name, int age)
		 {
		   this.name = name;
		   this.age = age;
         }

	public String getN()
	   {
		   return name;
	   }
	public int getA() 
	   {
		   return age; 
       }

 }

class Student extends Person 
{
	private String name;
	private int age;
	private int studentId;

	Student(String name, int age, int studentId) 
	    {
		super(name,age);
		this.studentId = studentId;
        }
    public int getSid() 
       {
		return studentId; 
       }
}
