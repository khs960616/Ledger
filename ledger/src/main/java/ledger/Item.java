package ledger;

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
@Table(name ="item")
public class Item implements Serializable {
    private static final long serialVersionUID = -6729987133621315053L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long itemId;

    @Column(nullable = false)
    private String itemName;
}