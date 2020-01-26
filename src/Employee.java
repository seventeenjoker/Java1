public class Employee {
    // + Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    // + Конструктор класса должен заполнять эти поля при создании объекта;
    // + Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    // + Вывести при помощи методов из пункта 3 ФИО и должность.
    // + Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    //* + Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    //* + Средние арифметические возраста и зарплаты
    //*** + Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
    private static int PKey = 0;
    private static final int YEAR = 2020;
    private String fio;
    private String position;
    private String mobileNum;
    private int salary;
    private int birthYear;
    private int id;

    Employee(String fio, String position, String mobileNum, int salary, int birthYear){
        System.out.println("Создаем карточку нового сотрудника...");
        this.setFio(fio);
        this.setPosition(position);
        this.setMobileNum(mobileNum);
        this.setSalary(salary);
        this.birthYear = birthYear;
        this.PKey += 1;
        this.setPKey(PKey);
        System.out.printf("Создан сотрудник №%d: %s, позиция: %s, телефонный номер: %s, зарплата: %d \n",
                PKey, fio, position, mobileNum, salary
        );
    }

    public void getInfo(){
        System.out.printf("ФИО сотрудника №%d: %s;\nПозиция: %s;\nТелефонный номер: %s;\nЗарплата: %d.\n",
                id, fio, position, mobileNum, salary);
    }

    public void setPKey(int PKey) {
        this.id = PKey;
    }

    public void getFio() {
        System.out.println(fio);
    }


    public void setFio(String fio) {
        this.fio = fio;
    }


    public void getPosition() {
        System.out.println(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getAge() {
        return this.YEAR - this.birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
