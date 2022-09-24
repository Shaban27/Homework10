public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Men maksim = new Men("Максим", 35,"Минск", "бренд-менеджером");
        Men anna = new Men("Аня",29,"Москва","методистом образовательных программ");
        Men katy = new Men("Катя",28, null, "продакт-менеджером" );
        Men artem = new Men("Артем", 27,"Москва","директором по развитию бизнеса");



        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.city + ".  Я родился в " + (maksim.age - currentYear) + "  году. Я работаю на должности " +maksim.jobTitle +" .Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ".  Я из города " + anna.city + ".  Я родился в " + (anna.age - currentYear) + "  году. Я работаю на должности " +anna.jobTitle + " .Будем знакомы !");
        System.out.println("Привет! Меня зовут " + katy.name + ".  Я из города " + katy.city + ".  Я родился в " + (katy.age - currentYear) + "  году. Я работаю на должности " +katy.jobTitle + " .Будем знакомы !");
        System.out.println("Привет! Меня зовут " + artem.name + ".  Я из города " + artem.city + ".  Я родился в " + (artem.age - currentYear) + "  году. Я работаю на должности " +artem.jobTitle + " .Будем знакомы!");
    }
}