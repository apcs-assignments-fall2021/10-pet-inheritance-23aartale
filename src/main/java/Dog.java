public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public Dog(){
        this.breed = "pug";
    }
    // makeNoise() method
    public void makeNoise(){
        System.out.println("ruf ruf ruf");
    }

    // toString method
    public String toString(){
        return getName() + ", " + getAge() + " " + breed;
    }

    // Getter
    public String getBreed(){
        return breed;
    }

    // Setter
    public void setBreed(String breed){
        this.breed = breed;
    }
}