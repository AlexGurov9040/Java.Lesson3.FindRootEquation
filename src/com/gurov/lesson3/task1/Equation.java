package com.gurov.lesson3.task1;

public class Equation {

    public static void main(String[] args){

        Equation app = new Equation();
        app.Search();
    }

    public static void Search(){

        System.out.printf("The root of the equation is: %.3f",RootEquation(0.0,10.0));
    }

    public static double RootEquation(double left,double right){

        if (Math.abs(Function(left) - Function(right)) <= 0.001)
            return left;
        double middle = left + (right - left)/2;
        if (Sign(Function(left)) != Sign(Function(right)))
            if (Sign(Function(left)) != Sign(Function(middle)))
                return RootEquation(left, middle);
            else
                return RootEquation(middle, right);
        else
            return -1.0;
    }

    public static boolean Sign(double number){

        return number>0 ? true : false;
    }

    public static double Function(double x){

        return Math.cos(Math.pow(x,5))+Math.pow(x,4)-345.3*x-23;
    }
}
