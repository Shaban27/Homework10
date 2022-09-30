public class Men {
    String name;
    private int age;
    private String city;
    String jobTitle;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Men(String name, int age, String city, String jobTitle) {
        if (age < 0) {
            this.age = 0;
        } else
            this.age = age;

        if (name == null) {
            this.name = "Информация не указана";
        } else
            this.name = name;

        if (city == null) {
            this.city = "Информация не указана";
        } else
            this.city = city;

        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else
            this.jobTitle = jobTitle;


    }
}

