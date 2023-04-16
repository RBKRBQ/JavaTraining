package homeworkcurs5;

import java.util.ArrayList;
import java.util.Random;

public class HomeworkCurs5 {
    public void main(String[] args) {

        int[] arrayNumbers = {5, 2, 50, 55, 6};
        int[] arrayNumbersCompare = {5, 2, 50, 55, 6, 9, 90};

for (int i : arrayNumbersCompare) {
    System.out.println(i);
}

        int abc= 5;

        System.out.println(sumOfArrayNumbers(arrayNumbers));
        System.out.println(unevenArrayNumbers(arrayNumbers));
        System.out.println(compareArrayToNumber(arrayNumbersCompare, 30).toString());
        System.out.println(donationsRandom(50, 3));
        phraseToSentences("Never gonna give you up.Never gonna let you down.Never gonna run around and desert you."
                + "Never gonna make you cry.Never gonna say goodbye.Never gonna tell a lie and hurt you.Never gonna give you up."
                + "Never gonna let you down.Never gonna run around and desert you.Never gonna make you cry.Never gonna say goodbye."
                + "Never gonna tell a lie and hurt you");
    }

    public static int sumOfArrayNumbers(int[] arrayNumbers) {
        int i = 0;
        int result = 0;
        for (i = 0; i < arrayNumbers.length; i++) {
            result += arrayNumbers[i];
        }
        return result;
    }

    public static int unevenArrayNumbers(int[] arrayNumbers) {
        int i = 0;
        int result = 0;
        for (i = 0; i < arrayNumbers.length; i++) {
            if (!(arrayNumbers[i] % 2 == 0)) {
                result++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> compareArrayToNumber(int[] arrayNumbers, int number) {
        int i = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > number) {
                result.add(arrayNumbers[i]);
            }
        }
        return result;
    }


    public static String donationsRandom(int donationTarget, int maxDonations) {
        Random r = new Random();
        int donation = 0;
        int donationEvents = 0;

        do {
            donationEvents++;
            //System.out.println("donation events "+donationEvents);
            donation += r.nextInt(donationTarget) + 1;
            //System.out.println("donation "+donation);
            if (donation >= donationTarget) {
                return "Success, donation " + donation + " matches or exceeds the target";
            }
        } while (donationEvents < maxDonations);

        return "Donation campaign has ended";

    }

    public static void phraseToSentences(String phrase) {
        int i = 0;
        String[] sentences = phrase.split("\\.");
        for (i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }

}