/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Person;
import core.hospital.Team;
import core.hospital.Ward;
import core.Appointment.Appointment;
import java.util.ArrayList;

/**
 *
 * @author sloba
 */
public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList <Appointment> appointments;
    private ArrayList <Doctor> doctors;

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public Ward getWard() {
        return ward;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
    
    
}
