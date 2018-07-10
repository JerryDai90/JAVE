package it.sauronsoftware.jave;

import java.io.File;

public class Test {

    public static void main(String[] args) {
//        changeToMp3("z:\\test.amr",
//                "z:\\test.mp3");
        changeToMp3("/Users/jerry/Mix/temp/2_share_vm/test.amr",
                "/Users/jerry/Mix/temp/2_share_vm/test.mp3");
    }


    public static void changeToMp3(String sourcePath, String targetPath) {
        File source = new File(sourcePath);
        File target = new File(targetPath);
        AudioAttributes audio = new AudioAttributes();
        Encoder encoder = new Encoder();
        audio.setCodec("libmp3lame");
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        try {
            encoder.encode(source, target, attrs);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InputFormatException e) {
            e.printStackTrace();
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }
}
