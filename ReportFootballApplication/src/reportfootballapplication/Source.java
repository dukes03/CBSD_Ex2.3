/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportfootballapplication;

/**
 *
 * @author Duke
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observers);
}
