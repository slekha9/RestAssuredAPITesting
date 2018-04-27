package rest.api.test.SPA_MotionANGEL.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args)  throws IOException
	{
		// TODO Auto-generated method stub

		File src=new File("C:\\Users\\Lekha\\inoutdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total rows: "+rowCount+1);
		
		for(int i=0;i<rowCount;i++)
		{
			String celldata0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Cell data: " +celldata0);
		}
		
		
	}

}
