package javase.base;

//专门处理浮点数精度问题
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;	//必须使用util类

import javax.xml.crypto.Data;

public class TestArea {
	public static void main(String[] args) throws ParseException {
		//3. 浮点数转换字符串
		double d = 0.8;
		String s = String.valueOf(d);
		System.out.println("-"+s);
		
		//4. 日期转成字符串
		//创建当前日期
		Date date = new Date();
		System.out.println(date);
		
		//中文写法：xxxx年xx月xx日
		//String pattern = "yyyy年MM月dd日 HH时mm分ss秒";		//样式、格式
		String pattern = "yyyy-MM-dd";		//样式、格式
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		//线程非安全，不能共享
		
		//把日期按照pattern来输出
		String sDate = sdf.format(date);
		System.out.println(sDate);
		
		String pattern1 = "yyyy年M月d日";
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat(pattern1);
		System.out.println( sdf1.format(date));
		
		//5. 自己创建时间
		String p = "yyyy-M-d";
		SimpleDateFormat df = new SimpleDateFormat(p);
		//把字符串格式日期转换日期类型
		Date d1= df.parse("1988-03-15");
		System.out.println(d1);
		
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}



