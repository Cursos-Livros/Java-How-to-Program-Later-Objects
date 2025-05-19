package exercise11;

import java.util.Random;

public class OnedimensionalArrayOperation {
    public static void main(String[] args) {
        int[] arrayScores = new int[20];

        arrayScores = generateScores(arrayScores);
        setToZero(arrayScores);
        multiply2(arrayScores);
        setScore(arrayScores);
        //showBestScore(arrayScores);
    }

    public static int[] generateScores(int[] arrayScores) {
        Random random = new Random();
        int randomScore = random.nextInt(100);

        int[] temporaryArrayScores = arrayScores;

        for (int i = 0; i < temporaryArrayScores.length; i++) {
            temporaryArrayScores[i] = randomScore;
            randomScore = random.nextInt(100);
        }

        return temporaryArrayScores;
    }

    public static void setToZero(int[] arrayScores) {
        for (int i = 9; i < arrayScores.length; i++) {
            arrayScores[i] = 0;
        }
    }

    public static void multiply2(int[] arrayScores) {
        for (int i = 0; i < arrayScores.length; i++) {
            arrayScores[i] *= 2;
        }
    }

   public static int[] setScore(int[] arrayScore){
        int[] bestScore = arrayScore;

        for(int i=0 i<bestScore.length; i++){

        }
   }
}
