package kr.ch11.jwt;

import java.security.Key;
import java.time.Duration;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import kr.ch11.entity.UserEntity;
import lombok.Getter;

/**
 * @author tnugs78901
 * @since 
 * @ JWT를 테스트하기 위한 Mocking 객체
 * 
 */


@Getter
public class JwtMock {

	private String issuer;
	private Key secretKey;
	private Date issuedDate = new Date();
	private Date expireDate = new Date(issuedDate.getTime() + Duration.offHours(1).toMillis());
	
	public JwtMock(String issuer, Key secretKey, Date issuedDate, Date exprieDate) {
			this.issuer = issuer;
			this.secretKey = secretKey;
			this.issuedDate = issuedDate != null ? issuedDate : this.issuedDate;
			this.expireDate = expireDate != null ? exprieDate : this.expireDate;
	}
	
	public String createToken(UserEntity user) {
		
		// 클레임 생성 (비공개)
		Claims claims = Jwts.claims();
		claims.put("uid", user.getUid());
		claims.put("role", user.getRole());
		
		String token = Jwts.builder()
										.setHeaderParam(Header.TYPE, Header.JWT_TYPE)
										.setIssuer(issuer)
										.setIssuedAt(expireDate)
										.setExpiration(expireDate)
										.addClaims(claims)
										.signWith(secretKey, SignatureAlgorithm.HS256)
										.compact();
						
		return token;
	}
}
