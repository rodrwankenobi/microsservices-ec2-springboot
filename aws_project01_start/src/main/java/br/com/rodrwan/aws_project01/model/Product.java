package br.com.rodrwan.aws_project01.model;

import javax.persistence.*;

@Table(
        uniqueConstraints = {
                @UniqueConstraints(columnNames = {"code"})
        }
)
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(length = 32, nullable = false)
    private String name;

    @Column(length = 25, nullable = false)
    private String model;

    @Column(length = 8, nullable = false)
    private String code;

    private float price;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
