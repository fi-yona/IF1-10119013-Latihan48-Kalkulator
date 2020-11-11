/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan48.kalkulator;

/**
 *
 * @author Fiona Avila
 */


public class OOKalkulator {
    
    private double value1 = 7.0;
    private double value2 = 5.0;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1 = value1;
    }
    
    public double getValue2(){
        return value2;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        System.out.println(note);
    }
    
    public double add(double val1, double val2){
        return val1 + val2;
    }
    
    public double minus(double val1, double val2){
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2){
        return val1 * val2;
    }
    
    public double division(double val1, double val2){
        return val1/val2;
    }
    
    public static void main(String[] args) {
        OOKalkulator oo = new OOKalkulator();
        double value1 = oo.getValue1();
        double value2 = oo.getValue2();
        double add = oo.add(value1,value2);
        double minus = oo.minus(value1,value2);
        double multiplication = oo.multiplication(value1,value2);
        double division = oo.division(value1,value2);
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        System.out.println();
        oo.setNameProject();
        oo.setNoteProject("This project shown you how to manage method in java.");
        System.out.println("Return add is = " + add);
        System.out.println("Result minus is = " + minus);
        System.out.println("Result multiplication is = " + multiplication);
        System.out.println("Result division is = " + division);
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
