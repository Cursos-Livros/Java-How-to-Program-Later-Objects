/*

 */
package exercise10;

import java.util.Arrays;
import java.util.Random;

public class PixelQuantization {
    public static void main(String[] args) {
        int[] originalColors = new int[9];
        originalColors = fillColor(originalColors.length);

        int[] quantizazedColorList = convertOriginalColorToQuantitazed(originalColors);

        showPixelQuantizationTab(originalColors, quantizazedColorList);
    }

    public static int[] fillColor(int sizeOriginalColors) {
        Random random = new Random();
        int randomColor = random.nextInt(181);
        int[] temporaryOriginalColors = new int[sizeOriginalColors];

        for (int i = 0; i < sizeOriginalColors; i++) {
            temporaryOriginalColors[i] = randomColor;
            randomColor = random.nextInt(181);
        }

        return temporaryOriginalColors;
    }

    public static int[] convertOriginalColorToQuantitazed(int[] originalColorList) {
        int[] temporaryColorList = new int[originalColorList.length];

        for (int i = 0; i < originalColorList.length; i++) {
            if (originalColorList[i] <= 20) {
                temporaryColorList[i] = 10;
            }
            if (originalColorList[i] > 20 && originalColorList[i] <= 40) {
                temporaryColorList[i] = 30;
            }
            if (originalColorList[i] > 40 && originalColorList[i] <= 60) {
                temporaryColorList[i] = 50;
            }
            if (originalColorList[i] > 60 && originalColorList[i] <= 80) {
                temporaryColorList[i] = 70;
            }
            if (originalColorList[i] > 80 && originalColorList[i] <= 100) {
                temporaryColorList[i] = 90;
            }
            if (originalColorList[i] > 100 && originalColorList[i] <= 120) {
                temporaryColorList[i] = 110;
            }
            if (originalColorList[i] > 120 && originalColorList[i] <= 140) {
                temporaryColorList[i] = 130;
            }
            if (originalColorList[i] > 140 && originalColorList[i] <= 160) {
                temporaryColorList[i] = 150;
            }
            if (originalColorList[i] > 161 && originalColorList[i] <= 180) {
                temporaryColorList[i] = 170;
            }
            if (originalColorList[i] > 181) {
                temporaryColorList[i] = 190;
            }
        }
        return temporaryColorList;
    }

    public static void showPixelQuantizationTab(int[] colorList, int[] quantizazedColorList) {
        System.out.println("Pixel Quantization:");
        System.out.printf("-Original - Quantizazed %n");

        for (int i = 0; i < colorList.length; i++) {
            System.out.printf("%d -> %d %n", colorList[i], quantizazedColorList[i]);
        }
    }
}
