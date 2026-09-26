package ro.ObjContainers.SalesRepresentative;



import java.util.*;

public class SalesRepresentative {
    String name,nameCopy;
    int numberOfPersons,numberOfSales,quotaPerSale ,worthOfSales,checkBubbleSort=0;

    Scanner sc=new Scanner(System.in);
    SalesRepresentative[] representatives;

    public void AddPersons()
    {
        System.out.println("how many persons u wanna add?");
        numberOfPersons=sc.nextInt();
        sc.nextLine();
        representatives=new SalesRepresentative[numberOfPersons];
        for(int i=0;i<numberOfPersons;i++) {
            SalesRepresentative person=new SalesRepresentative();
            System.out.println("Enter person name");
            person.name=sc.nextLine();
            nameCopy=person.name;
            System.out.println("how many sales have this person? --> "+nameCopy);
            person.numberOfSales=sc.nextInt();
            sc.nextLine();
            System.out.println("how much is asking per 1 sale? --> "+nameCopy);
            person.quotaPerSale=sc.nextInt();
            sc.nextLine();
            person.worthOfSales=person.numberOfSales*person.quotaPerSale;
            representatives[i]=person;
        }
    }

    public SalesRepresentative[] getRepresentatives() {
        return representatives;
    }

    public SalesRepresentative[] sort(SalesRepresentative[] representatives)
    {
        for(int i=0;i<representatives.length;i++)
        {
            for(int j=0;j<representatives.length-i-1;j++)
            {
                if(representatives[j].worthOfSales<representatives[j+1].worthOfSales)
                {
                    SalesRepresentative temp=representatives[j];
                    representatives[j]=representatives[j+1];
                    representatives[j+1]=temp;
                }
            }
        }
        return  representatives;
    }

    public void printPersons(SalesRepresentative [] representatives)
    {
        System.out.println();
        if(checkBubbleSort==0) {
            System.out.println("Persons and their sales ");
            System.out.println("<<-- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -->>");
            for (int i = 0; i < numberOfPersons; i++) {
                System.out.println(" " + representatives[i]);
            }
            System.out.println("<<-- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -->>");
        }
        else
        {
            System.out.println("Persons and their sales sorted by worthOfSales ");
            System.out.println("<<-- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -->>");
            for (int i = 0; i < numberOfPersons; i++) {
                System.out.println(" " + representatives[i]);
            }
            System.out.println("<<-- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -- --- -->>");
        }
        checkBubbleSort++;
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
