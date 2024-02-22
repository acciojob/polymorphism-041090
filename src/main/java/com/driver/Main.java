package com.driver;

public class Main {
    public static void main(String[]args){
        product p = new product();
        int ans =p.product(10 ,20);
        int ans1=p.product(x:1,y:2,z:3);
        double ans2=p.product(x:1.0,y:2.0);
        System.out.print(ans+" "+ans1+" "+ans2);
    }
    public static class product{
        public int product(int x, int y)
            return x*y;
        public int product(int x, int y, int z) {
            return x*y*z;

            public double product(double x, double y) {
                return x * y;
            }
        }
    }


}