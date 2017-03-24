/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

/**
 *
 * @author 1mohamedyou
 */
public class Triangle {

    // 
    public static final int NUMBER_OF_SIDES = 3;
    
    // INSTANCE VARIABLES
    private double side1;
    private double side2;
    private double side3;
    private String type;

    public Triangle() {
    }
    
    public Triangle( String type ) {
        this.type = type;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = "UNKNOWN";
        
        this.orderSides();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if( side1 <= 0 ) {
            
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    private void orderSides() {
        
    }
    
    public boolean isTriangle( ) {
        boolean valid = true;
        if( this.side1 <= 0 || this.side2 <= 0 || this.side3 <= 0 ) {
            valid = false;
        }
        else if( this.side1 + this.side2 <= this.side3 ) {
            valid = false;
        }
        return valid;
        
    }
    
    public boolean isRightTriangle( ) {

        return true;
    }
    
    
    
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle( "Scalene" );
        Triangle t2 = new Triangle( 1, 2, 5 );
        
        
        System.out.println( t2.isTriangle() );

    }


public static int number(int n){
    if(n == 0) return 0;
    return n + number(n - 1);
}}