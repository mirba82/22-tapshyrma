package com.company;



public class Main {

    /*Try with resources-те колдоно ала турган Car деген класс тузунуз
close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек
try unchecked exception дарды кармап аларды игнор кылыш керек
main методдо try блоктун ичинде drive() деген методду чакырыныз,
ал консольго "Машина журуп жатат" деп чыгаруусу керек

Эскертуу: маселени чыгарууда try with resources колдонуу керек*/

    public static void main(String[] args)  {
        // write your code here
try( Car car = new Car()) {

    car.drive();
}catch(Exception e ){
    e.getStackTrace();
}
    }
}