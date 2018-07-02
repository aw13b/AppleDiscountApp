/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applediscountapp;

/**
 *
 * @author weira
 */
public class mac extends Product{
    private String memory;
    private String processor;
    private String storage;
    
    public mac()
    {
        super();
        memory="";
        processor="";
        storage="";                
    }
    public void setMemory(String memory)
    {
        this.memory=memory;
    }
    public String getMemory()
    {
        return memory;
    }
    public void setProcessor(String processor)
    {
        this.processor=processor;
    }
    public String getProcessor()
    {
        return processor;
    }
    public void setStorage(String storage)
    {
        this.storage=storage;
    }
    public String getStorage()
    {
        return storage;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Memory:    " + memory + "\n" +
                                  "Processor: " + processor + "\n" +
                                  "Storage:   " + storage + "\n";
                
    }
}
