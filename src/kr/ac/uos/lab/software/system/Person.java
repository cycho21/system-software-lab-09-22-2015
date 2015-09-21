package kr.ac.uos.lab.software.system;

/**
 * @author Chan Yeon, Cho
 * @link http://gitlab.com/lovebube
 * @since 2015-09-21
 */

public class Person {

    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
        printInfo();
    }

    private void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Job  : " + this.job);
        System.out.println("Age  : " + this.age);
        System.out.println("******************");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

}
