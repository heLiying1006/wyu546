package day4;

import java.sql.Date;

public class Emp {
	public Emp(String name, int age, String gender, int salary, int hiredate) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Emp emp1=new Emp("Jack",21,"男",2000,2015-05-12);
		Emp emp2=new Emp("Mark",20,"女",3000,2013-03-24);
		Emp emp3=new Emp("Marry",19,"男",7000,2011-12-26);
		Emp emp4=new Emp("Lisa",33,"女",5200,2008-11-30);
		Emp emp5=new Emp("Smith",22,"nv",6700,2016-10-17);
		Emp emp6=new Emp("李大嘴",29,"男",19000,2002-11-19);
		Emp emp7=new Emp("佟湘玉",18,"女",12000,2008-07-29);
		Emp emp8=new Emp("吕秀才",20,"男",10000,2007-9-21);
		Emp emp9=new Emp("张三",21,"男",11000,2004-8-03);
		Emp emp10=new Emp("李四",26,"男",14000,2001-06-18);
		Emp emp11=new Emp("王五",31,"男",18000,2003-04-07);
		
	}
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "姓名：" + name + "年龄：" + age + "性别：" + gender + "薪资：" + salary + "入职时间：" + hiredate;
	}
	@Override
	public boolean equals(Object obj) {
		
		// TODO 自动生成的方法存根
		if(obj==this) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		Emp that=(Emp) obj;
		if(this.name==that.name && this.age==that.age && this.gender==that.gender && this.salary==that.salary) {
			return true;
		}
		return super.equals(obj);
	}
	
	
}
