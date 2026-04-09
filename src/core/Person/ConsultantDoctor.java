/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Person;
import core.Appointment.Appointment;
import core.hospital.Team;
import java.util.ArrayList;
/**
 *
 * @author sloba
 */
public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public Team getLeaderOf() {
        return leaderOf;
    }

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

   

    
    
    
    
    
}
