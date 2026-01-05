package com.encapsulation.hospitalmanagementsystem;

public class OutPatient extends Patient implements MedicalRecord 
{

    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) 
    {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    double calculateBill() 
    {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) 
    {
        System.out.println("Out-Patient Record Added: " + record);
    }

    @Override
    public void viewRecords() 
    {
        System.out.println("Viewing Out-Patient Medical Records");
    }
}

