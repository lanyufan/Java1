package com.shi.demo;

public class Demo01 {

	// ����ΪString��
	public void testString(String str) {
		switch (str) {
		case "����":
			System.out.println("�ҽ�����");
			break;
		case "����":
			System.out.println("�ҽ�����");
			break;
		case "����ǿ":
			System.out.println("�ҽ�����ǿ");
			break;
		default:
			System.out.println("����������");
			break;
		}
	}

	// �ж�����Ϊ�ַ���char
	public void testChar(char c) {
		switch (c) {
		case 'a':
			System.out.println("������ж�����Ϊa�����");
			break;
		case 'd':
			System.out.println("������ж�����Ϊd�����");
			break;
		case 'b':
			System.out.println("������ж�����Ϊb�����");
			break;
		case 'c':
			System.out.println("������ж�����Ϊc�����");
			break;
		default:
			System.out.println("������ж�����Ϊ���������");
			break;
		}

	}

	// �ж�����Ϊ��������
	public void testInt(int x) {
		switch (x) {
		case 1:
			System.out.println("���ǵ�һ�����");
			break;
		case 2:
			System.out.println("���ǵڶ������");
			break;
		case 3:
			System.out.println("���ǵ��������");
			break;
		case 4:
			System.out.println("���ǵ��������");
			break;
		default:
			System.out.println("������������");
			break;
		}
	}
}
