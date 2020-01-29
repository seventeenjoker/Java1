package homeWork5;

public class Bird extends Animal {
    public Bird(String name, double maxRun){
        super(name, maxRun);
    }

    @Override
    public boolean run(float length){
        if (length <= 5){
            System.out.println(getName() + " пробежал(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(float length){
        if (length <= 0.2){
            System.out.println(getName() + " подпрыгнул(а).");
            return true;
        }
        return false;
    }

    @Override
    public boolean swim(float length){
        return false;
    }
}
