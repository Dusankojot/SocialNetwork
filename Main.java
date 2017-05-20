/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> osobe = DB.namedQuery("Person.findAll");
        for(Person p:osobe) {
            System.out.println(p);
        }
    }
    
}
