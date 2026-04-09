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
public class JuniorDoctor extends Doctor{

    public JuniorDoctor(Team team, int id, ArrayList<Appointment> appointments, ArrayList<Patient> patients) {
        super(team, id, appointments, patients);
    }
    
}
