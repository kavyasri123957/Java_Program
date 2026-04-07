class person{
	String name;
	int age;
	void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
class employee extends person{
	int salary;
	void displayemploye() {
		System.out.println("salary: "+salary);
	}
}
class worker extends person{
	String companyname;
	void displaystudent() {
		System.out.println("companyname: "+companyname);
	}
}
public class multilevel {
	public static void main(String[] args) {
		person p=new person();
		employee e=new employee();
		worker w=new worker();
		p.name="sangita";
		p.age=20;
		e.salary=40000;
		w.companyname="tcs";
		p.display();
		e.displayemploye();
		w.displaystudent();
	}

}