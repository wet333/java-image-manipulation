package com.wetagustin.colors;

public class RGBColors {

    public static int getRGBA(int red, int green, int blue, int alpha) {

        int bits = 0;

        bits = bits | ( red     << 0    );
        bits = bits | ( green   << 8    );
        bits = bits | ( blue    << 16   );
        bits = bits | ( alpha   << 24   );

        return bits;
    }

}
