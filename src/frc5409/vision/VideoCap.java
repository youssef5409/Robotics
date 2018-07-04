///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package frc5409.vision;
//
///**
// *
// * @author GWS-Student_2
// */
//import java.awt.image.BufferedImage;
//import org.opencv.core.Core;
//import org.opencv.videoio.VideoCapture;
//
//public class VideoCap {
//    static{
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//    }
//
//    VideoCapture cap;
//    MatToImage mat2Img = new MatToImage();
//    
//
//    VideoCap(){
//        cap = new VideoCapture();
//        cap.open(0);
//    } 
// 
//    BufferedImage getOneFrame() {
//        cap.read(mat2Img.mat);
//        mat2Img.process();
//        return mat2Img.getImage(mat2Img.mat);
//
//    }
//}