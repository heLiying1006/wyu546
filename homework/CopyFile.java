package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		String fileSrc="C:\\Users\\Administrator\\Desktop\\wyu546\\homework\\emp.txt";
		String fileDes="C:\\Users\\Administrator\\Desktop\\wyu546\\copy\\emp.txt";
		InputStream fis=null;
		OutputStream fos=null;
		try {
			fis=new FileInputStream(fileSrc);
			fos=new FileOutputStream(fileDes);
			long num=0;
			int bt=0;
		
			while ((bt = fis.read()) != -1) {
				fos.write(bt); 
				num++;
			}
			System.out.println("读取的字节数为" + num + "\n 文件复制成功");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
