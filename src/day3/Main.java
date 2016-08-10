package day3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class Main
{

	public static void main(String[] args)
	{
		File file = new File("test");
		
		//subclasses of input stream and output stream
//		InputStream in = new FileInputStream(file);
//		OutputStream out = new FileOutputStream("out");
//		
//		
//		
//		BufferedInputStream butt = new BufferedInputStream(in);
		
		BufferedReader read = null;
		
		try
		{
			read = new BufferedReader(new FileReader(file));
			
			System.out.println(read.readLine());
		} 
		
		catch (FileNotFoundException e)
		{
			// Do one thing
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			// Do something else
			e.printStackTrace();
		}
		finally
		{
			if(read != null)
				try
				{
					read.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		

	}

}
