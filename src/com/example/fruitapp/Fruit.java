package com.example.fruitapp;

public class Fruit implements Comparable<Fruit> {
	int no;
	String name;
	
	public Fruit() {}
	public Fruit(int no, String name) {
		super(); 
		//부모 클래스의 멤버를 초기화하기 위해 자바 컴파일러가 부모 클래스의 생성자를 명시적으로 호출하지 않는 모든 자식 클래스의 생성자 첫 줄에 자동으로 입력해줌.
		this.no = no;
		this.name = name;
		//클래스의 속성과 생성자/메소드의 매개변수(input parameter)의 이름이 같은 경우
		//클래스 속성을 사용할 때 this 키워드를 붙여준다.
		
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
	
	

}
