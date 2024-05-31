package genericlib;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {
	
	public String getDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/prop.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getExcelDatafromFile(String sheetname, int rowNum, int colNum) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/ExcelData.xlsx");
		Workbook wp=WorkbookFactory.create(fis);
		Sheet sheet=wp.getSheet(sheetname);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}

   public static String getCurrentTime()
    {
	LocalDateTime l=LocalDateTime.now();
	 String name=l.toString().replace(":","-");
	 return name;

    }
}
