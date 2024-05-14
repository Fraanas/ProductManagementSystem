package com.uep.wap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "Return")
public class Return{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long returnId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDate;

    //OneToOne relationship with Order
    @OneToOne(mappedBy = "orderReturn", cascade = CascadeType.ALL, orphanRemoval = true)
    private Order orders;

    public enum ReturnStatus {
        RECEIVED, AUTHORIZED, REFUND, CLOSED
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Return.ReturnStatus status;

    //getters and setters
    public Long getReturnId() {
        return returnId;
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public ReturnStatus getStatus() {
        return status;
    }

    public void setStatus(ReturnStatus status) {
        this.status = status;
    }
}



