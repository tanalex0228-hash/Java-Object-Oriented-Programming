class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }


    public void speak() {
        if (age < 2) {
            System.out.println("Puppy barks");
        } else {
            System.out.println("Dog barks");
        }
    }
}