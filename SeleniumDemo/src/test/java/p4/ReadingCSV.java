package p4;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadingCSV {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\data.csv"));
		List<String[]> li =reader.readAll(); //it will read the data and dump in li
		
		System.out.println(li.size());
//		Iterator<String[]> i=li.iterator();
//		
//		while(i.hasNext()) {
//			String[] s=(String[]) i.next();
//			for(int j=0;j<s.length;j++)
//			{
//				System.out.print(s[j]+" ");
//			}
//			System.out.println("");
//		};
		
		for(String[] s:li) {
			for (String element : s) {
                System.out.print(element + " ");
            }
            System.out.println();		}
	}

}
