package com.wetagustin.generate;

import com.wetagustin.colors.RGBColors;

import java.awt.image.BufferedImage;

public class FunctionalPixelGenerator {

    public static void diagonal(BufferedImage image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {

                int value = 0;
                float pendiente = 1;
                if( j == (i * pendiente) ){
                    value = 255;
                }

                image.setRGB(i, j, RGBColors.getRGBA(value, value, value, 255));
            }
        }
    }

    public static void exponential(BufferedImage image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {

                int diff = Math.abs(j - (i*i));
                int value = 255 * ( 1 / ( (diff * diff) + 1) );

                image.setRGB(i, j, RGBColors.getRGBA(value, value, value, 255));
            }
        }
    }

    public static void sinusoidal(BufferedImage image) {

        int rand;
        double aspectRatio = 1920.0 / 1080.0;
        double variation = 0;

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {

                variation = Math.abs(Math.sin(i) * Math.cos(j));
                int value = (int) (255 * variation);

                image.setRGB(i, j, RGBColors.getRGBA(value , value, value, 255));
            }
            System.out.println(variation);
        }
    }

}
