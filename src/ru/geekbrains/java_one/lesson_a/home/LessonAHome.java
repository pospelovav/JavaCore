package ru.geekbrains.java_one.lesson_a.home;

public class LessonAHome {

        private static float computation(int a, int b, int c, int d) {
       /* int e;
        e = a * (b + (c / d));
        System.out.print("a * (b + (c / d)) = " + e);*/
            return a * (b + (c / d));
        }

        public static void main(String[] args){
            System.out.println(computation(1, 2, 3, 4));

        }


}
