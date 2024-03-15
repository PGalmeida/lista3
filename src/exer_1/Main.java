package exer_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "pedro", "almeida");
        Person person2 = new Person(2, "maria", "marinha");

        Forum mess1 = new Forum(20, "jbj", "bjbcjbe");
        Forum mess2 = new Forum(30, "dgw", "bjdcbjdb");

        mess1.addMessage(100, "ncbebjbhbbcjvh", person1);
        mess1.addMessage(200, "jdcjbdcnkbhbvdhkjbc", person2);

        System.out.println(mess1);
    }
}
