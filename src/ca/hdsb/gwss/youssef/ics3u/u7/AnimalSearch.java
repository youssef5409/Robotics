/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u7;

import java.io.File;
import java.io.IOException;
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
public class AnimalSearch {

    /**
     * @param args the command line arguments
     * @throws nu.xom.ParsingException
     * @throws nu.xom.ValidityException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParsingException, ValidityException, IOException {
        Builder build = new Builder();
        File file = new File("animals.xml");
        Document doc = build.build(file);
        Element root = doc.getRootElement();

        Element animal;
        String name;
        String animalClass;
        String habitat;
        String diet;
        String flying;

        Elements animals = root.getChildElements();

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            diet = animal.getFirstChildElement("diet").getValue();

            if (diet.equals("Carnivore")) {
                System.out.println(animal.toXML());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            flying = animal.getFirstChildElement("flying").getValue();

            if (flying.equals("Yes")) {
                System.out.println(animal.getFirstChildElement("animalName").toXML());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            habitat = animal.getFirstChildElement("habitat").getValue();

            if (habitat.equals("North America")) {
                System.out.println(animal.toXML());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            name = animal.getFirstChildElement("animalName").getValue();

            if (name.equals("Moose")) {
                System.out.println(animal.toXML());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            name = animal.getFirstChildElement("animalName").getValue();

            if (name.equals("Toucan")) {
                System.out.println(animal.getFirstChildElement("animalName").getValue());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            animalClass = animal.getFirstChildElement("animalClass").getValue();

            if (animalClass.equals("Mammalia")) {
                System.out.println(animal.toXML());
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            animal = animals.get(i);
            diet = animal.getFirstChildElement("diet").getValue();

            if (diet.equals("Omnivore")) {
                System.out.println(animal.toXML());
            }
        }
    }
}
