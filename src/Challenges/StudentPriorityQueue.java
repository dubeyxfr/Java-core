package Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new student("Prashant",'A'));
        queue.offer(new student("Dubey",'C'));
        queue.offer(new student("Ram",'B'));
        queue.offer(new student("Shyam",'A'));
        System.out.printf("Queue is %s" , queue);
    }


    private static class student {
        private final String name;
        private final char grade;

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
