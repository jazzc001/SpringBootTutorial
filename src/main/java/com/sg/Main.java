package com.sg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        Doctor doctor = context.getBean(Doctor.class); //get beans by class
        doctor.assist();

        Nurse nurse = (Nurse) context.getBean("nurse"); //get beans by id
        nurse.assist();

        Staff staff1 = context.getBean(Doctor.class); // under same interface Staff, get bean can call two classes
        staff1.assist();

        Staff staff2 = context.getBean(Nurse.class);
        staff1.assist();

    }
}