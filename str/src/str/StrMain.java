package str;

import java.util.Scanner;

public class StrMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s="������ɫ˼�����������󲻵ü���Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ��������������";
		int i = 7;
		int j = 0;
		int h = 0;
		int k = 0;
		StringBuffer s1  = new StringBuffer(s);
	
		for( ; i <=s1.length() ; i =i + 7) {
			if(j == 0) {
				s1.insert(i, ",");
				i++;
				j = 1;
			}
			else {
				s1.insert(i, "�� ");
				i += 2;
				j = 0;
			}
		}
		s = s1.toString();
		String[] s2 = s.split(" ");
		for(i = 0 ; i < s2.length ; i++)
		System.out.println(s2[i]);
		System.out.println("please enter the chinese");
		String ju = sc.nextLine();
		while(s.indexOf(ju,k+1) != -1) {
			h++;
			k = s.indexOf(ju,k+1);
		}
		System.out.println("���ִ���:" + h);
		
		
		
		
	sc.close();	
	}
	

}
