package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static String encode(String txt)
	{
		Encoder encoder=Base64.getEncoder();
		String encoded=encoder.encodeToString(txt.getBytes());
		return encoded;
	}
	public static String decode(String encodeTxt)
	{
		Decoder decoder=Base64.getDecoder();
		byte[] decoded=decoder.decode(encodeTxt);
		return new String(decoded);
		
		
	}
	

}
