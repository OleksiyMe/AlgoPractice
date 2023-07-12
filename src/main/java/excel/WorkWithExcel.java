package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkWithExcel {

    public static void main(String[] args) throws IOException, InvalidFormatException {

       //this part works with .xlsx

        // Better use OPCPackage of File FileInputStream ExcelFile = new FileInputStream("src/main/java/excel/Book1.xlsx");
        OPCPackage pkg = OPCPackage.open(new File("src/main/java/excel/Book1.xlsx"));
        //Simple way -- XSSFWorkbook excelWBook = new XSSFWorkbook(new File("src/main/java/excel/Book1.xlsx"));
        XSSFWorkbook excelWBook = new XSSFWorkbook(pkg);
        XSSFSheet excelWSheet =  excelWBook.getSheet("Sheet1");
        XSSFCell cell = excelWSheet.getRow(0).getCell(0);
        pkg.close();
        excelWBook.close();
        System.out.println(cell.toString());

        //        if you want code that doesn't care whether it's an .xls or an .xlsx:
        //        Workbook wb = WorkbookFactory.create(new File("MyExcel.xls"));
        Workbook excelWBook1 = WorkbookFactory.create(new File("src/main/java/excel/Book1.xls"));
        Sheet excelWSheet1 =  excelWBook1.getSheet("Sheet1");
        Cell cell1 =excelWSheet1.getRow(0).getCell(0);
        System.out.println(cell1.toString());
        excelWBook1.close();
    }
}
