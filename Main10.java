package com.orilore.gb.test6;

import java.util.*;

import com.orilore.gb.test2.Employee;
import com.orilore.gb.test5.SelfComparetor;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//ArrayList<Employee> list = new ArrayList<Employee>();
		SelfComparetor sf = new SelfComparetor();
		
		TreeSet<Employee> set = new TreeSet<Employee>(sf);
		
	  System.out.println("��ӭ����Ա������ϵͳ");
	  boolean flag = true;
	  
	  
	  while(flag){
	  
	   System.out.println("¼��Ա����1");
	   
	   System.out.println("ɾ��Ա����2");
	   
	   System.out.println("����Ա����3");
	   
	   System.out.println("����Ա����4");
	   
	   int userselect = s.nextInt();
	   
	   switch(userselect){
	   
	   case 1:  
		      System.out.println("������Ա����");
		      
		      String employeeno = s.next();
		      
		      Employee fe  = getPostionEmployee(set,employeeno);
		      
		      if(fe==null){
		    	  
		    	   System.out.println("������Ա������");
		    	   
		    	   String name = s.next();
		    	   
		    	   Employee newe = new Employee(employeeno, name);
		    	   
		    	   set.add(newe);
		    	  
		    	  
		    	  
		      }
		      else{
		    	  
		    	     System.out.println("�Բ����������Ա�����Ѿ�����");
		    	  
		      }
		      
		      
		      
		      
		    
		   
		   
		   break;
	   
	   case 2:    
		    
		      System.out.println("������Ҫɾ����Ա����");
		      
		      String employeeno1 = s.next();
		    
		      Employee fe1 = getPostionEmployee(set,employeeno1);
		      
		      if(fe1!=null){
		    	  
		    	      set.remove(fe1);
		    	  
		      }
		      else{
		    	  
		    	    System.out.println("�������Ա��������");
		    	  
		      }
		      
		      
		      
		   
		   
		   break;
	   
	   case 3:    
		   
		   System.out.println("��������Ҫ����Ա����");
		   
		   String employeeno2 = s.next();
		   
		   Employee fe2 = getPostionEmployee(set,employeeno2);
		   
		   
		   if(fe2!=null){
			   
			  System.out.println("��������");
			  
			  String newname = s.next();
			  
			  fe2.setEmployeename(newname);
			  
			   
			   
			   
			   
		   }
		   else{
			   
			   System.out.println("������Ա��������");
			   
		   }
		 
		   
		   
		   break;
	   
	   
	   case 4:    
		   
		      for(Employee e:set){
		    	    System.out.println("--------------");
		    	    System.out.println(e.getEmployeeno());
		    	    System.out.println(e.getEmployeename());
		    	    System.out.println("--------------");
		    	    
		    	  
		    	  
		    	  
		      }
		   
		   
		   
		   
		   
		   break;
	   
	   
	   
	   
	   }
	   System.out.println("�밴1���������˳�");
	   
	   String userinput = s.next();
	   
	   if(!userinput.equals("1")){
		   
		   break;
		   
		   
	   }
	   
	   
	   
	   
	  }
	   
	   
	   
	   
	  
	  
	  
		
		
		
		
		
		
	}

	
  public static Employee getPostionEmployee(TreeSet<Employee> set,String employeeno){
	    
	  Employee e = null;
	  
      Iterator<Employee> iter = set.iterator();
      
      while(iter.hasNext()){
    	  
    	  Employee emp = iter.next();
    	  
    	  if(emp.getEmployeeno().equals(employeeno)){
    		  
    		  e = emp;
    		  
    		  break;
    		  
    		  
    	  }
    	  
    	  
      }
	  
	  
	  
	  
	  
	  
	  return e;
  }
	
	
	
	
}
