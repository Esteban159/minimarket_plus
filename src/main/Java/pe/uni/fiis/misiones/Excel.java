package pe.uni.fiis.misiones;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 31/05/2015.
 */
public class Excel {
    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        System.out.println("bjbjb");
        Vuelo []registros=new Vuelo[4];
            registros[0]=new Vuelo("Peru","EE.UU","01:00 am","10:00 am","Taca","AA 4432");
            registros[1]=new Vuelo("EE.UU","Peru","05:00 am","03:00 pm","Peruvian Airlines","AE 62632");
            registros[2]=new Vuelo("Peru","Colombia","09:00 am","12:00 am","Aero peru","US 3713");
            registros[3]=new Vuelo("Brasil","Peru","11:00 am","05:00 pm","Line 101","OM 12812");

        try {
            FileOutputStream fileOut = new FileOutputStream("miexcel.xls");
            Sheet hoja1 = wb.createSheet();
            Row fila = hoja1.createRow(0);
            Cell cell = fila.createCell(0);
            cell.setCellValue("VUELO");
            cell = fila.createCell(1);
            cell.setCellValue("AEROLINEA");
            cell = fila.createCell(2);
            cell.setCellValue("ORIGEN");
            cell = fila.createCell(3);
            cell.setCellValue("HORA PARTIDA");
            cell = fila.createCell(4);
            cell.setCellValue("DESTINO");
            cell = fila.createCell(5);
            cell.setCellValue("HORA LLEGADA");

            for(int i=0;i<4;i++){
                fila = hoja1.createRow(i+1);
                cell = fila.createCell(0);
                cell.setCellValue(registros[i].getId_vuelo());
                cell = fila.createCell(1);
                cell.setCellValue(registros[i].getAerolinea());
                cell = fila.createCell(2);
                cell.setCellValue(registros[i].getOrigen());
                cell = fila.createCell(3);
                cell.setCellValue(registros[i].getHora_partida());
                cell = fila.createCell(4);
                cell.setCellValue(registros[i].getDestino());
                cell = fila.createCell(5);
                cell.setCellValue(registros[i].getHora_llegada());
            }
            for(int i=0;i<6;i++){
                hoja1.autoSizeColumn(i);
            }
            wb.write(fileOut);

            fileOut.close();
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
