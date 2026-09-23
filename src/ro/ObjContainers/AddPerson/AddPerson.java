package ro.ObjContainers.AddPerson;



import ro.ObjContainers.SalesRepresentative.SalesRepresentative;

import java.util.*;

public class AddPerson {
    String name,nameCopy;
    int numberOfPersons,numberOfSales,quotaPerSale,worthOfSales;
    Scanner sc=new Scanner(System.in);
    List<AddPerson> addPeople=new ArrayList<>();
    List<SalesRepresentative> salesRepresentative=new ArrayList<>();

    public void AddPersons()
    {
        System.out.println("how many persons u wanna add?");
        numberOfPersons=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=numberOfPersons;i++) {
            AddPerson person=new AddPerson();
            SalesRepresentative salesRepresentative =new SalesRepresentative(person);
            System.out.println("Enter person name");
            person.name=sc.nextLine();
            salesRepresentative.name=person.name;
            nameCopy=person.name;
            System.out.println("how many sales have this person? --> "+nameCopy);
            person.numberOfSales=sc.nextInt();
            sc.nextLine();
            salesRepresentative.numberOfSales=person.numberOfSales;
            System.out.println("how much is asking per 1 sale? --> "+nameCopy);
            person.quotaPerSale=sc.nextInt();
            sc.nextLine();
            person.worthOfSales=person.numberOfSales*person.quotaPerSale;
            salesRepresentative.worthOfSales=person.worthOfSales;
            addPeople.add(person);
            this.salesRepresentative.add(salesRepresentative);
        }
    }

    public List<SalesRepresentative> getSalesRepresentative()
    {
        return salesRepresentative;
    }

    public void printPersons()
    {
        for(AddPerson person : addPeople)
        {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numberOfSales=" + numberOfSales +
                ", quotaPerSale=" + quotaPerSale +
                ", worthOfSales=" + worthOfSales +
                '}';
    }
}
