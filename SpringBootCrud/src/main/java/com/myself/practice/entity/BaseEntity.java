package com.myself.practice.entity;

import java.sql.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@Data
@MappedSuperclass
public class BaseEntity {
private Date createdOn;
private Date ModifiedOn;
private boolean isDelete;
}
