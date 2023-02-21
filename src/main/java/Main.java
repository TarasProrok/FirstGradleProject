import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Taras", "Prorok");
        Gson gson = new Gson();

        String json = gson.toJson(person);
        System.out.println(json);
    }

    static class Person {
        private String name;
        private String lastName;

        public Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
