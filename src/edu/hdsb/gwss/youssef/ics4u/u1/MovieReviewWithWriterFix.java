/*
 * Name: Youssef Mohamed
 * Date: 26th Feb 2018
 * Version: 2.0
 * Description:
 *      This program analyzes words of reviews.   
 */
package edu.hdsb.gwss.youssef.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author 1mohamedyou This class exists because of a hole found in the previous
 * iteration of the program.
 */
public class MovieReviewWithWriterFix {

    //Initializing static variables
    final static double SENTENCE_REVIEW_POS = 2.01;
    final static double SENTENCE_REVIEW_NEG = 1.99;
    final static double TEXT_POS = 2.1;
    final static double TEXT_NEG = 1.9;

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, Exception {
        //Declaring objects
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");
        Scanner read = new Scanner(System.in);
        String file;
        String word;
        String[] bestWord;
        String[] worstWord;

        //Initializing variables
        double sentenceAvg;
        byte app;
        boolean check = false;

        //Logic Begins
        while (!check) {
            try {
                //Starts off by asking the question
                System.out.print("\n1 - Word average score \n"
                        + "2 - Sentence average score \n"
                        + "3 - Best & worst word in file \n"
                        + "4 - Words organized into positive.txt and negative.txt \n"
                        + "5 - Exit the program \n\n"
                        + "Select #: ");
                //Program expects Integer
                app = Byte.parseByte(read.nextLine());
                System.out.println();
                switch (app) {
                    case 1:
                        System.out.println("NOTICE: Will return '-1.0' if word is not found"
                                + " in 'MovieReviews.txt' ");
                        System.out.print("Enter a Word: ");
                        word = read.nextLine();
                        System.out.println("Word Count: " + wordCount(word, reviews));
                        System.out.println("Word Average Score: " + wordAverage(word, reviews));
                        //Can also print total word score, but that info seems useless
                        //System.out.println("Word Total Score: " + wordTotalScore(word, reviews));
                        break;
                    case 2:
                        //Total word count / total score;
                        System.out.print("What file would you like to read?: ");
                        sentenceAvg = sentenceAverage(new File(".\\data\\movie.review\\"
                                + read.nextLine()), reviews);
                        System.out.println(sentenceAvg);
                        if (sentenceAvg > SENTENCE_REVIEW_POS) {
                            System.out.println("Overall sentiment: positive");
                        } else if (sentenceAvg < SENTENCE_REVIEW_NEG) {
                            System.out.println("Overall sentiment: negative");
                        } else {
                            System.out.println("Overall sentiment: neutral");
                        }
                        break;
                    case 3:
                        System.out.print("Input File to split: ");
                        file = read.nextLine();
                        bestWord = wordMagnitude(new File(".\\data\\movie.review\\"
                                + file), reviews, true);
                        System.out.println("The most positive word with a score "
                                + "of " + bestWord[0] + " is " + bestWord[1]);
                        worstWord = wordMagnitude(new File(".\\data\\movie.review\\"
                                + file), reviews, false);
                        System.out.println("The most negative word with a score "
                                + "of " + worstWord[0] + " is " + worstWord[1]);
                        break;
                    case 4:
                        System.out.print("Input File: ");
                        wordWriter(new File(".\\data\\movie.review\\"
                                + read.nextLine()), reviews);
                        System.out.println("Complete!");
                        break;
                    case 5:
                        check = true;
                        break;
                    default:
                        System.out.println("Sorry, invalid number.");
                }
            } catch (Exception e) {
                System.out.println("Sorry, you entered an invalid value. \n");
            }
        }
    }

    /**
     * This method will accumulate the movie review scores that contain the key
     * word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the sum of the scores for reviews that contain the key work at
     * least once.
     * @throws java.lang.Exception
     */
    public static int wordCount(String word, File reviews) throws Exception {
        int i = 0;
        Scanner input = new Scanner(reviews);
        StringTokenizer st;

        //While file 'reviews' has more reviews, take the next review.
        while (input.hasNextLine()) {
            st = new StringTokenizer(input.nextLine());
            //While line from 'reviews' has more words, take the next word.
            while (st.hasMoreTokens()) {
                if (st.nextToken().toLowerCase().equals(word.toLowerCase())) {
                    i++;
                    //After a word has been found in a review, it breaks the
                    //loop to avoid recounting.
                    break;
                }
            }
        }
        return i;

    }

