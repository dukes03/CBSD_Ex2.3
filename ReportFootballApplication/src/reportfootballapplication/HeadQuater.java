/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportfootballapplication;

import java.util.ArrayList;

/**
 *
 * @author Duke
 */
public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String somedata;
    
    public HeadQuater(){
        this.list = new  ArrayList<MyObserver>();
    }
    
    public void setSomeData(String aData){
        somedata = aData;
        notifyObservers();
    }
    public String getSomeData(){
        return somedata;
        
    }
    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }
    
    @Override
    public void notifyObservers(){
        for (int i =0; i< list.size(); ++i){
            list.get(i).update(this);
        
        }
    }

  

}