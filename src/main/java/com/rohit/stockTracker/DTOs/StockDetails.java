package com.rohit.stockTracker.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@Document
/*
* TODO See how to add DTO to repostry in Mongo DB
* */
public class StockDetails {

    @Field
    private Double OPEN;
    @Field
    private Double HIGH;
    @Field
    private Double LOW;
    @Field
    private Double PREVIOUS_CLOSE;
    @Field
    private Double CLOSE;
    @Field
    private Double WEEK_HIGH_52;
    @Field
    private Double WEEK_LOW_52;
    @Field
    private Double GAP_UP;
    @Field
    private Date DATE;
    @Field
    private Double PREVIOUSCLOSE_TO_OPEN;
    @Field
    private Double OPEN_TO_HIGH;
    @Field
    private Double OPEN_TO_LOW;
    @Field
    private Double OPEN_TO_CLOSE;
}
