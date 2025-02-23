import java.util.Scanner;
import java.util.Random;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] comedyMovies = {
            "Hot Rod (2007)",
            "The Other Guys (2010)",
            "MacGruber (2010)",
            "They Came Together (2014)",
            "Death at a Funeral (2007)",
            "The Guard (2011)",
            "Game Night (2018)",
            "In the Loop (2009)",
            "Tucker and Dale vs. Evil (2010)",
            
        };

        String[] horrorMovies = {
            "The Autopsy of Jane Doe (2016)",
            "Triangle (2009)",
            "Pontypool (2008)",
            "Lake Mungo (2008)",
            "Session 9 (2001)",
            "The Hallow (2015)",
            "Absentia (2011)",

        };

        String[] romanticMovies = {
            "Like Crazy (2011)",
            "The Spectacular Now (2013)",
            "The One I Love (2014)",
            "In Your Eyes (2014)",
            "Comet (2014)",
            "Man Up (2015)",
            "Never Let Me Go (2010)",
            "Love Me If You Dare (2003, France)",
            "The Handmaiden (2016, South Korea)",
            "The Map of Tiny Perfect Things (2021)",
            "Happy Accidents (2000)",
            "Safety Not Guaranteed (2012)",

        };

        String[] scifiMovies = {
            "Coherence (2013)",
            "Primer (2004)",
            "Timecrimes (2007, Spain)",
            "The Endless (2017)",
            "Synchronic (2019)",
            "Moon (2009)",
            "The Man from Earth (2007)",
            "The Discovery (2017)",
            "Upgrade (2018)",
            "The Vast of Night (2019)",
            "Beyond the Black Rainbow (2010)",
        };

        String[] feelgoodMovies = {
            "Wont You Be My Neighbor? (2018)",
            "Pick of the Litter (2018)",
            "The Biggest Little Farm (2018)",
            "Streetwise (1984)",
            "Science Fair (2018)",
            "Man on Wire (2008)",
            "Paddington 2 (2017)",
            "Big Fish (2003)",
            "We Bought a Zoo (2011)",
            "A Good Year (2006)",
            "Little Miss Sunshine (2006)",
            "The Blind Side (2009)",

        };

        String[] crimeMovies = {
            "Zodiac (2007)",
            "Wind River (2017)",
            "Inside Man (2006)",
            "Hell or High Water (2016)",
            "Widows (2018)",
            "The Town (2010)",
            "The Kid Detective (2020)",
            "A History of Violence (2005)",
            "Blue Ruin (2013)",

        };

        String[] adventureMovies = {
            "Arctic (2018)",
            "The Revenant (2015)",
            "Against the Ice (2022)",
            "Into the Wild (2007)",
            "The Motorcycle Diaries (2004)",
            "The Lost City of Z (2016)",
            "The Aeronauts (2019)",
            "Kingdom of Heaven (2005)",
            "Prospect (2018)",
            "Uncharted (2022)",
            "Sahara (2005)",
            "The Fall (2006)",

        };

        String[] steamyMovies = {

            "The Handmaiden (2016, South Korea)",
            "Call Me by Your Name (2017)",
            "Angel (1982)",
            "Lie with Me (2005)",
            "Love (2015, Gaspar Noe)",
            "The To Do List (2013)",
            "Good Luck to You, Leo Grande (2022)",
            "Zebra Lounge (2001)",
            "Original Sin (2001)",
            "Lust, Caution (2007, China/Taiwan)",
            "Blue Is the Warmest Color (2013, France)",
            "Love & Other Crimes (2008, Serbia)",
            "Killing Me Softly (2002, UK/USA)",

        };

        String[] tamilMovies = {
            "Nayakan (1987)",
            "Thalapathi (1991)",
            "Anbe Sivam (2003)",
            "Mouna Ragam (1986)",
            "Hey Ram (2000)",
            "Super Deluxe (2019)",
            "Pithamagan (2003)",
            "Aayirathil Oruvan (2010)",
            "Thani Oruvan (2015)",
        };

        System.out.println("Hey, I'm Pluto!  What are you in the mood for today?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("bye")) 
           
            {   
                
                System.out.println("alright catch you later");
                break;
            } 
           
            else if (userInput.contains("horror") || userInput.contains("ghost") || userInput.contains("creepy") || userInput.contains("haunting") || userInput.contains("thriller"))
            
            {   for (int i = 0; i < 3; i++){
                System.out.println(horrorMovies[random.nextInt(horrorMovies.length)]);}
            } 

            else if (userInput.contains("funny") || userInput.contains("comedy") || userInput.contains("laugh"))
            
            {   
                for (int i = 0; i < 3; i++){
                System.out.println(comedyMovies[random.nextInt(comedyMovies.length)]);}
            }
             
             else if (userInput.contains("love") || userInput.contains("romantic") || userInput.contains("love story") || userInput.contains("romance"))
           
            {
                for (int i = 0; i < 3; i++){
                System.out.println(romanticMovies[random.nextInt(romanticMovies.length)]);}
            } 
            else if (userInput.contains("adventure") || userInput.contains("wild") || userInput.contains("journey"))
           
            {   
                for (int i = 0; i < 3; i++){
                System.out.println(adventureMovies[random.nextInt(adventureMovies.length)]);}
            }
            else if (userInput.contains("steamy") || userInput.contains("sex") || userInput.contains("sexy"))
           
            {
                for (int i = 0; i < 3; i++){
                System.out.println(steamyMovies[random.nextInt(steamyMovies.length)]);}
            }
            else if (userInput.contains("tamil") || userInput.contains("tamizh"))
           
            {
                for (int i = 0; i < 3; i++){
                System.out.println(tamilMovies[random.nextInt(tamilMovies.length)]);}
            }
            
        }

        scanner.close();
    }
}
