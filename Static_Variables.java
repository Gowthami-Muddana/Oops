package oops;

public class Static_Variables {
	String name;
	int age;
	static String College_name = "rjms";
	Static_Variables(String n,int a){
		this.name = n;
		this.age = a;
	}
	void display(){
		System.out.println( name +" "+ age +"  "+ College_name + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variables sv = new Static_Variables("manju ", 35 );
		Static_Variables sv1 = new Static_Variables("praneeth " , 4);
		sv.display();
		sv1.display();
	}

}
