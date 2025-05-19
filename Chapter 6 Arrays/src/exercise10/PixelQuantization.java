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
            if (originalColorList[i] >= 0 && originalColorList[i] <= 20) {
                temporaryColorList[i] = 10;
            }

            if (originalColorList[i] > 20 && originalColorList[i] <= 40) {
                temporaryColorList[i] = 10;
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
