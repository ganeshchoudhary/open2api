package com.gschoudhary.open2api.domain;

import com.gschoudhary.open2api.enums.AuthType;
import com.gschoudhary.open2api.enums.MethodType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ApiConfigEntity")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiConfigEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter(AccessLevel.NONE)
    private String apiUniqueCode;

    private String apiUrl;

    @Enumerated(EnumType.STRING)
    private MethodType methodType;

    @Enumerated(EnumType.STRING)
    private AuthType authType;

    private String  mediaType;

    private String jsonObject;

    private String authApiCode;

    private String apiCode;



}
