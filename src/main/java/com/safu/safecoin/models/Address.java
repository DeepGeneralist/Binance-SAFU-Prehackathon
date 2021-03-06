package com.safu.safecoin.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String addr;
    private String proof;
    private String coin; // type of coin
    //private File image; // not implemented
    private String reporterId; // the first one reported the bad address
    private Set<String> approverIds; // users who concurred with the reporter
    private double score;
    private String scamType;
}
