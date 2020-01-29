package homeWork5;

public class Dog extends Animal {
    private float maxSwim;
    public Dog(String name, double maxRun, float maxSwim){
        super(name, maxRun);
        this.maxSwim = maxSwim;
    }

    @Override
    public boolean run(float length){
        if (length <= 500){
            System.out.println(getName() + " пробежал(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(float length){
        if (length <= 0.5){
            System.out.println(getName() + " подпрыгнул(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean swim(float maxSwim){
        if (maxSwim <= 10){
            System.out.println(getName() + " проплыл(а).");
            return true;
        }
        return false;
    }
}
