/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportfootballapplication;

import java.util.Scanner;

/**
 *
 * @author Duke
 */
public class ReportFootballApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeadQuater Head = new HeadQuater();
        livereport live1 = new livereport();
        livereport live2 = new livereport();
        Head.register(live2);
        Head.register(live1);
        System.out.print("Enter Score ");
        Scanner inp = new Scanner(System.in);
        
        String type = inp.nextLine();
        while (!type.isEmpty()){
        Head.setSomeData(type);
        System.out.print("Enter Score ");
        inp = new Scanner(System.in);
        type = inp.nextLine();
        }
        
    }
    
}
