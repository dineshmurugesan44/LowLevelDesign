package solid;

public abstract class Bird {
    protected FlyBehaviour flyBehaviour;
    protected Swim swimBehaviour;

    public Bird(FlyBehaviour flyBehaviour, Swim swimBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();

    }
    public void swim() {
        swimBehaviour.swim();
    }

   public abstract void makeSound();
}

class Peacock extends Bird implements Dance, Sing{

    public Peacock(){
        super(new CanFly(),new CannotSwim());

    }


    public void makeSound() {
        System.out.println("Peacock says: ahhh!");
    }

    @Override
    public void dance() {
        System.out.println("Peacock dances");
    }
    @Override
    public void sing() {
        System.out.println("Peacock sings");
    }
}

class penguin extends Bird implements Dance {
    public penguin(){
        super(new CannotFly(), new CanSwim());
    }


    public void makeSound() {
        System.out.println("PENGUIN SAYS: pennn");
    }

    @Override
    public void dance() {
        System.out.println("penguin dances");
    }
}

