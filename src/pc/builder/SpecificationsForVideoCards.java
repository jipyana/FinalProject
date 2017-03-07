/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.builder;

/**
 *
 * @author Jamila
 */
public class SpecificationsForVideoCards {
    
    private String gpuName;
    private String wattageNecessary;
    private String chipset;
    private String memory;
    private String coreClock;
    private String multi_GPU;
    private String [] comp;
    private double price;
    private boolean hdmiPort;
    private boolean displayPort;
	
    
    
    public SpecificationsForVideoCards(){
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public String getWattageNecessary() {
        return wattageNecessary;
    }

    public void setWattageNecessary(String wattageNecessary) {
        this.wattageNecessary = wattageNecessary;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public String getMulti_GPU() {
        return multi_GPU;
    }

    public void setMulti_GPU(String multi_GPU) {
        this.multi_GPU = multi_GPU;
    }

    public String[] getComp() {
        return comp;
    }

    public void setComp(String[] comp) {
        this.comp = comp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHdmiPort() {
        return hdmiPort;
    }

    public void setHdmiPort(boolean hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public boolean isDisplayPort() {
        return displayPort;
    }

    public void setDisplayPort(boolean displayPort) {
        this.displayPort = displayPort;
    }

   
    
}
