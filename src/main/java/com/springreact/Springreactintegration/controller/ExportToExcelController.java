package com.springreact.Springreactintegration.controller;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.Springreactintegration.services.ExcelService;
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = {"Content-Disposition"})
@RestController
public class ExportToExcelController {
	
	@Autowired
	private ExcelService excelExporter;

	@GetMapping("/exportToExcel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Data.xlsx";
        response.setHeader(headerKey, headerValue);
//         
//        List<User> listUsers = service.listAll();
//         
//        UserExcelExporter excelExporter = new UserExcelExporter(listUsers);
         
        excelExporter.export(response);    
    }  
}
