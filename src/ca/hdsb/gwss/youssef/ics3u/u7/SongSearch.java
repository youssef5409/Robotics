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
public class SongSearch {

    /**
     * @param args the command line arguments
     * @throws nu.xom.ParsingException
     * @throws nu.xom.ValidityException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParsingException, ValidityException, IOException {
        Builder build = new Builder();
        File file = new File("songs.xml");
        Document doc = build.build(file);
        Element root = doc.getRootElement();
        Element song;
        String songTitle;
        String artist;
        String year;

        Elements songs = root.getChildElements();
        
        for (int i = 0; i < songs.size(); i++) {
            song = songs.get(i);
            year = song.getFirstChildElement("year").getValue();

            if (year.equals("1999")) {
                songTitle = song.getFirstChildElement("title").getValue();
                artist = song.getFirstChildElement("artist").getValue();
                System.out.println(artist + "-" + songTitle);
            }
        }
    }
}
