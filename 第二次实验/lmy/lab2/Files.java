package lmy.lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Files {
	public static String readString(String path){
	    String str="";
	    File file=new File(path);
	    try {
	         FileInputStream in=new FileInputStream(file);
	 // size 为字串的长度 ，这里一次性读完
        	 int size=in.available();
	         byte[] buffer=new byte[size];
	         in.read(buffer);
	         in.close();
	         str=new String(buffer,"UTF16");//GB2312
     	} catch (IOException e) {
	 // TODO Auto-generated catch block
        	 return null;
	 //e.printStackTrace();
	    }
    	str = stringFilter(str);
    	//System.out.println(str);
	    return str;
	}
	
	/*
	 * 过滤特殊字符
	 */
	public static String stringFilter(String str){
		str = str.replace('\n', ' ');
		str = str.replace('\r', ' ');
        String regEx = "[\\u00A0\"`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";//\\r\\t\\n\\f
        //return m.replaceAll("").trim();
        str = str.replaceAll(regEx, "");
        str = toLow(str);
        return str;
    }
	
	/*
	 * 大小写转换
	 */
	public static String toLow(String content) {
		int num = content.length();
		char[] contentArray = content.toCharArray();
		for(int i = 0 ; i < num ; i ++) {
			if(contentArray[i] < 91 && contentArray[i] > 60) {
				//System.out.println(content[i] + " has big char");
				contentArray[i] = (char) (contentArray[i] + 32);
			}
		}
		content = new String(contentArray);
		return content;
		//return null;
	}
	
	
	
	public static void fileWriter(String[] content, String path) {
		FileWriter writer;
        try {
            writer = new FileWriter(path);
            int num = content.length;
            for(int i = 0 ; i < num ; i ++) {
            	String thisOne = content[i];
            	writer.write(thisOne);
            	writer.write("\r\n");
            }
            writer.flush();
            writer.close();
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
