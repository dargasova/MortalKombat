package com.mycompany.lr5;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelManager {

    private ArrayList<Result> results;

    public ExcelManager(ArrayList<Result> results) {
        this.results = results;
    }

    public void writeToExcel() throws IOException {
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Результаты ТОП 10");
        XSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("№");
        headerRow.createCell(1).setCellValue("Имя");
        headerRow.createCell(2).setCellValue("Количество баллов");

        for (int i = 0; i < results.size(); i++) {
            if (i < 10) {
                XSSFRow row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(results.get(i).getName());
                row.createCell(2).setCellValue(results.get(i).getPoints());
            }
        }

        File file = new File("Results.xlsx");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            book.write(outputStream);
        }
    }

    public void readFromExcel() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("Results.xlsx"));
        XSSFWorkbook book = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = book.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String name = sheet.getRow(i).getCell(1).getStringCellValue();
            int points = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
            results.add(new Result(name, points));
        }

        inputStream.close();
    }
}
