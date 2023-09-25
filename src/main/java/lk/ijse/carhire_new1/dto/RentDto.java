package lk.ijse.carhire_new1.dto;

import lk.ijse.carhire_new1.entity.CarEntity;
import lk.ijse.carhire_new1.entity.CustomerEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class RentDto {
    private String id;

    private CarEntity carEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustID", nullable = false)
    private CustomerEntity customerEntity;


    @Column(name="TotPrice", nullable = false)
    private Integer totPrice;

    @Column(name="AdvAmount",  nullable = false)
    private Integer advAmount;

    @Column(name="BalAmount",  nullable = false)
    private Integer balAmount;

    @Column(name="RefDeposit", nullable = false)
    private Integer refDeposit;

    @CreationTimestamp
    @Column(name="OrderDate", nullable = false)
    private Date orderDate;

    @Column(name="FromDate", nullable = false)
    private Date fromDate;

    @Column(name="ToDate", nullable = false)
    private Date toDate;

    @Column(name="IsReturned", length = 5)
    private boolean isReturned;

}
