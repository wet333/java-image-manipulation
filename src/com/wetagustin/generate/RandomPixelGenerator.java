package com.wetagustin.generate;

import com.wetagustin.colors.RGBColors;

import java.awt.image.BufferedImage;

public class RandomPixelGenerator {

    public static void polycolor(BufferedImage image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int r = (int) (Math.random()*255);
                int g = (int) (Math.random()*255);
                int b = (int) (Math.random()*255);
                image.setRGB(i, j, RGBColors.getRGBA(r,g,b, 255));
            }
        }
    }

    public static void greyscale(BufferedImage image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int value = (int) (Math.random()*255);
                image.setRGB(i, j, RGBColors.getRGBA(value, value, value, 255));
            }
        }
    }

}
