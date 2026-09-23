package ro.ObjContainers.Run;

import ro.ObjContainers.AddPerson.AddPerson;
import ro.ObjContainers.SalesRepresentative.SalesRepresentative;

public class Run {
    public void RunApp()
    {
        AddPerson person=new AddPerson();
        person.AddPersons();
        person.printPersons();
        SalesRepresentative salesRepresentative =new SalesRepresentative(person);
        salesRepresentative.bubbleSortSales();
        salesRepresentative.printSales();
    }
}
