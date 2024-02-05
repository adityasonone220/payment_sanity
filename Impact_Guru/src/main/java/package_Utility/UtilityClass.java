package package_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class UtilityClass {

	public static String URL() throws IOException {
		String address = "C:\\Users\\ImpactGuru\\Desktop\\Selenium URLs\\URL.xlsx";
		FileInputStream file = new FileInputStream(address);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("URLs");
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.getCell(1);
		String URL = cell1.getStringCellValue();
		return URL;
	}
	
//	@DataProvider(name = "sitesData")
//    public Object[][] readSitesData() throws IOException {
//        String excelFilePath = "C:\\Users\\ImpactGuru\\Desktop\\Selenium URLs\\URL.xlsx";
//        FileInputStream inputStream = new FileInputStream(excelFilePath);
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet sheet = workbook.getSheet("URLs"); // Assuming your sheet name is "Sheet1"
//
//        int rowCount = sheet.getPhysicalNumberOfRows();
//        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//
//        Object[][] data = new Object[rowCount - 1][colCount];
//
//        for (int i = 1; i < rowCount; i++) {
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < colCount; j++) {
//                data[i - 1][j] = row.getCell(j).toString();
//            }
//        }
//
//        workbook.close();
//        inputStream.close();
//
//        return data;
//    }

	
	
	public static String UPIid() throws IOException {
		String address = "C:\\Users\\ImpactGuru\\Desktop\\Selenium URLs\\URL.xlsx";
		FileInputStream file = new FileInputStream(address);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("UPI_id");
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.getCell(1);
		String UPI = cell1.getStringCellValue();
		return UPI;
	}

	public static double DebitCard() throws IOException {
		String address = "C:\\Users\\ImpactGuru\\Desktop\\Selenium URLs\\URL.xlsx";
		FileInputStream file = new FileInputStream(address);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Debit_Cards");
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.getCell(1);
		double DebitCard = cell1.getNumericCellValue();
		return DebitCard;
	}

	
	
}
