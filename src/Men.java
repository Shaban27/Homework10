public class Men {
String name;
public int age;
String city;
String jobTitle;

    public Men(String name, int age, String city, String jobTitle) {
        if (age<0){
            this.age =0;
        }else
            this.age = age;

        if (name ==null){
            this.name = "Информация не указана";
         } else
         this.name = name;

        if (city == null) {
            this.city = "Информация не указана";
        } else
            this.city = city;
        if (jobTitle == null){
            this.jobTitle = "Информация не указана";
        } else
        this.jobTitle = jobTitle;
    }
}

