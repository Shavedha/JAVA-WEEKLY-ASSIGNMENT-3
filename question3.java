class Sports {
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName());
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in Soccer Class");
    }
}
public class question3 {
    public static void main(String[] args) {
        Sports a=new Sports();
        Soccer b=new Soccer();
        System.out.println(a.getName());
        a.getNumberOfTeamMembers();
        System.out.println(b.getName());
        b.getNumberOfTeamMembers();
    }
}
