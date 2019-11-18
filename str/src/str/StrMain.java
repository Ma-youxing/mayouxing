package str;

import java.util.Scanner;//引入一个包

public class StrMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//输入一个新的字符串
		
		
		String s="汉皇重色思倾国御宇多年求不得家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行里";
		int i = 7;//变量初始化
		int j = 0;//变量初始化
		int h = 0;//变量初始化
		int k = 0;//变量初始化
		StringBuffer s1  = new StringBuffer(s);//读取一个字符串，并且放在是s1参数上
	
		for( ; i <=s1.length() ; i =i + 7) {//读取字符里内容，判断下标
			if(j == 0) 合起来
				s1.insert(i, ",");//添加一个逗号
				j = 1;
			}
			else {
				s1.insert(i, "。 ");//添加一个句号
				i += 2;
				j = 0;
			}
		}
		s = s1.toString();//用tosting把内容合起来
		String[] s2 = s.split(" ");//创建一个空的字符串，平且写进s的字符串
		for(i = 0 ; i < s2.length ; i++)//for循环读取id的内容
		System.out.println(s2[i]);//输出s2[i]
		System.out.println("please enter the chinese");
		String ju = sc.nextLine();//进行判断
		while(s.indexOf(ju,k+1) != -1) {//逐一判断
			h++;
			k = s.indexOf(ju,k+1);//符合字进行数量加1
		}
		System.out.println("出现次数:" + h);//输出字数
		Scanner scan = new Scanner(System.in);//
			String input = scan.nextLine();
			 if (input != null) {
				 System.out.println("包含次数为："+(s.toString()));  //统计个数并且打印出
		       }else {
		    	   System.out.println("不能为空！");   
		       }
		
		
		
	sc.close();	
	}
	

}
