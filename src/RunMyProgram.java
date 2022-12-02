public class RunMyProgram {
    public static void main(String[] args) {
        System.out.println("hello world");
        Avatar joker = new Avatar();
        joker.print();
        Avatar skull = new Avatar();
        skull.role = "deuteragonist";
        skull.power = "electricity";
        skull.weakness = "wind";
        skull.print();
        Avatar cyborg = new Avatar(800,90,10,40,109,238,"supporting character", "cyborg", "water" );
        cyborg.print();
        Avatar blackPanther = new Avatar(600, 300, 12, 37, 123, 374, "Black Panther", "super strength", "heart attack" );
        blackPanther.print();
//        Religion psychoHelmet = new Religion(1,"Psycho Helmet", 10000, "Divine Tree");
//        psychoHelmet.print();
//        Religion lol = new Religion(10,"(LOL)",90000,"Dimple");
//        lol.print();
//        Religion sco = new Religion(4,"Spirits and Such Consultation Office",4,"Reigen");
//        sco.print();
//        City beijing = new City();
//        beijing.name = "Beijing";
//        beijing.avgTemp = 65;
//        beijing.pop = 2100000;
//        beijing.cont = "Asia";
//        beijing.print();
//
//        City lagos = new City();
//        lagos.print();
//        lagos.name = "Lagos";
//        lagos.avgTemp = 90;
//        lagos.pop = 10;
//        lagos.cont = "Africa";
//        lagos.print();



//        Student mob = new Student();
//        mob.age = 14;
//        mob.name = "Mob";
//        mob.grade = 8;
//        mob.isBoarder = false;
//        mob.print();
//
//        mob.isBoarder = true;
//        mob.name = "psycho helmet";
//        mob.club = "body improvement club";
//        mob.print();
//
//        Student dimple = new Student();
//        dimple.age = 1000;
//        dimple.name = "Dimple";
//        dimple.grade = 10000;
//        dimple.isBoarder = true;
//        dimple.club = "(LOL)";
//        dimple.print();
//
//        Student reigen = new Student();
//        reigen.age = 30;
//        reigen.name = "Reigen";
//        reigen.grade = 100;
//        reigen.isBoarder = false;
//        reigen.club = "Spirits and Such Consultation Office";
//        reigen.print();
//
    }
}
