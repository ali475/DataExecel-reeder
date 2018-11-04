/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datamining;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ali Mohamed
 */
public class Main {
    public static void main(String[] args) {
        DataReader read = new DataReader();
        try {
            ArrayList<Element>elements =read.readXLSXFile();
            for (Element element : elements) {
                System.out.println(element.ID+"    "+element.Items);
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
