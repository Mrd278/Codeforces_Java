package Codeforces;
import java.util.Scanner;

public class AntonAndDanik
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String game_results = sc.next();
        int Anton = games_Won(game_results, 'A');
        int Danik = games_Won(game_results, 'D');

        if(Anton > Danik)
            System.out.println("Anton");
        else if(Anton < Danik)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
        sc.close();
    }

    // returns total games won by a player
    public static int games_Won(String game_res, char Player)
    {
        int count = 0;
        for(int i = 0; i < game_res.length(); i++)
        {
            if(game_res.charAt(i) == Player)
                count++;
        }
        return count;
    }
}