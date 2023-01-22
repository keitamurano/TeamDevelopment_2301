import com.example.demo.form.String;

public class ExpencesEntity{

    // 予約データの主キーはユーザーID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private Date applicationDate;

    private String expencesItem;

    private Integer amountMoney;

    private String remarks;
}