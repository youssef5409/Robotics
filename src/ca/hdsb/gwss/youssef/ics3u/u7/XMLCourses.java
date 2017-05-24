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
public class XMLCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Element root = new Element("courses");
        Document doc = new Document(root);
        
        Element course = new Element("course");

        Element code = new Element("code");
        Element description = new Element("description");
        Element teacher = new Element("teacher");
        Element schoolBoard = new Element("schoolBoard");
        
        root.appendChild(course);
        
        course.appendChild(code);
        course.appendChild(description);
        course.appendChild(teacher);
        course.appendChild(schoolBoard);
        
        code.appendChild("ICS-4U");
        description.appendChild("Grade 12 Programming");
        teacher.appendChild("Mr. Muir");
        schoolBoard.appendChild("HDSB");
        
        root.appendChild(course);
        
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
