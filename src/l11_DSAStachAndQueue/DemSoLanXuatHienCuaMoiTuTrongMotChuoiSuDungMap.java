package l11_DSAStachAndQueue;

import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap {

    public static void main(String[] args) {
        String inputText = "Mot con vit xoe ra hai cai canh. Mot con bo no keu be be.";
        String processedText = inputText.toLowerCase().replaceAll("[.,!?;:]", "");

        Map<String, Integer> wordFrequencyMap = new TreeMap<>();

        String[] words = processedText.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            int currentCount = wordFrequencyMap.getOrDefault(word, 0);
            wordFrequencyMap.put(word, currentCount + 1);
        }

        System.out.println("Thong ke tan suat xuat hien cac tu:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println("Tu: " + word + ", So lan xuat hien: " + count);
        }
    }
}
