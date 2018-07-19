/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
//import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;


/**
 *
 * @author GamingPC
 */
public class FR {
    public static void main(String[] args) {
        System.out.println("CArgar y mostrar imagen de java");
        new Procesar();
    }
    
}
 class Procesar {
    URL img_url = getClass().getResource("/data/lena.jpg");
    String ruta = img_url.getPath();
    
    public Procesar(){
        Mat imagen;
        if (ruta.startsWith("/")) {
           ruta = ruta.substring(1);
       }
       
        imagen = Imgcodecs.imread(ruta,Imgcodecs.CV_LOAD_IMAGE_COLOR);
        if(!imagen.empty()){
            Image imagenMostrar = convertir(imagen);
            int width=imagenMostrar.getWidth(null);
            int height=imagenMostrar.getHeight(null);
            Ventana ventana = new Ventana(imagenMostrar);
            ventana.setSize(width,height);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }
 
    private Image convertir(Mat imagen) {
        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".jpg", imagen, matOfByte); 
 
        byte[] byteArray = matOfByte.toArray();
        BufferedImage bufImage = null;
 
        try {
 
            InputStream in = new ByteArrayInputStream(byteArray);
            bufImage = ImageIO.read(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Image)bufImage;
    }}