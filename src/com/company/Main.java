package com.company;

import java.io.IOException;

public class Main {/*public static void main(String[] args) {
    hereWillBeTrouble(42, 0);
}

private static void hereWillBeTrouble(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("ты опять делишь на ноль?");
    }
    int oops = a / b;
    System.out.println(oops);
}
*/
    /*Try with resources-те колдоно ала турган Car деген класс тузунуз
close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек
try unchecked exceptionдарды кармап аларды игнор кылыш керек
main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек

Эскертуу: маселени чыгарууда try with resources колдонуу керек*/

    public static void main(String[] args) throws IOException {
        // write your code here
try( Car car = new Car();) {

    car.drive();
}catch(Exception e ){
    e.getStackTrace();
}
    }
}