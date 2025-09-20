package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Студентенко", 1);
        Student student2 = new Student("", 2);
        Student student3 = new Student("Студентенковський", 5);

        student1.addCourse("Математика");
        student1.addCourse("Основи здоров'я");
        student1.addCourse("Хімія");
        student1.addCourse("Фізика");


        student2.addCourse("Математика");
        student2.addCourse("Англійська");
        student2.addCourse("Українська");

        student3.addCourse("Фіз-ра");
        student3.addCourse("Мистецтво");


        System.out.println("<" + student1.getName() + ">: кількість вивчаємих дисциплин - " + student1.getCourseCount());
        System.out.println("<" + student2.getName() + ">: кількість вивчаємих дисциплин - " + student2.getCourseCount());
        System.out.println("<" + student3.getName() + ">: кількість вивчаємих дисциплин - " + student3.getCourseCount());
        System.out.println();

        System.out.println("<" + student1.getName() + ">: рік навчання - " + student1.getYear());
        System.out.println("<" + student2.getName() + ">: рік навчання - " + student2.getYear());
        System.out.println("<" + student3.getName() + ">: рік навчання - " + student3.getYear());

        System.out.println();

        System.out.println("<" + student1.getName() + ">: заплатив за навчання - " + student1.getTuition());
        System.out.println("<" + student2.getName() + ">: заплатив за навчання - " + student2.getTuition());
        System.out.println("<" + student3.getName() + ">: заплатив за навчання - " + student3.getTuition());

    }
}