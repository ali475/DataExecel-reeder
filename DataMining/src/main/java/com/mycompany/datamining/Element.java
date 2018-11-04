/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datamining;

import java.util.ArrayList;

/**
 *
 * @author Ali Mohamed
 */
public class Element {
    int ID;
    ArrayList<String>Items;

    public Element(int ID, ArrayList<String> Items) {
        this.ID = ID;
        this.Items = Items;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<String> getItems() {
        return Items;
    }

    public void setItems(ArrayList<String> Items) {
        this.Items = Items;
    }
    
    
}
