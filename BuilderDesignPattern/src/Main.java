public class Main {

    public static void main(String[] args) {

        PersonDetails pd1 = new PersonDetails.PersonDetailsBuilder(123, "bla@bla.com").build();
        PersonDetails pd2 = new PersonDetails.PersonDetailsBuilder(123, "bla@bla.com").setAge((byte)18).setName("Ahigad Genish").build();


        // Example from java
        String anyString = new StringBuilder("Ahigad").append("_Genish").reverse().toString();



    }
}