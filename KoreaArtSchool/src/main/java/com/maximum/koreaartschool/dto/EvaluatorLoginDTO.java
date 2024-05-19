package com.maximum.koreaartschool.dto;

import com.maximum.koreaartschool.entity.EvaluatorEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EvaluatorLoginDTO {
    private String evlEml;
    private String pwd;

    public static EvaluatorLoginDTO toEvaluatorLoginDTO(EvaluatorEntity evaluatorEntity) {
        EvaluatorLoginDTO evaluatorLoginDTO = new EvaluatorLoginDTO();
        evaluatorLoginDTO.setEvlEml(evaluatorEntity.getEvlEml());
        evaluatorLoginDTO.setPwd(evaluatorEntity.getPwd());
        return evaluatorLoginDTO;
    }
}