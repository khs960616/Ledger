package ledger.company;

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
@Table(name ="COMPANY_TB")
public class Company implements Serializable {
	private static final long serialVersionUID = -6729987133621315053L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id; //primary key
	@Column
	private String name; //사업체명
	@Column
	private String number; //사업체 전화 번호
	@Column
	private String representative; //대표자명
	@Column
	private String bankName; //은행명
	@Column
	private String accountNumber; //사업체 계좌번호
	@Column
	private String registrationNumber; //사업체 등록번호
	@Column
	private String location; //사업체 위치
}
