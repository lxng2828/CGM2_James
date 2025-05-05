package l19_StringVaRegex.CrawlDanhSachBaiHat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongCrawler {

    public static void main(String[] args) {

        try {
            URL targetUrl = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            Scanner scanner = new Scanner(new InputStreamReader(targetUrl.openStream()));
            scanner.useDelimiter("\\Z");
            String pageContent = scanner.next();
            scanner.close();

            pageContent = pageContent.replaceAll("\\n+", "");

            Pattern songPattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher songMatcher = songPattern.matcher(pageContent);

            System.out.println("Danh sach bai hat tim thay:");
            while (songMatcher.find()) {
                System.out.println(songMatcher.group(1));
            }

        } catch (MalformedURLException e) {
            System.err.println("Loi: URL khong hop le.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Loi: Khong the doc noi dung tu URL.");
            e.printStackTrace();
        }
    }
}