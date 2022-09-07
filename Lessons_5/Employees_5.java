package Lessons_5;

public class Employee {
    private static int id;
    private static String full_name;
    private static String position;
    private static String email;
    private static String phone;
    private static int salary;
    private static int age;

    public void Employees_5(String id, String full_name, String position, String email, String phone, String salary, int age) {
        Employee user1 = new Employee("1", "Селезнева Дарья Алексеевна", "Тестировщик",
                "tubesteak@icloud.com", "7 332 713-37-44", 25000, 25);
        Employee user2 = new Employee("2", "Егоров Кирилл Денисович", "Аналитик",
                "ralamosm@icloud.com", "7 203 643-49-49", 45000, 28);
        Employee user3 = new Employee("3", "Зотова Ева Ярославовна", "Программист",
                "malin@outlook.com", "8 143 667-37-66", 27000, 32);
        Employee user4 = new Employee("4", "Никитин Роберт Даниилович", "Web-разработчик",
                "malin@outlook.com", "7 468 264-30-40", 55000, 32);
        Employee user5 = new Employee("5", "Кочетов Богдан Кириллович", "Data Scientist",
                "ralamosm@icloud.com", "8 143 667-37-66", 70000, 32);
      //  System.out.println(Employees_5);
    }


   // public static class userDemoApp {
    public void main(String[] args) {
        Employee user1  = new Employee();
        Employee user2  = new Employee();
        Employee user3  = new Employee();
        Employee user4  = new Employee();
        Employee user5  = new Employee();
        id = Integer.parseInt("1");
        full_name = "Селезнева Дарья Алексеевна";
        position = "Тестировщик";
        email = "tubesteak@icloud.com";
        phone = "7 332 713-37-44";
        salary = "25 000";
        String age = "25";
        System.out.println("Пользователь ID: " + id + "ФИО: " + full_name + "должность: " + position
                + "имэил " + email +"Телефон: " + phone + "зарплата: " + salary + "Возраст " + age);
    }
}





