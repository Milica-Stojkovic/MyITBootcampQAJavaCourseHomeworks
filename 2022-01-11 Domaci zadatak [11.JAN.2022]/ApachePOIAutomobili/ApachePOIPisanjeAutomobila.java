package ApachePOIAutomobili;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.ArrayList;

public class ApachePOIPisanjeAutomobila {
    public static void ispisiNizAutomobilaUExcell(ArrayList<Automobil>nizAutomobila) {

        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sh1 = wb.createSheet("Spisak automobila");
        Row redZaglavlje = sh1.createRow(0);

        Cell celijaZaglavljeMarka = redZaglavlje.createCell(0);
        Cell celijaZaglavljeZemljaPorekla = redZaglavlje.createCell(1);
        Cell celijaZaglavljeBoja = redZaglavlje.createCell(2);
        Cell celijaZaglavljeKilometraza = redZaglavlje.createCell(3);

        celijaZaglavljeMarka.setCellValue("Marka je: ");
        celijaZaglavljeZemljaPorekla.setCellValue("Zemlja porekla je: ");
        celijaZaglavljeBoja.setCellValue("Boja automobila je: ");
        celijaZaglavljeKilometraza.setCellValue("Kilometraza je: ");

        int sledeciRedKojiUpisuje = 1;
        for (Automobil a : nizAutomobila) {
            Row redZaAutomobil = sh1.createRow(sledeciRedKojiUpisuje);
            Cell celijaAutomobilMarka = redZaAutomobil.createCell(0);
            Cell celijaAutomobilZemljaPorekla = redZaAutomobil.createCell(1);
            Cell celijaAutomobilBoja = redZaAutomobil.createCell(2);
            Cell celijaAutomobilKilometraza = redZaAutomobil.createCell(3);

            celijaAutomobilMarka.setCellValue(a.getMarka());
            celijaAutomobilZemljaPorekla.setCellValue(a.getZemljaPorekla());
            celijaAutomobilBoja.setCellValue(a.getBoja());
            celijaAutomobilKilometraza.setCellValue(a.getKilometraza());

            sledeciRedKojiUpisuje++;
        }
        try {
            OutputStream fajl = new FileOutputStream("MojExcellFajl.xlsx");
            wb.write(fajl);
            wb.close();
        } catch (IOException e) {
            System.out.println("Desila se greska" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<Automobil>nizAutomobila = new ArrayList<>();

        Automobil a1 = new Automobil("Golf","Nemacka","crvena",23600);
        Automobil a2 = new Automobil("Renault","Francuska","bela",46300);
        Automobil a3 = new Automobil("Honda","Japan","siva",490);
        Automobil a4 = new Automobil("Fiat","Italija","plava",77300);

        nizAutomobila.add(a1);
        nizAutomobila.add(a2);
        nizAutomobila.add(a3);
        nizAutomobila.add(a4);

        ispisiNizAutomobilaUExcell(nizAutomobila);
    }



    }

