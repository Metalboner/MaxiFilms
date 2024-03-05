import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Detective det = new Detective("Seven","David Fincher",127,33,327,true);
        Drama dra = new Drama("Oppenheimer","Christopher Nolan",180,100,1000,true);
        Comedy cum= new Comedy("DumbAndDumber","Peter Farrelly",106,17,247,"Funny noise");
        Action act = new Action("John Wick","Chad Stahelski",101,25,80,"Explosion");

        Scanner sc = new Scanner(System.in);

        System.out.println("What Genre of film do you want to watch?");
        String x = sc.nextLine();
        if (x.equals("Detective")){
            System.out.println("Here is what we can recommend:");
            System.out.println(det.printinfo()+det.income());
        } else if (x.equals("Drama")) {
            System.out.println("Here is what we can recommend:");
            System.out.println(dra.printinfo()+dra.income());
        } else if (x.equals("Comedy")) {
            System.out.println("Here is what we can recommend:");
            System.out.println(cum.printinfo()+cum.income());

        } else if (x.equals("Action")) {
            System.out.println("Here is what we can recommend:");
            System.out.println(act.printinfo()+act.income());

        }else {
            System.out.println("Sorry, we dont have such type of films :(");
        }

        ArrayList<Film> film = new ArrayList<>();
        film.add(det);
        film.add(dra);
        film.add(cum);
        film.add(act);
            try {
                FileWriter fw = new FileWriter("text.txt");
                for (Film i : film) {
                    String str = i.printinfo()+i.income();
                    fw.write(str+"\n");

                }
                fw.close();
            }catch (Exception e){
                System.out.println("Error");
            }



    }
}