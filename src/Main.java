public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    task3();
    }public static void task1(){
        var firstName = " Ivan ";
        var middleName = " Ivanovich";
        var lastName = " Ivanov ";
        var fullName = lastName + " " + firstName +" " + middleName;
        System.out.println(fullName);


    }public static void task2(){
        var firstName = " Ivan ";
        var middleName = " Ivanovich";
        var lastName = " Ivanov ";
        var fullName = lastName + " " + firstName +" " + middleName;
        System.out.println(fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }public static void task3(){
var fullName2 = "Иванов Семён Семёнович ";
var replaced = fullName2.replace ( "ё","e");
        System.out.println(replaced);








    }}