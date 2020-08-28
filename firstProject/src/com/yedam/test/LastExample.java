package com.yedam.test;

public class LastExample {

	public static void main(String[] args) {
	
		Pet[] pArry = new Pet[6];
		pArry[0] = new Pet("야옹이", 2, "수컷");
		pArry[1] = new Pet("멍멍이", 1, "암컷");
		pArry[2] = new Pet("고먐미", 3, "암컷");
		pArry[3] = new Pet("멈뭄미", 2, "수컷");
		pArry[4] = new Pet("사월이", 1, "암컷");
		pArry[5] = new Pet("냠냠이", 1, "수컷");

		Fruit[] fArry = new Fruit[6];
		fArry[0] = new Fruit("딸기", 3000);
		fArry[1] = new Fruit("자몽", 1500);
		fArry[2] = new Fruit("수박", 4000);
		fArry[3] = new Fruit("사과", 2000);
		fArry[4] = new Fruit("자두", 2500);
		fArry[5] = new Fruit("포도", 1000);
		
		Person[] person = new Person[3];
		person[0] = new Person("김다희", 22, new Pet[] {pArry[0],pArry[1]}, new Fruit[] {fArry[0], fArry[1]});
		person[1] = new Person("이광호", 19, new Pet[] {pArry[2],pArry[3]}, new Fruit[] {fArry[2], fArry[3]});
		person[2] = new Person("김도은", 20, new Pet[] {pArry[4],pArry[5]}, new Fruit[] {fArry[4], fArry[5]});


		System.out.println(person[0]);
		System.out.println(person[1]);
		System.out.println(person[2]);

	}
}

//{ 사람이름, 나이, 애완동물(이름, 나이, 성별), 과일(과일명, 가격) }
//최재영,20,[{야옹이,2,수컷},{멍멍이,1,암컷}],[{사과,500},{키위,100}]
//3명
