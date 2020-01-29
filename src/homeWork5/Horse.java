package homeWork5;

public class Horse extends Animal {
    private float maxSwim;
    public Horse(String name, double maxRun, float maxSwim){
        super(name, maxRun);
        this.maxSwim = maxSwim;
    }

    @Override
    public boolean run(float length){
        if (length <= 1500){
            System.out.println(getName() + " пробежал(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(float length){
        if (length <= 3){
            System.out.println(getName() + " подпрыгнул(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean swim(float maxSwim){
        if (maxSwim <= 100){
            System.out.println(getName() + " проплыл(а).");
            return true;
        }
        return false;
    }
}
