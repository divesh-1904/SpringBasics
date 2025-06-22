package org.nevermind;

public class Dev {
    private int age;
    private Laptop laptop;

    public Dev () {}

    public Dev (int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build () {
        System.out.println("Build Project!!!");
        laptop.compile();
    }
}