    /**
     * This method will accumulate the the movie review scores that contain the
     * key word.
     *
     * @param word
     * @param reviews
     * @return
     * @throws Exception
     */
    public static int wordTotalScore(String word, File reviews) throws Exception {
        //Refer to wordCount for logic comments, very similar.
        int rating;
        int totalRating = 0;
        Scanner input = new Scanner(reviews);
        StringTokenizer st;
        while (input.hasNextLine()) {
            st = new StringTokenizer(input.nextLine());
            rating = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                if (st.nextToken().toLowerCase().equals(word.toLowerCase())) {
                    totalRating += rating;
                    break;
                }
            }
        }
        return totalRating;
    }

    /**
     * Assorts words into positive and negative words.
     *
     * @param wordList
     * @param reviews
     * @throws FileNotFoundException
     * @throws Exception
     */
    public static void wordWriter(File wordList, File reviews) throws FileNotFoundException, Exception {
        double wordScore;
        PrintWriter writer;
        Set<String> posNoDup = new LinkedHashSet();
        Set<String> negNoDup = new LinkedHashSet();
        String word;
        Scanner input = new Scanner(wordList);

        //Loops through words, adding them to a 'positive' or 'negative' set.
        //I use a LinkedHashSet instead of an ArrayList or array, because a LinkedHashSet
        //will not allow duplicates.
        while (input.hasNextLine()) {
            word = input.nextLine();
            wordScore = wordAverage(word, reviews);
            if (wordScore > TEXT_POS) {
                posNoDup.add(word);
            } else if (wordScore < TEXT_NEG) {
                if (wordScore != -1) {
                negNoDup.add(word);
                }
            }
        }

        //This next bit could be implemented into a method however, it was so short
        //That i kept it this way.
        writer = new PrintWriter("positive.txt");
        for (String s : posNoDup) {
            writer.println(s);
        }
        writer.close();

        writer = new PrintWriter("negative.txt");
        for (String s : negNoDup) {
            writer.println(s);
        }
        writer.close();
    }

    /**
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     * @throws java.lang.Exception
     */
    public static double wordAverage(String word, File reviews) throws Exception {
        //Logic here is very simple, method will return '-1.0' if the word is not found.
        int wordCount = wordCount(word, reviews);
        if (wordCount > 0) {
            return (double) wordTotalScore(word, reviews) / wordCount;
        } else {
            return -1.0;
        }
    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given the specified movie review file.
     *
     * @param wordList
     * @param reviews
     * @return
     * @throws java.lang.Exception
     */
    public static double sentenceAverage(File wordList, File reviews) throws Exception {
        int i = 0;
        String word;
        double sentenceScore = 0;
        int wordCount;
        double wordScore;
        Scanner input = new Scanner(wordList);
        //Similar logic to wordCount method, will ignore any word in the sentence that is not
        //found in MovieReviews.txt
        while (input.hasNextLine()) {
            word = input.nextLine();
            wordCount = wordCount(word, reviews);
            wordScore = wordTotalScore(word, reviews);
            if (wordCount != 0) {
                sentenceScore += wordScore;
                i += wordCount;
            }
        }
        return sentenceScore / i;
    }

    /**
     * This method returns the best and/or worst word in a file.
     *
     * @param wordList
     * @param reviews
     * @param best
     * @return
     * @throws Exception
     */
    public static String[] wordMagnitude(File wordList, File reviews, boolean best) throws Exception {
        double wordScore;
        Scanner input = new Scanner(wordList);
        String word = input.nextLine();
        String[] wordAndScore = {Double.toString(wordAverage(word, reviews)), word};
        //Loops until a word with a valid score is found.
        while (wordAndScore[0].equals("-1.0")) {
            word = input.nextLine();
            wordAndScore[0] = Double.toString(wordAverage(word, reviews));
            wordAndScore[1] = word;
        }

        if (best) {
            while (input.hasNextLine()) {
                word = input.nextLine();
                //The while condition can either be 'if score == -1' or 'if count == 0'
                //I chose the latter.
                while (wordCount(word, reviews) == 0) {
                    word = input.nextLine();
                }
                wordScore = wordAverage(word, reviews);
                if (wordScore > Double.parseDouble(wordAndScore[0])) {
                    wordAndScore[0] = Double.toString(wordScore);
                    wordAndScore[1] = word;
                } else if (wordScore == Double.parseDouble(wordAndScore[0])) {
                    if (!(wordAndScore[1].contains(word))) {
                        wordAndScore[1] = wordAndScore[1] + " + " + word;
                    }
                }
            }

        } //I rewrote the same code twice because i didn't want the method to keep checking
        //what the value (best) was. 
        else {
            while (input.hasNextLine()) {
                word = input.nextLine();
                while (wordCount(word, reviews) == 0) {
                    word = input.nextLine();
                }
                wordScore = wordAverage(word, reviews);
                if (wordScore < Double.parseDouble(wordAndScore[0])) {
                    wordAndScore[0] = Double.toString(wordScore);
                    wordAndScore[1] = word;
                } else if (wordScore == Double.parseDouble(wordAndScore[0])) {
                    if (!(wordAndScore[1].contains(word))) {
                        wordAndScore[1] = wordAndScore[1] + " + " + word;
                    }
                }
            }
        }
        return wordAndScore;
    }
}
