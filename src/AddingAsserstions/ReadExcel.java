package AddingAsserstions;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		String path = "C:\\Users\\Abhishek\\Desktop\\Book1.xlsx";
		FileInputStream FileStream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(FileStream);    
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		
		for(int i=1;i<=rowcount;i++) {
			int SrNo = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			String Name =  sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.print(SrNo);
			System.out.print("  ");
			System.out.println(Name);
		}
	}

}
