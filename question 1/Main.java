import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook novel=new MyBook();
        novel.setTitle(title);
        System.out.println("The title is:"+novel.getTitle());
    }
}
