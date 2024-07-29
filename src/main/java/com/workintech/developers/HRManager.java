package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers ;

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if(juniorDevelopers[index] == null) {
            juniorDevelopers[index] = juniorDeveloper;
        } else {
            System.out.println("Yer yok!");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if(midDevelopers[index] == null) {
            midDevelopers[index] = midDeveloper;
        } else {
            System.out.println("Yer yok!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if(seniorDevelopers[index] == null) {
            seniorDevelopers[index] = seniorDeveloper;
        } else {
            System.out.println("Yer yok!");
        }
    }
}
