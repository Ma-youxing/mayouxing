package str;

import java.util.Scanner;

public class StrMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s="汉皇重色思倾国御宇多年求不得家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行里";
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
				s1.insert(i, "。 ");
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
		System.out.println("出现次数:" + h);
		
		
		
		
	sc.close();	
	}
	

}
