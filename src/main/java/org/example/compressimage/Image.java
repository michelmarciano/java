package org.example.compressimage;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.util.Iterator;

public class Image {

    static final float MAX_COMPRESSION_SIZE = 2000; //XMB
    static final float IMAGE_QUALITY = 0.9f; //%

    public Image() {

    }

    public static byte[] compressImage(byte[] bytes, float imageQuality) throws IOException {

        float kbSize = bytes.length / 1024f;

        if (kbSize <= MAX_COMPRESSION_SIZE || imageQuality <= IMAGE_QUALITY) {
            return bytes;
        } else {
            //https://docs.oracle.com/javase/7/docs/api/java/io/ByteArrayOutputStream.html
            // data is written into a byte array
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            // Get image writers
            Iterator<ImageWriter> imageWriters = ImageIO.getImageWritersByFormatName("jpg"); // Input your Format Name here

            if (!imageWriters.hasNext()) {
                throw new IllegalStateException("Writers Not Found!!");
            }
            //https://docs.oracle.com/javase/7/docs/api/javax/imageio/ImageWriter.html
            ImageWriter imageWriter = imageWriters.next();
            ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(outputStream);
            imageWriter.setOutput(imageOutputStream);

            ImageWriteParam imageWriteParam = imageWriter.getDefaultWriteParam();

            // Set the compress quality metrics
            imageWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            imageWriteParam.setCompressionQuality(imageQuality);

            // Create the buffered image
            InputStream inputStream = new ByteArrayInputStream(bytes);
            BufferedImage bufferedImage = ImageIO.read(inputStream);

            //Remove alpha channel to avoid (bogus input errors)
            //what is - https://www.makeuseof.com/tag/alpha-channel-images-mean/

            // Compress and insert the image into the byte array.
            imageWriter.write(null, new IIOImage(bufferedImage, null, null), imageWriteParam);

            // close all streams !important
            inputStream.close();
            outputStream.close();
            imageOutputStream.close();
            imageWriter.dispose();

            bytes = outputStream.toByteArray();

            return compressImage(bytes, imageQuality - .05f);
        }

    }

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/mmarciano/Downloads/imagens/fogao.JPG");

        byte[] orgImage = Files.readAllBytes(file.toPath());

        System.out.println("ORG image Bytes(KB): " + orgImage.length / 1024f);

        byte[] afterImage = Image.compressImage(orgImage, 1);

        System.out.println("AFTER image Bytes(KB): " + afterImage.length / 1024f);
    }


}
