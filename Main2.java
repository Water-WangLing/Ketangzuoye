package com.orilore.gb.test3;

import java.util.LinkedList;

import com.orilore.gb.test2.Employee;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Employee> list = new LinkedList<Employee>();
			
		 Employee e1 = new Employee("10001", "zhangsan");
		 
		 Employee e2 = new Employee("10002", "lisi");
		 
		 Employee e3 = new Employee("10003", "wangwu");
		 list.add(e1);
		 
		 list.addFirst(e2);
		 
		 list.addLast(e3);
		 
		Employee e = list.removeLast();
		
		for(Employee es:list){
			
			System.out.println(es.getEmployeename());
			
			
		}
		
		
		 
		 
		 
	}

}
