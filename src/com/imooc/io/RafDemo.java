package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

public class RafDemo {

	public static void main(String[] args) throws IOException{
		File demo = new File("demo");
		if(!demo.exists()) {
			demo.mkdir();
		}
		
		File file = new File(demo,"raf.dat");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//指针位置
		System.out.println(raf.getFilePointer());
		//只会写一个字节，不会写一个字符，只会写后8位
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('B');
		int i=0x7ffffff;
		//用write要把i写进去要写4次
		raf.write(i>>>24);//高8位
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		raf.writeInt(i);
		System.out.println(raf.length());
		String s = "中";
		byte[] gbk = s.getBytes("gbk");
		raf.write(gbk);
		System.out.println(raf.length());
		
		//读文件 必须把指针移到开头
		raf.seek(0);
		//一次性读取,把文件中的内容都读到字节数组中
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		raf.close();
	}

}
