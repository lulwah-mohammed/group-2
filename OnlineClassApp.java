import java.awt.AWTException;
import java.io.IOException;
import javax.sound.sampled.*;


public class OnlineClassApp {
    public static void main(String[] args) throws LineUnavailableException, IOException, AWTException, InterruptedException {
        startMicrophone(); // Starts the microphone capture
        
    }

    // Start microphone 
    public static void startMicrophone() throws LineUnavailableException {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, true);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

        if (!AudioSystem.isLineSupported(info)) {
            System.out.println("Microphone is not supported.");
            return;
        }

        TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(info);
        microphone.open(format);
        microphone.start();

        byte[] buffer = new byte[1024];

        System.out.println("Microphone is active. Press Ctrl+C to stop.");

        while (true) {
            int bytesRead = microphone.read(buffer, 0, buffer.length);
            // Process audio data here (not implemented in this example)
        }
    }

}
