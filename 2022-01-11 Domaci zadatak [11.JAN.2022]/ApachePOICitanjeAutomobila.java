package ApachePOIAutomobili;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ApachePOICitanjeAutomobila {
    public static void main(String[] args) {
        ArrayList<Automobil>nizAutomobila= new ArrayList<>();

        File f = new File("MojExcellFajl.xlsx");
        try{
            InputStream is = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(is);
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(2);
            Cell cell = row.getCell(2);

           String vrednostKojaSeNalaziUCeliji = cell.getStringCellValue();
            System.out.println(vrednostKojaSeNalaziUCeliji);
            wb.close();

        }catch (IOException e){
            System.out.println("odgovarajuci fajl nije pronadjen");
        }
    }
}
