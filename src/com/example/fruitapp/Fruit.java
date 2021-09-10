package com.example.fruitapp;

public class Fruit implements Comparable<Fruit> {
	int no;
	String name;
	
	public Fruit() {}
	public Fruit(int no, String name) {
		super(); 
		//�θ� Ŭ������ ����� �ʱ�ȭ�ϱ� ���� �ڹ� �����Ϸ��� �θ� Ŭ������ �����ڸ� ��������� ȣ������ �ʴ� ��� �ڽ� Ŭ������ ������ ù �ٿ� �ڵ����� �Է�����.
		this.no = no;
		this.name = name;
		//Ŭ������ �Ӽ��� ������/�޼ҵ��� �Ű�����(input parameter)�� �̸��� ���� ���
		//Ŭ���� �Ӽ��� ����� �� this Ű���带 �ٿ��ش�.
		
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
