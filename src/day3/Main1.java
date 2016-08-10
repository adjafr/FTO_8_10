package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main1
{

	public static void main(String[] args) throws Exception
	{
		File file = new File("exception1.txt");

		if (file.exists())
		{
			BufferedReader read = null;
			read = new BufferedReader(new FileReader(file));
			Student gary = new Student(read.readLine(), read.readLine(), read.readLine());
			System.out.println(gary);
		}

		else

		{
			BufferedWriter write = null;

			try
			{
				Student stud = new Student("Jeff", "Georgia", "Atlanta");
				OutputStream out = new FileOutputStream(file);
				write = new BufferedWriter(new OutputStreamWriter(out));
				
				write.write(stud.getName());
				write.newLine();
				write.write(stud.getState());
				write.newLine();
				write.write(stud.getCity());

			} catch (Exception e)
			{

			} finally
			{
				if (write != null)
				

					try
					{
						write.close();

					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}

			// C:\Users\ft1\Documents

		}
	}

