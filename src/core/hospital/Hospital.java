/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital;

import core.Person.ConsultantDoctor;
import java.util.ArrayList;

/**
 *
 * @author sloba
 */
public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public ArrayList<Team> getTeam(int i) {
        return this.teams;
    }

    public ArrayList<Ward> getWards() {
        return this.wards;
    }

    public void addTeam(int id, int consultantdoctorID) {
        Team team = team(id,new ConsultantDoctor(consultantdoctorID, team));
        
        if(!teams.contains(team)){
            teams.add(team);
        }
            
    }
    
    
}
