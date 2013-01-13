/*
 * Problem Statement:
 * (Enforcing Privacy with Cryptography)
 * The explosive growth of Internet communications and data storage on Internet-connected computers has greatly increased privacy concerns.
 * The field of cryptography is concerned with coding data to make it difficult (and hopefullyâwith the most advanced schemesâimpossible) for unauthorized users to read.
 * In this exercise youâll investigate a simple scheme for encrypting and decrypting data.
 * A company that wants to send data over the Internet has asked you to write a program that will encrypt it so that it may be transmitted more securely.
 * All the data is transmitted as four-digit integers.
 * Your application should read a four-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10.
 * Then swap the first digit with the third, and swap the second digit with the fourth.
 * Then print the encrypted integer.
 * Write a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.
 * [Optional reading project: Research âpublic key cryptographyâ in general and the PGP (Pretty Good Privacy) specific public key scheme. You may also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 */
import java.util.Scanner;

public class PrivacyWithCrypto {
	public static void main(String[] args) {
		String data;
		String interData = new String();
		String encData = new String();

		Scanner input = new Scanner(System.in);
		data = input.next();

		for (int i = 0; i < data.length(); i++) {
			int digit = (data.charAt(i) - '0' +  7) % 10;
			System.out.println(data.charAt(i) + " " + digit);
			encData = encData + String.valueOf(digit);
		}
		System.out.println(encData);

		char [] arr = encData.toCharArray();
		System.out.println(arr);
		for (int i = 0; i < encData.length() / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[i + 2];
			arr[i + 2] = temp;
		}
		encData = new String(arr);

		System.out.println(encData);
	}
}
