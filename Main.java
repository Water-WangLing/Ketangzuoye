package com.orilore.gb.test2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
	  System.out.println("欢迎进入员工管理系统");
	  boolean flag = true;
	  
	  
	  while(flag){
	  
	   System.out.println("录入员工按1");
	   
	   System.out.println("删除员工按2");
	   
	   System.out.println("更新员工按3");
	   
	   System.out.println("查找员工按4");
	   
	   int userselect = s.nextInt();
	   
	   switch(userselect){
	   
	   case 1:  
		      System.out.println("请输入员工号");
		      
		      String employeeno = s.next();
		      
		      int index = IndexOfEmployeePosition(list,employeeno);
		      
		      
		      
		      if(index==-1){
		      System.out.println("请输入员工姓名");
		      
		      String employeename = s.next();
		      
		     Employee employee = new Employee(employeeno,employeename);
		     
		     list.add(employee);
		      }
		      
		      else{
		    	  
		    	     System.out.println("对不起员工号重复");
		    	  
		      }
		      
		      
		   
		   
		   
		   break;
	   
	   case 2:    
		    
		      System.out.println("请输入要删除的员工号");
		      
		      String employeeno1 = s.next();
		      
		     int index1 = IndexOfEmployeePosition(list,employeeno1);
    
		      if(index1!=-1){
		    	  
		    	    
		    	     list.remove(index1);
		    	  
		    	  
		      }
		      else{
		    	  
		    	  System.out.println("您输入员工号不存在");
		      }
		      
		      
		   
		   
		   
		   
		   break;
	   
	   case 3:    
		   
		   System.out.println("请输入您要更新员工号");
		   
		   String employeeno2 = s.next();
		   
		   
		   int index2 =  IndexOfEmployeePosition(list,employeeno2);
		   
		   if(index2!=-1){
			   
			  Employee updateemployee = list.get(index2);
			  
			  System.out.println("请输入新的员工名字");
			  
			  String newemployeenam = s.next();
			  
			  updateemployee.setEmployeename(newemployeenam);
			  
			  
			  
			  
			   
			   
			   
			   
		   }
		   else{
			   
			   System.out.println("您输入员工号不存在");
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   break;
	   
	   
	   case 4:    
		   
		      for(Employee e:list){
		    	    System.out.println("--------------");
		    	    System.out.println(e.getEmployeeno());
		    	    System.out.println(e.getEmployeename());
		    	    System.out.println("--------------");
		    	    
		    	  
		    	  
		    	  
		      }
		   
		   
		   
		   
		   
		   break;
	   
	   
	   
	   
	   }
	   System.out.println("请按1继续其他退出");
	   
	   String userinput = s.next();
	   
	   if(!userinput.equals("1")){
		   
		   break;
		   
		   
	   }
	   
	   
	   
	   
	  }
	   
	   
	   
	   
	  
	  
	  
		
		
		
		
		
		
	}

	
	//------提出来公共代码部分
	public  static int IndexOfEmployeePosition(ArrayList<Employee> list,String employeeno){
		
		 int index = -1;
	      
		    for(int i = 0;i<list.size();i++){
		    	
		    	   Employee employee = list.get(i);
		    	   
		    	   if(employee.getEmployeeno().equals(employeeno)){
		    		   
		    		   index = i;
		    		   
		    		    break;
		    	   }
		    	
		    	
		    	
		    }
		    
		    return index;
	}
	
	
	
	
}
