package ledger.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="user")
public class User implements Serializable {
	private static final long serialVersionUID = -6729987133621315053L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long userId; //primary key
	
	@Column
	private String email; //로그인시 사용
	@Column
	private String password; //로그인 기능 구현시 사용
	
	@Column
	private String userName; //예금주명
	@Column
	private String bankName; //은행명
	@Column
	private String accountNumber; // 계좌번호
	@Column
	private String businessNumber; //업장 전화 번호
}
