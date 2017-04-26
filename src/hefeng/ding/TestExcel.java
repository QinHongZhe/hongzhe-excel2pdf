package hefeng.ding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestExcel {

public static void main(String[] args) throws Exception {
//      FileInputStream fis = new FileInputStream(new File(directory+"副本Common-ReportList-AssistPDF-Temp.xls"));
//      FileInputStream fis = new FileInputStream(new File("D:\\tmp.xls"));
        
        FileInputStream fis1 = new FileInputStream(new File("D:\\pdfexport\\MAD\\ccc.xlsx"));
        //FileInputStream fis2 = new FileInputStream(new File("D:\\pdfexport\\MAD 6-1-47-Octavia NF-20131025.xls"));
        //FileInputStream fis3 = new FileInputStream(new File("D:\\pdfexport\\MAD 038-Superb FL DS-20131025.xls"));
        //
        FileOutputStream fos = new FileOutputStream(new File("D:\\test.pdf"));
        //
        List<ExcelObject> objects = new ArrayList<ExcelObject>();
        objects.add(new ExcelObject("ccc.xlsx",fis1));
        //objects.add(new ExcelObject("2.MAD 6-1-47-Octavia NF-20131025.xls",fis2));
        //objects.add(new ExcelObject("3.MAD 038-Superb FL DS-20131025.xls",fis3));
//        
        Excel2Pdf pdf = new Excel2Pdf(objects , fos);
        pdf.convert();
        System.out.println("*****************************************");
}
}
