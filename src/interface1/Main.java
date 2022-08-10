package interface1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Worker worker1 = new Programmer("����");
        Worker worker2 = new Programmer("������");
        Worker worker3 = new Programmer("����");
        Worker worker4 = new Cook("����");
        Worker worker5 = new Cook("����");
        Worker worker6 = new Cook("������");
        Worker worker7 = new Driver("������");
        Worker worker8 = new Driver("����");
        Worker worker9 = new Driver("���������");

        ArrayList<Worker> work = new ArrayList<>();
        work.add(worker1);
        work.add(worker2);
        work.add(worker3);
        work.add(worker4);
        work.add(worker5);
        work.add(worker6);
        work.add(worker7);
        work.add(worker8);
        work.add(worker9);
        for (Worker worker : work) {
            worker.voice();
        }
        ArrayList<CapableOfProgramming> programmist = new ArrayList<>();
        programmist.add((CapableOfProgramming) worker1);
        programmist.add((CapableOfProgramming) worker2);
        programmist.add((CapableOfProgramming) worker3);
        for (CapableOfProgramming programming : programmist) {
            programming.writeCode();
        }
        ArrayList<AbleToCook> cook = new ArrayList<>();
        cook.add((AbleToCook) worker4);
        cook.add((AbleToCook)worker5);
        cook.add((AbleToCook)worker6);
        for (AbleToCook cooks : cook) {
            cooks.cook();
        }
        ArrayList<AbleToDrive> driver = new ArrayList<>();
        driver.add((AbleToDrive) worker7);
        driver.add((AbleToDrive) worker8);
        driver.add((AbleToDrive) worker9);
        for (AbleToDrive drive : driver) {
            drive.drive();
        }
    }
}