package SumaBrojeva;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBrojevi  {
    public ExcellReaderBrojevi excellReader;

    @BeforeMethod
    public void setUp() throws IOException {
        excellReader = new ExcellReaderBrojevi("C:\\Users\\LocalAdmin\\Desktop\\Brojevi.xlsx");
        excellReader.getIntegerData("Brojevi",0,0);
    }

    @Test
    public void Brojevi() {
        int sum = 0;
        for (int i = 0; i<=excellReader.getLastRow("Brojevi");i++){
            sum+=excellReader.getIntegerData("Brojevi",i,0);
        }
        System.out.println("Suma brojeva u 1.koloni tabele Brojevi je: " + sum);
    }
}
