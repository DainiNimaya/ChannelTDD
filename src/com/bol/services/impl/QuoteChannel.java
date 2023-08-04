/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bol.services.impl;

import com.bol.services.CommonChannel;
/**
 *
 * @author USER
 */
public class QuoteChannel implements CommonChannel{
    

    private static QuoteChannel channel;
    public String name = "";
   
    private QuoteChannel(){
        
    }
    
    public static QuoteChannel getInstance(){
        if (channel == null) {
            channel = new QuoteChannel();
        }
        return channel;
    }
    
    @Override
    public String getChannelName(){
        return name;
    }

    @Override
    public void startChannel(String name) {
       
    }
    
}
