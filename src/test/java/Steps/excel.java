package Steps;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class excel {
    public static void main(String[] args) throws IOException {
        String finaldata [][] = new String[3][2];
        ArrayList<String> logindata = new ArrayList<>();
        FileInputStream file = new FileInputStream("C:\\Users\\Louis Ebi\\IdeaProjects\\julytestng\\src\\test\\java\\logindata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
       int rows = sheet.getLastRowNum();
        System.out.println("---------------- "+rows+" -----------------");
       int coloumn = sheet.getRow(0).getLastCellNum();
        System.out.println("------- "+coloumn+" -------");

       for (int i=1;i<=rows;i++){
           XSSFRow currentrow = sheet.getRow(i);
                for (int j=0;j<coloumn;j++){
//                    data [i] [j] = currentrow.getCell(j).toString();
                      String data = currentrow.getCell(j).toString();
                      logindata.add(data);
                }
       }

       for (int i=0;i<logindata.size();i++){
           System.out.println(logindata.get(i));
       }

       for (int i=1;i<=logindata.size();i++){

       }
//       Object [] dataarrey = logindata.toArray();
//
//        System.out.println(dataarrey);



    }
}
