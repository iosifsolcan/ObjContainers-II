package ro.ObjContainers.Run;

import ro.ObjContainers.SalesRepresentative.SalesRepresentative;

public class Run {
    public void RunApp()
    {
        SalesRepresentative representatives=new SalesRepresentative();
        representatives.AddPersons();
        representatives.printPersons(representatives.getRepresentatives());
        SalesRepresentative [ ] sortedRepresentatives=representatives.sort(representatives.getRepresentatives());
        representatives.printPersons(sortedRepresentatives);

    }
}
