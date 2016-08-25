package t1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/*
 * ������ dom4j
 */
public class WriteXML {
	/**
	 * 
	 * @param d
	 * @param path
	 */
	public static void outXML(Document d,String path){
		  OutputFormat format = OutputFormat.createPrettyPrint();  
	        // ���ø�ʽ����Ա����������  gbk ��UTF-8
	        format.setEncoding("GBK");  
	        try {
				FileOutputStream output = new FileOutputStream(new File(path));  
				XMLWriter writer = new XMLWriter(output, format);  
				writer.write(d);  
				writer.flush();  
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}  
	}
}
