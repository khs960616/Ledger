package ledger.company;
import ledger.bank.Bank;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

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
@Table(name ="company")
public class Company implements Serializable {
    private static final long serialVersionUID = -6729987133621315053L;

    @Id @GeneratedValue(strategy  =GenerationType.IDENTITY)
    @Column
    private Long companyId;

    @Column(nullable = false)
    private String companyName;

    @Column
    private String companyNumber;

    @Column
    private String representative;

    @Column
    private String resgistrationNumber;

    @Column
    private String location;

    @ManyToOne
    @JoinColumn(name="bank_id")
    private Bank bank;

    @Column
    private String accountNumber;

}