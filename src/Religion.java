public class Religion {

    int yearsActive;
    String name;
    int members;
    String leader;

    public Religion(int pYearsActive, String pName, int pMembers,String pLeader) {
        yearsActive = pYearsActive;
        name = pName;
        members = pMembers;
        leader = pLeader;

    }

    public void rating(){
    if(members>1000){
        System.out.println("This religion must be legit. You should trust " + leader + ".");
    }
        else {
        System.out.println("This religion is bs. You should not trust " + leader + ".");
    }
    }



    public void print(){
        System.out.println(name + " has been active for " + yearsActive + " years.");
        System.out.println(name + " has " + members + " members.");
        System.out.println(name + "'s leader is " + leader + ".");
        rating();
    }

}
