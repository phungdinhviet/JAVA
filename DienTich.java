/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientich;

import java.util.Scanner;
public class DienTich {

    static double dienTichHV(double a)
    {
        double Sv=a*a;
        return(Sv);
            
    }
    public static double dienTichHCN(double a, double b)
    {
        double Scn=a*b;
        return(a*b);
    }
    
    public static double dienTichTG(double a,double b, double c)
    {
        float p=(float)(a+b+c)/2;
        float sd;
        sd=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return sd;
    }
    public static double Nhap(String str)
    {
    double x;
    Scanner sc=new Scanner(System.in);
    System.out.println(str);
    x=sc.nextDouble();
    return x;
    }
public static void main(String[] args) {
        double a,b,c;
        double Stg,Sv,p;
        double Scn;
    a=Nhap("Nhập cạnh a : ");
        b=Nhap("Nhập cạnh b : ");
    c=Nhap("Nhập cạnh c : ");
    Stg=dienTichTG(a,b,c);
        System.out.println("Dien tích tam giác là :"+Stg);
        Sv=dienTichHV(a);
        System.out.println("Diện tích hình vuông là : "+Sv);
        Stg=dienTichTG(a,b,c);
        System.out.println("Diện tích hình chữ nhật là : "+a*b);
        Scn=dienTichHCN(a,b);
    }
}