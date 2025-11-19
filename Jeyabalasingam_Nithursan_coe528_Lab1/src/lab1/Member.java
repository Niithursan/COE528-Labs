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
public class Member extends Passenger {

    private int yearsOfMembership;

    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    @Override
    public double applyDiscount(double p) {
        if (this.yearsOfMembership > 5) {
            return p * 0.5;
        } else if (this.yearsOfMembership > 1 && this.yearsOfMembership <= 5) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
