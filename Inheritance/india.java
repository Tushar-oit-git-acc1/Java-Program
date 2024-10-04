import java.util.Scanner;
class world{
    String country;
    int population;
    String capital;
    String language;

    public world(String country, int population, String capital, String language)
    {
        this.country=country;
        this.population=population;
        this.capital=capital;
        this.language=language;
    }
    public void display(){
        System.out.println("Coutry : "+ country);
        System.out.println("Population : "+ population);
        System.out.println("Capital : "+ capital);
        System.out.println("Language : "+ language);
    }
}
    public class india extends world{
        public india(String coutry, int population, String capital, String language)
        {
            super(coutry, population, capital, language);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter country name : ");
            String name= sc.nextLine();
            System.out.println("Enter population in Billion: ");
            int population = sc.nextInt();
            System.out.println("Enter capital of coutry : ");
            String capital = sc.next();
            System.out.println("Enter language of coutry : ");
            String language = sc.next();

            india ind = new india(name, population, capital, language);
            ind.display();


        }
    }