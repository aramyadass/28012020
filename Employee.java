package org.emp;

public class Employee {
public void empid(int id) {
	System.out.println("Emp id is "+id);
	


}
private void empName(String name) {
	System.out.println("stringname is:" + name);

}
private void empSalary(float salary) {
	System.out.println("empsalary is: "+ salary);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empid(487254);
	e.empName("Dhanalakshmi");
	e.empSalary(64677.655f);
}
}