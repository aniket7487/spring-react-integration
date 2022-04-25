package com.springreact.Springreactintegration.services;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExcelService {
    
	private void writeHeaderLine(XSSFWorkbook workbook) {
		System.out.println("Inside writeHeaderLine start");
		XSSFSheet sheet = workbook.createSheet("Users");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "User ID", style,sheet);      
        createCell(row, 1, "E-mail", style,sheet);       
        createCell(row, 2, "Full Name", style,sheet);    
        createCell(row, 3, "Roles", style,sheet);
        createCell(row, 4, "Enabled", style,sheet);
        System.out.println("Inside writeHeaderLine end");
        writeDataLines(workbook,sheet);
    }
     
    private void createCell(Row row, int columnCount, Object value, CellStyle style,XSSFSheet sheet) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines(XSSFWorkbook workbook,XSSFSheet sheet) {
        int rowCount = 1;
        System.out.println("Inside writeDataLines start");
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
                 
        Row row = sheet.createRow(rowCount++);
        int columnCount = 0;
//        User user=new User("1","abc@gmail.com","ABC","Admin","Yes");
//        createCell(row, columnCount++, user.getId(), style);
//        createCell(row, columnCount++, user.getEmail(), style);
//        createCell(row, columnCount++, user.getFullName(), style);
//        createCell(row, columnCount++, user.getRole(), style);
//        createCell(row, columnCount++, user.getIsEnabled(), style);
             
        System.out.println("Inside writeDataLines end");
    }
     
    public void export(HttpServletResponse response) throws IOException {
    	System.out.println("Inside Export start");
    	XSSFWorkbook workbook=new XSSFWorkbook();
        writeHeaderLine(workbook);
        
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
        System.out.println("Inside Export end");
         
    }

}
