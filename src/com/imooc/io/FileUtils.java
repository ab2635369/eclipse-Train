package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	/**
	 * 列出指定目录下的所有文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()) {
			throw new IllegalArgumentException("目录："+dir+"不存在");
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException(dir+"不是目录");
		}
		/*String[] filenames = dir.list();//返回字符串数组
		for (String string : filenames) {
			System.out.println(dir+"\\"+string);
		}*/
		//如果要遍历子目录下的内容需要构造成File对象做递归操作
		File[] files = dir.listFiles();//返回的是直接子目录的抽象
		if(files!=null&&files.length>0) {
			for (File file : files) {
				if(file.isDirectory()) {
					//递归
					listDirectory(file);
				}else {
					System.out.println(file);
				}
			}
		}
	}
}
