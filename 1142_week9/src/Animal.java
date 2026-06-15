class Animal {
    protected String name;
    protected int age;

   
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        if (age < 2) {
            System.out.println("Young animal sound");
        } else {
            System.out.println("Animal makes sound");
        }
    }
}