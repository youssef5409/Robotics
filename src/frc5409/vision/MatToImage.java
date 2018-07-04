///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package frc5409.vision;
//
//import java.awt.image.BufferedImage;
//import java.util.ArrayList;
//import java.util.Iterator;
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfKeyPoint;
//import org.opencv.core.MatOfPoint;
//import org.opencv.core.Point;
//import org.opencv.core.Rect;
//import org.opencv.core.Scalar;
//import org.opencv.core.Size;
//import org.opencv.imgproc.Imgproc;
//
//public final class MatToImage {
//
//    Mat mat = new Mat();
//    //Mat brightness;
//    Mat hsvOutput;
//    Mat cvErodeOutput;
//    ArrayList<MatOfPoint> contours;
//    
//    Rect rec1;
//    
//    //Mat cvResizeOutput = new Mat();
//    BufferedImage img;
//    GripPipeline pipe;
//    byte[] dat;
//    
//    public MatToImage() {
//        pipe = new GripPipeline();
//    }
//
//    public MatToImage(Mat mat) {
//        pipe = new GripPipeline();
//        getSpace(mat);
//    }
//
//    public void process() {
//        
//        cvColour(mat, mat);
//       // brightness = new Mat(mat.rows(), mat.cols(), mat.type());
//       // mat.convertTo(brightness, -1, 1, -25);
//        pipe.process(mat);
//        hsvOutput = pipe.hsvThresholdOutput();
//        cvErodeOutput = pipe.cvErodeOutput();
//        
//        
//        
//        contours = new ArrayList();
//        Imgproc.findContours(cvErodeOutput, contours, new Mat(), Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);
//        
//        
//        for (Iterator<MatOfPoint> iterator = contours.iterator(); iterator.hasNext();) {
//            MatOfPoint matOfPoint = (MatOfPoint) iterator.next();
//            if (matOfPoint.width() * matOfPoint.height() < 70) {
//                iterator.remove();
//            }
//        }
//        
//        System.out.println(contours.size());
//
//        for(int i = 0;i < contours.size(); i++){
//            Rect temp = Imgproc.boundingRect(contours.get(i));
//            Imgproc.rectangle(mat, temp.tl(), temp.br(), new Scalar(255,0,0));
//        }
//        
////        if (contours.size() == 1) {
////            rec1 = Imgproc.boundingRect(contours.get(0));
////            Imgproc.rectangle(mat, rec1.tl(), rec1.br(), new Scalar(255,0,0));
////            System.out.println("TargetFound at X:" + (rec1.tl().x + rec1.br().x) / 2 + "Y:" + (rec1.tl().y + rec1.br().y) / 2);
////            
////            if((rec1.tl().x + rec1.br().x)/2 < mat.cols()/2){
////                System.out.println("Go Left By:" + (mat.cols()/2 - (rec1.tl().x + rec1.br().x)/2));
////            }else if((rec1.tl().x + rec1.br().x)/2 > mat.cols()/2){
////                System.out.println("Go Right By:" + ((rec1.tl().x + rec1.br().x)/2- mat.cols()/2) );
////            }
////        }
//
//    }
//
//    public void getSpace(Mat mat) {
//        this.mat = mat;
//        int w = this.mat.cols(), h = this.mat.rows();
//        if (dat == null || dat.length != w * h * 3) {
//            dat = new byte[w * h * 3];
//        }
//        if (img == null || img.getWidth() != w || img.getHeight() != h
//                || img.getType() != BufferedImage.TYPE_3BYTE_BGR) {
//            img = new BufferedImage(w, h,
//                    BufferedImage.TYPE_3BYTE_BGR);
//        }
//    }
//
//    public void hsvThresholdProcess() {
//        // Step HSV_Threshold0:
//        Mat hsvThresholdInput = this.mat;
//        double[] hsvThresholdHue = {160.25179856115105, 180.0};
//        double[] hsvThresholdSaturation = {96.31294964028777, 255.0};
//        double[] hsvThresholdValue = {0.0, 60.0};
//        hsvThreshold(hsvThresholdInput, hsvThresholdHue, hsvThresholdSaturation, hsvThresholdValue, this.mat);
//    }
//
//    private void rectangleMakeThing() {
//        //Imgproc.rectangle(cvErodeOutput, new Point(mat.cols() / 2 - 20, mat.rows() / 2 - 20), new Point(mat.cols() / 2 + 20, mat.rows() / 2 + 20), new Scalar(0, 255, 0), 1);
//        Imgproc.circle(mat, new Point(mat.cols() / 2, mat.rows() / 2), 25, new Scalar(255, 0, 0));
//    }
//
//    private void hsvThreshold(Mat input, double[] hue, double[] sat, double[] val,
//            Mat out) {
//        Imgproc.cvtColor(input, out, Imgproc.COLOR_BGR2HSV);
//        Core.inRange(out, new Scalar(hue[0], sat[0], val[0]),
//                new Scalar(hue[1], sat[1], val[1]), out);
//    }
//
//    private void cvColour(Mat src, Mat dst) {
//        Imgproc.cvtColor(src, dst, Imgproc.COLOR_RGB2BGR);
//    }
//
//    private void cvResize(Mat src, Size dSize, double fx, double fy, int interpolation,
//            Mat dst) {
//        Imgproc.resize(src, dst, dSize, fx, fy, interpolation);
//    }
//
//    BufferedImage getImage(Mat mat) {
//        getSpace(mat);
//        mat.get(0, 0, dat);
//        img.getRaster().setDataElements(0, 0,
//                mat.cols(), mat.rows(), dat);
//        return img;
//    }
//
//    static {
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//    }
//}
