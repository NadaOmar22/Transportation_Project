package com.company;

import java.sql.Driver;
import java.util.ArrayList;

interface IArea {
public  ArrayList<Offer> notifyDriver ( Ride ride);
public void addDriver (com.company.Driver driver);
public void removeDriver ( com.company.Driver driver);
