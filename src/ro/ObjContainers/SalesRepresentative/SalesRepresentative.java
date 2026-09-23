package ro.ObjContainers.SalesRepresentative;

import ro.ObjContainers.AddPerson.AddPerson;

import java.util.List;


public class SalesRepresentative {
    public String name;
    public int numberOfSales,worthOfSales;
    List<SalesRepresentative> sales;

    public SalesRepresentative(AddPerson person)
    {
        sales=person.getSalesRepresentative();

    }

    public void bubbleSortSales()
    {
        for(int i=0;i<sales.size()-1;i++)
        {
            for(int j=0;j<sales.size()-i-1;j++)
            {
                if(sales.get(j).worthOfSales<sales.get(j+1).worthOfSales)
                {
                    SalesRepresentative temp=sales.get(j);
                    sales.set(j,sales.get(j+1));
                    sales.set(j+1,temp);

                }
            }
        }

    }

    public void printSales()
    {
        System.out.println("===================================================");
        System.out.println("               Representative Sales");
        System.out.println("                         ||");
        System.out.println("                    ||   ||   ||");
        System.out.println("                      || || ||");
        System.out.println("                         ||");
        for(SalesRepresentative salesRepresentative1 :sales)
        {
            System.out.println("name -->"+ salesRepresentative1.name+", numberOfSales-->"+ salesRepresentative1.numberOfSales);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", numberOfSales=" + numberOfSales +
                '}';
    }
}
