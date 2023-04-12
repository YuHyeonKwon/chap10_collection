package com.javalab.collection.pkg07_01;

public class HashMapMain { // class s

	public static void main(String[] args) { // main s

		// 1. 과일 객체 생성
		Fruit apple = new Fruit("Apple", 3000);
		Fruit banana = new Fruit("Banna", 3500);
		Fruit orange = new Fruit("Orange", 4000);

		// 2. 과일 객체를 담을 박스 객체 생성
		Box<Fruit> box = new Box<Fruit>();
		box.addItem(apple);
		box.addItem(banana);
		box.addItem(orange);

		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println("이름:" + fruit.getName() + "\t" + "가격:" + fruit.getPrice());
		}
		System.out.println();

		// 4. 야채 객체 생성
		// "시금치", 1500 변수명 : 시금치
		// "양배추", 2500 변수명 : 양배추
		// "대파", 3500 변수명 : 대파
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 2500);
		Vegitable 대파 = new Vegitable("대파", 3500);

		// 5. 야채를 담을 박스 객체 생성
		Box<Vegitable> box1 = new Box<>();
		// 박스에 야채 객체 담기(저장)
		box1.addItem(시금치);
		box1.addItem(양배추);
		box1.addItem(대파);

		// 6. 박스에서 야채 조회/출력
		for (Vegitable vegitable : box1.getItems()) {	//box1.getItem <- ArrayList
			System.out.println("이름:" + vegitable.getName() + "\t\t" + "가격:" + vegitable.getPrice());
		}
	} // main e

} // class e
