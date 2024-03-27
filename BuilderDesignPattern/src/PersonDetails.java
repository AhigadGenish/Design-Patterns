public class PersonDetails {

    final int id; // required
    final String email;  // required
    final String name;
    final String surName;
    final String middleName;
    final String webURL;

    final byte age;


    // Constructor
    private PersonDetails(PersonDetailsBuilder anyPersonDetailsBuilder){

        this.id = anyPersonDetailsBuilder.id;
        this.email = anyPersonDetailsBuilder.email;
        this.name = anyPersonDetailsBuilder.name;
        this.surName = anyPersonDetailsBuilder.surName;
        this.middleName = anyPersonDetailsBuilder.middleName;
        this.webURL = anyPersonDetailsBuilder.webURL;
        this.age = anyPersonDetailsBuilder.age;

    }


    public static class PersonDetailsBuilder{

        // Data Members
        final int id; // required
        final String email;  // required
        private String name;
        private String surName;
        private String middleName;
        private String webURL;

        private byte age;

        // Setters
        public PersonDetailsBuilder(int id, String email){
            this.id = id;
            this.email = email;
        }

        public PersonDetailsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonDetailsBuilder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public PersonDetailsBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonDetailsBuilder setWebURL(String webURL) {
            this.webURL = webURL;
            return this;
        }

        public PersonDetailsBuilder setAge(byte age) {
            this.age = age;
            return this;
        }

        public PersonDetails build(){
            return new PersonDetails(this);
        }
    }
}
