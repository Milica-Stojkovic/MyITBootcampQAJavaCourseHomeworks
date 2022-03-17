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

import static java.lang.Math.E;

public class ApachePOICitanjeNiza {
    public static void main(String[] args) {
        ArrayList<Automobil> nizAutomobila = new ArrayList<>();

        File f = new File("MojExcellFajl.xlxs");
        try {
            InputStream is = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(is);
            Sheet sheet = wb.getSheetAt(0);
            int ukupnoRedova = sheet.getLastRowNum();
            for (int sledeciRedKojiCitam = 1; sledeciRedKojiCitam < ukupnoRedova; sledeciRedKojiCitam++) {
                Row r = sheet.getRow(sledeciRedKojiCitam);
                Cell markaAutomobilaCelija = r.getCell(0);
                Cell zemljaPoreklaCelija = r.getCell(2);
                Cell bojaCelija = r.getCell(2);
                Cell kilometrazaCelija = r.getCell(2);

                String markaAutomobila = markaAutomobilaCelija.getStringCellValue();
                String zemljaPorekla = zemljaPoreklaCelija.getStringCellValue();
                String boja = bojaCelija.getStringCellValue();
                double kilometraza = kilometrazaCelija.getNumericCellValue();

                Automobil a = new Automobil("marka", "zemljaPorekla", "boja", kilometraza);
                nizAutomobila.add(a);

            }
            wb.close();
            System.out.println("U excel fajlu se nalaze automobili: ");
            for (Automobil a : nizAutomobila) {
                System.out.println(a);

            }

    }catch(IOException e) {
            System.out.println("odgovarajuci fajl nije pronadjen");
        }
    }
}