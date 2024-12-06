package com.karthik.security.security;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTToken {
	
	private String secretkey;
	public JWTToken() {
		secretkey =generateSecretKey();
	}
	
	public String generateSecretKey() {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
			SecretKey secretkey = keyGen.generateKey();
			System.out.println(secretkey);
			
			return Base64.getEncoder().encodeToString(secretkey.getEncoded());
		}
		catch(Exception e)
		{
			throw new RuntimeException("error generating secret key");
			
	}
		
		
	}
	
	private static final String SECRET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	public Key getKey() {
		
		byte[] keyBytes = Decoders.BASE64.decode(secretkey);
		return Keys.hmacShaKeyFor(keyBytes);
		
		
	}

	public String generateToken(String euser) {
		
		Map<String,Object> claims = new HashMap<>();
		
		return Jwts.builder()
		           .claims(claims)
		           .subject(euser)
		           .issuedAt(new Date(System.currentTimeMillis()))
		           .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 3))
		           .signWith(getKey())
		           .compact();

		//HS256 are symetric key
		//.signature(Key key, SignatureAlogorithm.HS256) depricated 
		//.SetSubject(euser) also depricated so use the 
		
		

	}
	
	
	
	
	
	

}
