/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brestcancerprediction;

import java.io.File;
import jxl.*;
import java.util.ArrayList;

/**
 *
 * @author ANKIT LOKHANDE
 */

public class ReadDataSet {
    
    ArrayList readData()
    {
        ArrayList alldata=new  ArrayList();
        
        try{
            Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\ANKIT LOKHANDE\\Desktop\\breast_cancer.xls"));
            Sheet s=wb.getSheet(0);
            
            int row=s.getRows();
            int column=s.getColumns();
            
            for(int i=1; i<row; i++)
            {
                ArrayList temp = new ArrayList();
                for(int j=0; j<column; j++)
                {
                    Cell c = s.getCell(j, i);
                    temp.add(c.getContents());
                   // System.out.println(c.getContents());
                }
                alldata.add(temp);
            }
            
          }
        catch(Exception e)
        {
            System.out.println("Issue :"+e);
        }
        
        return alldata;
    }
    
}
