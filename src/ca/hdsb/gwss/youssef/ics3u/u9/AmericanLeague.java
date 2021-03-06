/*
 * Name: Youssef
 * Description: XML Quiz
 * Date: June 2nd 2017
 */
package ca.hdsb.gwss.youssef.ics3u.u9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/**
 *
 * @author 1mohamedyou
 */
public class AmericanLeague {

    /**
     * @param args the command line arguments
     * @throws nu.xom.ParsingException
     * @throws nu.xom.ValidityException
     * @throws java.io.IOException
     */
    static Builder build = new Builder();
    static File file = new File("americanLeague.xml");
    static Document doc;
    static Element root;

    private static void printTeam(String chosenDivision) throws ParsingException, ValidityException, IOException {
        doc = build.build(file);
        root = doc.getRootElement();

        Element team;
        String division;
        Elements teams = root.getChildElements();

        System.out.println("American League East");
        System.out.println("-------------------------");
        System.out.println("Team               Record");
        for (int i = 0; i < teams.size(); i++) {
            team = teams.get(i);
            division = team.getFirstChildElement("division").getValue();

            if (division.equals(chosenDivision)) {
                System.out.format("%-16s  %6s ", team.getFirstChildElement("name").getValue(), team.getFirstChildElement("record").getValue());
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) throws ParsingException, ValidityException, IOException {
        printTeam("East");
        System.out.println("\n");
        printTeam("Central");
        System.out.println("\n");
        printTeam("West");

        Elements teams = root.getChildElements();
        String divisionFound;
        Element team;

        Element writeRoot = new Element("americanLeagueEastTeams");
        Document writeDoc = new Document(writeRoot);

        Element writeTeam;
        Element writeName;
        Element writeDivision;
        Element writeRecord;

        for (int i = 0; i < teams.size(); i++) {
            team = teams.get(i);
            divisionFound = team.getFirstChildElement("division").getValue();

            if ("East".equals(divisionFound)) {
                writeTeam = new Element("team");
                writeName = new Element("name");
                writeDivision = new Element("division");
                writeRecord = new Element("record");

                writeRoot.appendChild(writeTeam);
                writeTeam.appendChild(writeName);
                writeTeam.appendChild(writeDivision);
                writeTeam.appendChild(writeRecord);

                writeName.appendChild(team.getFirstChildElement("name").getValue());
                writeDivision.appendChild(team.getFirstChildElement("division").getValue());
                writeRecord.appendChild(team.getFirstChildElement("record").getValue());
            }
        }
        try {
            FileWriter fw = new FileWriter("americanLeagueEast.xml");
            try (BufferedWriter output = new BufferedWriter(fw)) {
                output.write(writeDoc.toXML());
            }
        } catch (IOException ex) {
            Logger.getLogger(AmericanLeague.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
