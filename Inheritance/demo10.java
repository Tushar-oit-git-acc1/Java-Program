class Device {
String Company;
String Model;
int Year;
double Price;
Device(String Company, String model, int Year, double Price)
{
    this.Company=Company;
    this.Model=model;
    this.Year=Year;
    this.Price=Price;
}
void display(){
    System.out.println("model : "+ this.Model);
    System.out.println("Company : "+ this.Company);
    System.out.println("Year : "+ this.Year);
    System.out.println("Price : "+ this.Price);
}
}

class mobilephone extends Device {
    String os;
    String ram;
    String storage;
    mobilephone(String Company, String model, int Year, double Price, String os, String ram){
        super(Company, model, Year, Price);
        this.os=os;
        this.ram=ram;
        this.storage=storage;


    }
    void display1()
    {
        System.out.println("model : "+ this.Model);
        System.out.println("Company :"+ this.Company);
        System.out.println("Year : "+ this.Year);
        System.out.println("Price : "+ this.Price);
        System.out.println("os : "+ this.os);
        System.out.println("ram : "+ this.ram);
        System.out.println("storage : "+ this.storage);

    }
}

class telephone extends Device{
    String id_or_number;
    telephone(String Company, String model, int Year, double Price, String id_or_number){
        super(Company, model, Year, Price);
        this.id_or_number=id_or_number;

    }
    void display2(){
        System.out.println("model : "+this.Model);
        System.out.println("Company : "+this.Company);
        System.out.println("Year : "+this.Year);
        System.out.println("Price : "+this.Price);
        System.out.println("id_or_number : "+this.id_or_number);

    }
}

    public class demo10 {
        public static void main(String[] args) {
            mobilephone m=new mobilephone("samsung", "s10", 2020,
            50000.0, "android", "8gb");
            m.display1();
            telephone t=new telephone("nokia", "nokia 3310", 2000,
            1000.0, "1234567890");
            t.display2();
        }
    }