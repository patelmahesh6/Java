/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.design;

/**
 *
 * @author Administrator
 */
public class Internet implements Observer {

    @Override
    public void update(float interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is: "+ interest);
    }
}
