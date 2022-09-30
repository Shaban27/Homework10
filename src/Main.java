public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Men maksim = new Men("Максим", 35, "Минск", "бренд-менеджером");
        Men anna = new Men("Аня", 29, "Москва", "методистом образовательных программ");
        Men katy = new Men("Катя", 28, null, "продакт-менеджером");
        Men artem = new Men("Артем", 27, "Москва", "Директором по развитию бизнеса");
        Men vladimir = new Men("Владимир", 21, "Казань, ", " не работает.");

        printMan( maksim);
        printMan(anna);
        printMan(katy);
        printMan(artem);
        printMan(vladimir);
    }
    private static void  printMan (Men men){


            System.out.println("Привет! Меня зовут " + men.name + ".  Я из города "
                    + men.getCity() + ".  Я родился в " + men.getAge() +
                    "  году. Я работаю на должности " + men.jobTitle + " .Будем знакомы !");


        }


    }
