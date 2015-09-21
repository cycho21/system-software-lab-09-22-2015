package kr.ac.uos.lab.software.system;

/**
 * @author Chan Yeon, Cho
 * @link http://gitlab.com/lovebube
 * @since 2015-09-21
 */

public class Application {

    private Person p1;
    private Person p2;
    private Person p3;
    private int personCount;

    public Application() {
        personCount = 0;
        startApplication();
    }

    private void startApplication() {
        setPersons();
        getAverageAge();
    }

    private void setPersons() {
        p1 = new Person("Jae Hyung", "Captain", 30);
        personCount++;
        p2 = new Person("Yoon Gwan", "Spy", 29);
        personCount++;
        p3 = new Person("Yeon Jung", "God", 25);
        personCount++;
    }

    private void getAverageAge() {
        System.out.println("Average age of this people is " + (p1.getAge() + p2.getAge() + p3.getAge())/personCount + " years");
    }

    public static void main(String[] args) {
        new Application();
    }
}
