public class Person {
    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void displayinfo(){
        System.out.println("Name: " + name + "\n"+
                "Age: " + age + "\n" +
                "id " + id);
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }


}
