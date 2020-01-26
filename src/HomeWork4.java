public class HomeWork4 {
    static void raiseSalary(Employee[] employee){
        for(int i = 0; i < employee.length; i++){
            int tempAge = employee[i].getAge();
            if (tempAge > 45){
                int oldSalary = employee[i].getSalary();
                employee[i].setSalary(oldSalary + 5000);
                System.out.println("Повысили зп сотруднику:");
                employee[i].getInfo();
            }
        }
    }

    static void avrAge(Employee[] employee){
        int tmp = 0;
        for(int i = 0; i < employee.length; i++){
            tmp += employee[i].getAge();
            if (i == employee.length - 1){
                double avrAge = (double)tmp / (i + 1);
                System.out.println("Средний возраст: " + avrAge);
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Pit Peterson", "art-designer", "+79055501232", 2500, 1975);
        employee[1] = new Employee("Sarah Mo", "creative director", "+79055501098", 4500, 1989);
        employee[2] = new Employee("Jay Jayson", "programmer", "+79006001232", 3000, 1980);
        employee[3] = new Employee("Doctor Y", "dentist", "+7905550123", 3800, 1994);
        employee[4] = new Employee("Raichel M", "actreess", "+79955501232", 4900, 1971);
        for(int i = 0; i < employee.length; i++){
            if(employee[i].getAge() > 40){
                employee[i].getInfo();
            }
        }

        // Повысим зп на 5000 у.е.
        raiseSalary(employee);

        // Посчитаем средний возраст
        avrAge(employee);
    }
}
