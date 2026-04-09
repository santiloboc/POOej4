/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital;
import core.Person.ConsultantDoctor;
import core.Person.Doctor;
import java.util.ArrayList;
import core.Person.Patient;
/**
 *
 * @author sloba
 */
public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList <Doctor> doctors;
    private ArrayList <Patient> patients;

    public int getId() {
        return id;
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    
    
    
    
    
}
