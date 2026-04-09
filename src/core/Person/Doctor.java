/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Person;
import core.hospital.Team;
import core.Appointment.Appointment;
import java.util.ArrayList;

/**
 *
 * @author sloba
 */
public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList <Appointment> appointments; 
    protected ArrayList <Patient> patients;

    public Doctor(Team team,int id  ) {
        this.id = id;
        this.team = team;
        this.appointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    
    
}
