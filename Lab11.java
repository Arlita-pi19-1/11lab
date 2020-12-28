import java.util.Arrays;
import java.util.Scanner;

class Triangle {
    int a, b,c;
    int Exist = 1;
    Triangle(int a, int b, int c){
        if (a+b>c & a+c>b & b+c>a){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else {
            Exist = 0;
            System.out.println(" Такого треугольника не существует");

        }
    }
    int perimeter(){
        return a+b+c;
    }
    double area(){
        double p = ((double) a + (double) b + (double) c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}



class Rectangle {
    int a,b;
    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public String getLength() {
        return a+" " + b;
    }

    int perimeter(){
        return 2*a+2*b;
    }
    int area(){
        return a*b;
    }
}



class WorkArrays {
    int[] arr;
    int n;
    WorkArrays(int n){
        this.n=n;
        arr = new int[n];
    }
    void inputAr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            this.arr[i]= sc.nextInt();
        }
    }
    void outputAr(){
        for (int value : arr) {
            System.out.println(value);
        }
    }
    void sortAr1(){
        Arrays.sort(arr);
    }
    void sortAr2(){
        Arrays.sort(arr);
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int rab = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = rab;
                }
            }
        }
    }
}




public class Lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle qwerty = new Triangle(a, b, c);
        if (qwerty.Exist == 1) {
            System.out.println("Периметр: " + qwerty.perimeter() + "\n Площадь: " + qwerty.area());
        }
        System.out.println("Введите стороны прямоугольника");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        Rectangle meow = new Rectangle(sideA, sideB);
        System.out.println("Длина сторон равна: " + meow.getLength() + "\n Периметр: " + meow.perimeter() + "\n Площадь: " + meow.area());

        WorkArrays work = new WorkArrays(5);
        System.out.println("Ввод массива ");
        work.inputAr();
        work.sortAr2();
        work.outputAr();

    }
}

