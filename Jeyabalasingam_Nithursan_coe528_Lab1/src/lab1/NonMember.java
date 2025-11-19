/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author nithy
 */
public class NonMember extends Passenger {

    int age;

   //Constructor
    public NonMember(String name, int age)
    {
	super(name, age);
        this.age = age;
    }
    
    //Apply discount to non-member
    @Override
    public double applyDiscount(double p)
    {
	if(age > 65) //Check if non-member is older than 65
	    return p * 0.9; //Apply 10% discount
	else
	    return p; //No discount if non-member is younger than or equal to 65
    }
}
