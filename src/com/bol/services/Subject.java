/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bol.services;

/**
 *
 * @author USER
 */
public interface Subject {
    public void subscribeChannel(CommonChannel channel, Observer observer);
    public void unSubscribeChannel(CommonChannel channel, Observer observer);
    public void notifySubcribers(CommonChannel channel, String message);
    
}
