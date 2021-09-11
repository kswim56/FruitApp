package com.example.fruitapp;
import java.util.Comparator;

public class Fruit{
	int no;
	String name;
	int prefer;
	
	public Fruit(int no, String name, int prefer) {
		super(); 
		//�θ� Ŭ������ ����� �ʱ�ȭ�ϱ� ���� �ڹ� �����Ϸ��� �θ� Ŭ������ �����ڸ� ��������� ȣ������ �ʴ� ��� �ڽ� Ŭ������ ������ ù �ٿ� �ڵ����� �Է�����.
		this.no = no;
		this.name = name;
		this.prefer = prefer;
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
	
	public int getPrefer() {
		return prefer;
	}
	public void setPrefer(int prefer) {
		this.prefer = prefer;
	}
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", prefer=" + prefer + "]";
	}
	
	

}
class FruitComparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
	
}


