package ru.geekbrains.java_one.lesson_a.home;

public class LessonAHome {

        private static float computation(int a, int b, int c, int d) {
       /* float e;
        e = a * (b + (c / d));
        System.out.print("a * (b + (c / d)) = " + e);*/
            return a * (b + (c / d));
        }

        private static boolean TorF (int a, int b){
            if (((a + b) >= 10)||((a + b) <= 20)){
                return true;
            } else {return false;}
        }

        private static void PlusOrNot(int a){
            if (a >= 0){
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        private static void Hello(String s){
            System.out.println("Привет, " + s + '!');
        }

        private static void bissextile(int a){
            if (a%4 != 0) {
                System.out.println("Год обычный");
            } else if ((a%100 == 0) && (a%400 != 0)){
                System.out.println("Год обычный");
            } else {
                System.out.println("Год високосный");
            }
        }

        
        public static void main(String[] args){
            System.out.println(computation(1, 2, 3, 4));  //вывод в консоль для проверки
            System.out.println(TorF(10, 2));
            PlusOrNot(-2);
            Hello("Имяреков");
            bissextile(2019);

        }


}
