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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


/**
 *
 * @author Jamila
 */


/*
 * Add the path to the parameters instead of having different methods for each individual card
 */
public class PCBuilder {
    
    public static final ArrayList<SpecificationsForVideoCards> videoCards = new ArrayList();
    public static final ArrayList<SpecificationsForOS> OS = new ArrayList();
    private static File geforceGTX460 = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 460");
    private static File geforceGTX1050TI = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1050Ti");
    private static File geforceGTX1060 = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1060");
    private static File geforceGTX1060_3GB = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1060 3GB");
    private static File geforceGTX1060_6GB = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1060 6GB");
    private static File geforceGTX1070 = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1070");
    private static File geforceGTX1080 = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX 1080");
    private static File geforceGTXTitanZ = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX Titan Z");
    private static File geforceGTXTitanX =  new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Video Cards\\GeForce GTX Titan X");
    
    private static File windows7Home_32_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 7 Home Premium (32/64-bit");
    private static File windows7Home_32Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 7 Home Premium SP1 (32-bit)");
    private static File windows7Home_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 7 Home Premium SP1 (64-bit)");
    private static File windows8_32Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 8 (32-bit)");
    private static File windows8_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 8 (64-bit)");
    private static File windows8_1_32_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 8.1 (32-64-bit)");
    private static File windows8_1_32Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 8.1 (32-bit)");
    private static File windows8_1_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 8.1 (64-bit)");
    private static File windows10Home_32_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 10 Home (32-64-bit)");
    private static File windows10Home_32Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 10 Home (32-bit)");
    private static File windows10Home_64Bit = new File("C:\\Users\\Jamila\\Documents\\NetBeansProjects\\PC Builder\\FinalProject\\src\\PCComponents\\Operating Systems\\Microsoft Windows 10 Home (64-bit)");
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception, FileNotFoundException{
        
            MainFrame start = new MainFrame();
            start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            start.setVisible(true);

            
            fileReaderGTX460(geforceGTX460);
            fileReaderGTX1050TI(geforceGTX1050TI);
            fileReaderGTX1060(geforceGTX1060);
            fileReaderGTX1060_3GB(geforceGTX1060_3GB);
            fileReaderGTX1060_6GB(geforceGTX1060_6GB);
            fileReaderGTX1070(geforceGTX1070);
            fileReaderGTX1080(geforceGTX1080);
            fileReaderGTXTitanZ(geforceGTXTitanZ);
            fileReaderGTXTitanX(geforceGTXTitanX);
            
            
            fileReaderoSperatingSystem(windows7Home_32_64Bit);
            fileReaderoSperatingSystem(windows7Home_32Bit);
            fileReaderoSperatingSystem(windows7Home_64Bit);
            fileReaderoSperatingSystem(windows8_32Bit);
            fileReaderoSperatingSystem(windows8_64Bit);
            fileReaderoSperatingSystem(windows8_1_32_64Bit);
            fileReaderoSperatingSystem(windows8_1_32Bit);
            fileReaderoSperatingSystem(windows8_1_64Bit);
            fileReaderoSperatingSystem(windows10Home_32_64Bit);
            fileReaderoSperatingSystem(windows10Home_32Bit);
            fileReaderoSperatingSystem(windows10Home_64Bit);
            
    }
    
    public static void fileReaderGTX460(File geforceGTX460){
        
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
    public static void fileReaderGTX1050TI(File geforceGTX1050TI){
    	
    	 for(File item : geforceGTX1050TI.listFiles()){
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
    public static void fileReaderGTX1060(File geforceGTX1060){
        
        for(File item : geforceGTX1060.listFiles()){
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
    public static void fileReaderGTX1060_3GB(File geforceGTX1060_3GB){
        
        for(File item : geforceGTX1060_3GB.listFiles()){
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
    public static void fileReaderGTX1060_6GB(File geforceGTX1060_6GB){
        
        for(File item : geforceGTX1060_6GB.listFiles()){
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
    public static void fileReaderGTX1070(File geforceGTX1070){
        
        for(File item : geforceGTX1070.listFiles()){
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
    public static void fileReaderGTX1080(File geforceGTX1080){
        
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
    public static void fileReaderGTXTitanZ(File geforceGTXTitanZ){
        
        for(File item : geforceGTXTitanZ.listFiles()){
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
    public static void fileReaderGTXTitanX(File geforceGTXTitanX){
        
        for(File item : geforceGTXTitanX.listFiles()){
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
    
//    question about this: Ask Marquis
    public static void fileReaderoSperatingSystem(File oSperatingSystem){
    	
    	for(File item : oSperatingSystem.listFiles()){
    		
    		try(BufferedReader br = new BufferedReader(new FileReader(item))){
    			String line = null;

    			SpecificationsForOS oS = new SpecificationsForOS();
    			int lineNumber = 0;
                while ((line = br.readLine()) != null) {
                    lineNumber++;
                    if(lineNumber == 1){
                    	oS.setoSName(line.trim());
                    } else if(lineNumber == 3){
                    	oS.setPrice((Double.parseDouble(line.trim().replaceAll("Price:", "").replaceAll("\\$", "").trim())));
                    }
                    OS.add(oS);
                }
    		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    }
}
