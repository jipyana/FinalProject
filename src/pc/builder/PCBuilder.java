/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.builder;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


/**
 *
 * @author Jamila
 */
public class PCBuilder {
    
    public static final ArrayList<SpecificationsForVideoCards> videoCards = new ArrayList();
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception, FileNotFoundException{
        
            MainFrame start = new MainFrame();
            start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            start.setVisible(true);

            File geforceGTX460 = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 460");
            

            
            
            fileReader(geforceGTX460);
            
//        BuildYourPCWindow pcBuilder = new BuildYourPCWindow();
//        pcBuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pcBuilder.setVisible(true);
      
    }
    
    public static void fileReader(File geforceGTX460){
        
         for(File item : geforceGTX460.listFiles()){
            //System.out.println(item.getName());
            try (BufferedReader br = new BufferedReader(new FileReader(item))) {
                String line = null;

                SpecificationsForVideoCards videoCard = new SpecificationsForVideoCards();
                
                int lineNumber = 0;
                while ((line = br.readLine()) != null) {
                    lineNumber++;
                    if (lineNumber == 1) {
                        videoCard.setGpuName(line);
                    } else if (lineNumber == 3) {
                        videoCard.setWattageNecessary(line.trim().replaceAll("Wattage Necessary(TDP):", "").trim());
                    } else if (lineNumber == 4) {
                        videoCard.setChipset(line.trim().replaceAll("Chipset:", "").trim());
                    } else if(lineNumber == 5){
                        videoCard.setMemory(line.trim().replaceAll("Memory:", "").trim());
                    } else if(lineNumber == 6){
                        videoCard.setCoreClock(line.trim().replaceAll("Core Clock:", "").trim());
                    } else if(lineNumber == 7){
                        videoCard.setMulti_GPU(line.trim().replaceAll("Multi-GPU:", "").trim());
                    } else if(lineNumber == 8){
                        videoCard.setComp(line.trim().replaceAll("Compatilbility:", "").trim().split(", "));
                    } else if(lineNumber == 9){
                        videoCard.setPrice(Double.parseDouble(line.trim().replaceAll("Price:", "").replaceAll("\\$", "").trim()));
                    } else if(lineNumber == 10){
                        videoCard.setHdmiPort(line.trim().replaceAll("HDMI Ports:", "").trim() == "Yes" ? true : false);
                    } else if(lineNumber == 11){
                        videoCard.setDisplayPort(line.trim().replaceAll("Display Port:", "").trim() == "Yes" ? true : false);
                    }
                    videoCards.add(videoCard);
                }
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(PCBuilder.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(PCBuilder.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
       
        
       
    }
    
}
