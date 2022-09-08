package Lesson_5;

import javafx.application.Application;
import javafx.stage.Stage;

public class lesson_5 {

    public static void main(String[] args){
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee(1, "Селезнева Дарья Алексеевна", "Тестировщик", "tubesteak@icloud.com",
                "7 332 713-37-44", 25000, 25);
        persArray[1] = new Employee(2, "Егоров Кирилл Денисович", "Аналитик", "ralamosm@icloud.com",
                "7 203 643-49-49", 45000, 28);
        persArray[2] = new Employee(3, "Зотова Ева Ярославовна", "Программист", "malin@outlook.com",
                "8 143 667-37-66", 27000, 32);
        persArray[3] = new Employee(4, "Никитин Роберт Даниилович", "Web-разработчик", "malin@outlook.com",
                "7 468 264-30-40", 55000, 52);
        persArray[4] = new Employee(5, "Кочетов Богдан Кириллович", "Data Scientist", "ralamosm@icloud.com",
                "8 143 667-37-66", 70000, 42);

   //     persArray[1].age = 45;

        for (int i = 0; i <= 4; i++) {
            persArray[i].Print();
        }

        System.out.println();
        System.out.println("Больше 40:");
        for (int i = 0; i <= 4; i++){
            if(persArray[i].age > 40) {
                persArray[i].Print();
            }
        }
    }


    public static class Employee {
        private int id;
        private String full_name;
        private String position;
        private  String email;
        private  String phone;
        private  int salary;
        private  int age;

        public Employee(int id, String full_name, String position, String email, String phone, int salary, int age) {
          this.id = id;
          this.full_name = full_name;
          this.position = position;
          this.email = email;
          this.phone = phone;
          this.salary = salary;
          this.age = age;
        }

        public void Print_Age()
        {
            System.out.println("Age: " + this.age);
        }

        public void Print() {
            System.out.println("ID: " + this.id);
            System.out.println("Full_name: " + this.full_name);
            System.out.println("Position: " + this.position);
            System.out.println("Email: " + this.email);
            System.out.println("Phone: " + this.phone);
            System.out.println("Salary: " + this.salary);
            //System.out.println("Age: " + this.age);
            Print_Age();
            System.out.println("--------");
        }

    }

}
