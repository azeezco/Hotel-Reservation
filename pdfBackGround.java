/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class pdfBackGround {
    String name;
    String num;
    String Address;
    Date Checkin;
    Date Checkout;
    String Adults;
    String Children;
    String roomType;
    double Rate;
    double days;
    File file;
    public final String IMAGE="C:\\Users\\user\\Documents\\NetBeansProjects\\Hotel-Reservation\\src\\booking\\pdf-background.jpg";
    
    public pdfBackGround(String name3,String num3,String address3,Date check_in,Date check_out,String adults3,String children3,double rate,double days1,String room,File file1){
    name=name3;
    num=num3;
    Address=address3;
    Checkin=check_in;
    Checkout=check_out;
    Adults=adults3;
    Children=children3;
    Rate=rate;
    days=days1;
    roomType=room;
    file=file1;
    }
     public void createpdf(String NAME) throws IOException,DocumentException{
         
      try {
            
            // File file=new File(name);
              // file.getParentFile().mkdirs();
            Document doc=new Document(PageSize.A4.rotate());
       
            
            PdfWriter writer=PdfWriter.getInstance(doc, new FileOutputStream(file+".pdf"));
            doc.open();
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph(""));
            doc.add(new Paragraph("Dear "+name+", below is the summary of your reservation,"));
            doc.add(new Paragraph("***************************************************"));
            doc.add(new Paragraph("Phone no: "+num));
            doc.add(new Paragraph("Address: "+Address));
            SimpleDateFormat ddff=new SimpleDateFormat("EEEE, MMMM d, yyyy");
            doc.add(new Paragraph("Expected Check IN: "+ddff.format(Checkin)));
            doc.add(new Paragraph("Expected Check OUT: "+ddff.format(Checkout)));
            doc.add(new Paragraph("Adults: "+Adults));
            doc.add(new Paragraph("Child(ren): "+Children));
            doc.add(new Paragraph("Room-Type: "+roomType));
            doc.add(new Paragraph("No of Nights: "+days));
            doc.add(new Paragraph("Rate per Nights: =N="+Rate));
            doc.add(new Paragraph("Bill: =N="+(Rate*days)));
            PdfContentByte canvas=writer.getDirectContentUnder();
            Image image=Image.getInstance(IMAGE);
            image.scaleAbsolute(PageSize.A4.rotate());
            image.setAbsolutePosition(0, 0);
            canvas.saveState();
            PdfGState state=new PdfGState();
            state.setFillOpacity(0.8f);
            canvas.setGState(state);
            canvas.addImage(image);
            canvas.restoreState();
            doc.close();
        } catch (DocumentException ex) {
            Logger.getLogger(summary.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
