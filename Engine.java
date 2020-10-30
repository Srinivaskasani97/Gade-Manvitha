interface Vehicles
{
void cost();
void mileage();
}

abstract class Car implements Vehicles
{
Car()
{
System.out.println("The details of the car");
}

void vipers()
{
System.out.println("Number of Vipers are 4");
}
}

abstract class Bike implements Vehicles
{
Bike()
{
System.out.println("The bike has a stand");
}

void stand()
{
System.out.println(" Stand gives support to the bike");
}
}

class Audi extends Car
{
public void cost()
{
System.out.println("cost is 12lakhs");
}
public void mileage()
{
System.out.println("Mileage is 16km");
}
}

class Pulsur extends Bike
{
public void cost()
{
System.out.println("Cost of a bike is 50000");
}
public void mileage()
{
System.out.println("Mileage of bike is 3okm");
}
}

public class Engine
{
public static void main(String args[])
{

Car neon=new Audi();
neon.cost();
neon.mileage();
neon.vipers();


Bike h=new Pulsur();
h.stand();
h.cost();
h.mileage();


}
}