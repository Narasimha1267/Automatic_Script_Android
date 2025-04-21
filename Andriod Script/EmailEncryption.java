package SyraHealth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

//package SyraHealth;
public class EmailEncryption {

    // Method to generate a new AES key
    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);  // AES key size of 128 bits
        return keyGenerator.generateKey();
    }

    // Method to encrypt email content
    public static String encryptEmail(String emailContent, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(emailContent.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt email content
    public static String decryptEmail(String encryptedEmailContent, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedEmailContent);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
            // Original email content
            String emailContent = "ver1@gmail.com";

            // Generate a new AES key
            SecretKey secretKey = generateAESKey();

            // Encrypt the email content
            String encryptedEmail = encryptEmail(emailContent, secretKey);
            System.out.println("Encrypted Email: " + encryptedEmail);

            // Decrypt the email content (for testing)
            String decryptedEmail = decryptEmail(encryptedEmail, secretKey);
            System.out.println("Decrypted Email: " + decryptedEmail);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
