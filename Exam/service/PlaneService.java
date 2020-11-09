package com.service;

import com.model.Plane;

public class PlaneService
{
    public  void print(Plane alfa)//Task 1
    {
        System.out.println(alfa.getCost());
        System.out.println(alfa.getCountry());
        System.out.println(alfa.getEngineType());
        System.out.println(alfa.getHours());
        System.out.println(alfa.getModel());
        System.out.println(alfa.getNumOfSeats());
        System.out.println(alfa.getTopSpeed());
        System.out.println(alfa.getWeight());
        System.out.println(alfa.getWingspan());
        System.out.println(alfa.getYear());
        System.out.println(alfa.isMilitary());

    }

    public  void check(Plane alfa)//Task 2
    {
        if(alfa.isMilitary())
        {
            System.out.println(alfa.getCost() + " "+alfa.getTopSpeed());
        }
        else
        {
            System.out.println(alfa.getModel()+" "+alfa.getCountry());
        }

    }

    public  Plane isNewer(Plane alfa, Plane beta)//task 3
    {
        if(alfa.getYear()>=beta.getYear())
            return alfa;
        else
            return beta;

    }

    public  Plane biggerWingspan(Plane alfa, Plane beta)//task 4
    {
            if(alfa.getWingspan()>beta.getWingspan())
            return alfa;
        else
            return beta;
    }

    public  Plane highestCost(Plane alfa, Plane beta,Plane gamma)//task 5
    {
        Plane res=alfa;
        if(beta.getCost()>res.getCost())
            res=beta;
        if(gamma.getCost()>res.getCost())
            res=gamma;
        return res;
    }

    public  void smallestCount(Plane alfa, Plane beta, Plane gamma)//task 6
    {
        Plane res=alfa;
        if(beta.getNumOfSeats()<res.getNumOfSeats())
            res=beta;
        if(gamma.getNumOfSeats()<res.getNumOfSeats())
            res=gamma;
        System.out.println(res.getCountry());
    }
    public void notMilitary(Plane[] data)//task 7
    {
        for(int i=0; i<data.length; ++i)
        {
            if(!(data[i].isMilitary()))
            {
                print(data[i]);
            }
        }
    }

    public void moreThan100(Plane[] data)//task 8
    {
        for(int i=0; i<data.length; ++i)
        {
            if(data[i].isMilitary()&&data[i].getHours()>100)
            {

                print(data[i]);
            }
        }
    }
    public Plane minimalWeight(Plane[] data)//task 9
    {
        Plane res=data[0];
        for(int i=0; i<data.length; ++i)
        {
            if(data[i].getWeight()<=res.getWeight())
            {
                res=data[i];
            }
        }
        return res;
    }

    public Plane minimalCost(Plane[] data)//task 10
    {
        //precondition there exists at least one military plane
        Plane guess=null;
        for(int i=0; i<data.length; ++i)//first find the guess
        {
            if(data[i].isMilitary())
            {
                guess=data[i];
                break;
            }
        }
        for(int i=0; i<data.length; ++i)
        {
            if(data[i].isMilitary()&&data[i].getCost()<guess.getCost())
            {
                guess=data[i];
            }
        }
        return guess;
    }

    public void order(Plane[] data)//task 11
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data.length - 1; j++)
            {
                if (data[j].getYear() > data[j + 1].getYear())
                {
                    Plane swap = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = swap;
                }
            }
        }
        for(int i=0; i<data.length; ++i)
        {
            print(data[i]);
        }
    }

    public void orderMilitary(Plane[] data)
    {
        int n=0;
        for(int i=0; i<data.length; ++i)//counting number of non military planes
        {
            if(!data[i].isMilitary())
                ++n;
        }
        Plane[] temp=new Plane[n];
        int j=0;
        for(int i=0; i<data.length; ++i)
        {
            if(!data[i].isMilitary())
            {
                temp[j]=data[i];
                ++j;
            }
        }
        for (int i = 0; i < temp.length; i++)
        {
            for ( j = 0; j < temp.length - 1; j++)
            {
                if (temp[j].getNumOfSeats() < temp[j + 1].getNumOfSeats())
                {
                    Plane swap = temp[j + 1];
                    temp[j + 1] = temp[j];
                    temp[j] = swap;
                }
            }
        }
        for(int i=0; i<temp.length; ++i)
            print(temp[i]);
    }
}
