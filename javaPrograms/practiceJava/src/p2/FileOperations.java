package p2;


import java.io.*;
public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File obj=new File("C:\\Users\\E010302\\Desktop\\dmeo\\demo.txt");
		obj.createNewFile();
		System.out.println(obj.canWrite());
		
		FileWriter writer= new FileWriter(obj);
		writer.write("Hello how are you");
		writer.close();
		
		FileReader reader= new FileReader(obj);
		int j;
		
		while((j=reader.read())!=-1)
		{
			System.out.print((char)j);
		}
		System.out.println("");
		
		
		File anyName=new File("C:\\Users\\E010302\\Desktop\\Read.txt");
		anyName.createNewFile();//file is created
		System.out.println(anyName.canRead());
		
		FileWriter writer1=new FileWriter(anyName);
		writer1.write("Shree Hari ");
		writer1.close();
		
		FileReader reader1=new FileReader(anyName);
		int i;
		while((i=reader1.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		reader.close();

			
		

	}

}
