package com.wetagustin;

import com.wetagustin.colors.RGBColors;
import com.wetagustin.generate.FunctionalPixelGenerator;
import com.wetagustin.generate.RandomPixelGenerator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DemoImageGenerator {
    public static void main(String[] args) {

        BufferedImage image = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_ARGB);

        FunctionalPixelGenerator.sinusoidal(image);

        File imageFile = new File("image.png");
        try {
            ImageIO.write(image, "png", imageFile);
        } catch (IOException e) {
            System.out.println("Error guardando la imagen");
        }

    }
}
