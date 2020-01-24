package com.analytics.practice.cryptography;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingAlgo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        try(InputStream in = HashingAlgo.class.getResourceAsStream(HashingAlgo.class.getSimpleName())) {
            final byte[] bytes = new byte[1024];
            for (int len=in.read(bytes); len != -1; len=in.read(bytes)) {
                md.update(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        final byte[] hashed = md.digest();
        System.out.println("SHA-256 : " + bytesToHex(hashed) );
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}
