package com.baidu.wgz.zuoye;

import java.util.Scanner;

public class CardApp {

	public static void main(String[] args){
		
		CashCard[] cards={
				new CashCard("A001",500,0),
				new CashCard("A002",300,0),
				new CashCard("A003",1000,1)
				
		};
		
		Scanner scanner=new Scanner(System.in);
		for(CashCard card:cards){
			
			System.out.printf("Îª(%s,%d,%d)´¢Öµ:",card.number,card.balance,card.bonus);
			card.store(Scanner.nextInt());
			System.out.println("Ã÷Ï¸(%s,%d,%d)%n",card.number,card.balance,card.bonus);
			
		}
	}
}
