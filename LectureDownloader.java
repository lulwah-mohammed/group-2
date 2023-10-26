import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class LectureDownloader {
    public static void main(String[] args) {
        String lectureUrl = "https://example.com/lectures/123";
        String savePath = "lecture_123.mp4";

        try {
            downloadLecture(lectureUrl, savePath);
            System.out.println("Lecture downloaded successfully.");
        } catch (IOException e) {
            System.out.println("Failed to download lecture: " + e.getMessage());
        }
    }

    private static void downloadLecture(String lectureUrl, String savePath) throws IOException {
        URL url = new URL(lectureUrl);
        try (InputStream in = url.openStream()) {
            Path outputPath = Path.of(savePath);
            Files.copy(in, outputPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
