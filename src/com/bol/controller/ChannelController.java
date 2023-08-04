/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bol.controller;

import com.bol.services.CommonChannel;
import com.bol.services.Observer;
import com.bol.services.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author USER
 */
public class ChannelController implements Subject {
    
    private static HashMap<CommonChannel, List<Observer>> channelList = new HashMap<>();

    @Override
    public void subscribeChannel(CommonChannel channel, Observer observer) {
        
    }

    @Override
    public void unSubscribeChannel(CommonChannel channel,Observer observer) {
        
    }

    @Override
    public void notifySubcribers(CommonChannel channel, String message) {
        
    }
    
    
    private void addChannel(CommonChannel channel){
       
    }
    
    private List<Observer> getChannelSubscribers(CommonChannel commonChannel){
        return null;
    }
    
    public HashMap<CommonChannel, List<Observer>> getChannelDetail(){
        return channelList;
    }
}
