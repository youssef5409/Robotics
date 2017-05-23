/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u7;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1mohamedyou
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Element root = new Element("mls");
        Document doc = new Document(root);
        
        Element conference = new Element("conference");

        Element team = new Element("Team");
        
        Element teamName = new Element("name");
        Element stadium = new Element("Stadium");
        Element mvp = new Element("mvp");
        
        team.appendChild(teamName);
        team.appendChild(stadium);
        team.appendChild(mvp);
        
        teamName.appendChild("Toronto FC");
        stadium.appendChild("BMO Field");
        mvp.appendChild("Sebastian Giovinco");
        
        conference.appendChild(team);
        
        //Add Children
        root.appendChild(conference);
        
      
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(doc);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
