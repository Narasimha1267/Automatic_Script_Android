package SyraHealth;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;

public class DynamicEmailEncryptor {

    // AES Encryption/Decryption class
    public static class EasyAES {
        private String key;
        private IvParameterSpec iv;
        private Cipher cipher;
        
        public EasyAES(String key, String iv) throws Exception {
            this.key = key;
            this.iv = new IvParameterSpec(iv.getBytes());
            this.cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        }
        
        public String encrypt(String plainText) throws Exception {
            byte[] encrypted = encryptOrDecrypt(plainText.getBytes(), Cipher.ENCRYPT_MODE);
            return Base64.getEncoder().encodeToString(encrypted);
        }

        public String decrypt(String encryptedText) throws Exception {
            byte[] decodedText = Base64.getDecoder().decode(encryptedText);
            byte[] decrypted = encryptOrDecrypt(decodedText, Cipher.DECRYPT_MODE);
            return new String(decrypted);
        }

        private byte[] encryptOrDecrypt(byte[] inputBytes, int mode) throws Exception {
            // Hash the key to 256 bits
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] keyBytes = md.digest(this.key.getBytes());
            
            // Initialize the AES cipher with hashed key and IV
            SecretKey secretKey = new javax.crypto.spec.SecretKeySpec(keyBytes, "AES");
            cipher.init(mode, secretKey, iv);
            return cipher.doFinal(inputBytes);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs for Email and Encryption details
        System.out.print("Enter the email to encrypt: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter the AES key (32 characters for AES-256): ");
        String key = scanner.nextLine();
        
        System.out.print("Enter the AES initialization vector (IV, 16 characters): ");
        String ivString = scanner.nextLine();

        try {
            // Create AES encryption object
            EasyAES aes = new EasyAES(key, ivString);

            // Encrypt the email
            String encryptedEmail = aes.encrypt(email);
            System.out.println("Encrypted Email: " + encryptedEmail);

            // Decrypt the email to verify
            String decryptedEmail = aes.decrypt(encryptedEmail);
            System.out.println("Decrypted Email: " + decryptedEmail);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
