package com.main;

import com.model.Plane;
import com.service.PlaneService;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        PlaneService help=new PlaneService();
        Scanner sc=new Scanner(System.in);
        Plane mig=new Plane();
        System.out.println("Give the data int, 5 double, int, string ");
        mig.setMilitary(true);
        mig.setYear(sc.nextInt());
        mig.setHours(sc.nextDouble());
        mig.setCost(sc.nextDouble());
        mig.setWeight(sc.nextDouble());
        mig.setWingspan(sc.nextDouble());
        mig.setTopSpeed(sc.nextDouble());
        mig.setNumOfSeats(sc.nextInt());
        mig.setModel(sc.next());
        Plane boeing=new Plane();
        boeing.setNumOfSeats(45);
        Plane ij=new Plane();
        ij.setMilitary(true);
        ij.setHours(478);
        ij.setNumOfSeats(10);
        Plane[] arr={mig, boeing, ij};

        help.print(mig);
        help.check(ij);
        help.isNewer(ij, mig);
        help.biggerWingspan(boeing, ij);
        help.highestCost(ij, boeing, mig);
        help.smallestCount(ij, boeing, mig);
        help.notMilitary(arr);
        help.moreThan100(arr);
        help.minimalWeight(arr);
        help.minimalCost(arr);
        help.order(arr);
        help.orderMilitary(arr);
        System.out.println();
    }
}

