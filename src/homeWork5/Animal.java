package homeWork5;

public abstract class Animal {
    private String name;
    private double maxRun;

    Animal(String name, double maxRun){
        this.name = name;
        this.maxRun = maxRun;
    }

    public String getName() {
        return name;
    }

    public abstract boolean run(float length);

    public abstract boolean jump(float length);

    public abstract boolean swim(float length);

}
