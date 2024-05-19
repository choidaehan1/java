package com.maximum.koreaartschool.service;

import com.maximum.koreaartschool.dto.AdminDTO;
import com.maximum.koreaartschool.dto.EvaluatorLoginDTO;
import com.maximum.koreaartschool.entity.AdminEntity;
import com.maximum.koreaartschool.entity.EvaluatorEntity;
import com.maximum.koreaartschool.repository.AdminRepository;
import com.maximum.koreaartschool.repository.EvaluatorLoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class LoginService {
    private final AdminRepository AdminRepository;
    private final EvaluatorLoginRepository EvaluatorLoginRepository;
    public AdminDTO adminLogin(AdminDTO adminDTO) {
    /*
        1. 회원이 입력한 아이디로 db에서 조회를 함
        2. db에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
    */
        Optional<AdminEntity> byAdminAdminId = AdminRepository.findByAdminID(adminDTO.getAdmin_id());
        if(byAdminAdminId.isPresent()) {
            // 조회 결과가 있다(해당 아이디를 가진 회원 정보가 있다)
            AdminEntity adminEntity = byAdminAdminId.get();
            if( adminEntity.getPswd().equals(adminDTO.getPswd()) ) {
                // 비밀번호가 일치한다
                // entity -> dto 변환 후 리턴
                AdminDTO dto = AdminDTO.toAdminDTO(adminEntity);
                return dto;

            } else {
                // 비밀번호 불일치(로그인실패)
                return null;
            }
        } else {
            // 조회 결과가 없다.(해당 아이디를 가진 회원 정보가 없다)
            return null;
        }
    }

    public EvaluatorLoginDTO evaluatorLogin(EvaluatorLoginDTO evaluatorLoginDTO) {
    /*
        1. 회원이 입력한 아이디로 db에서 조회를 함
        2. db에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
    */
        Optional<EvaluatorEntity> byEvaluatorEvlEml = EvaluatorLoginRepository.findByEvlEml(evaluatorLoginDTO.getEvlEml());
        if(byEvaluatorEvlEml.isPresent()) {
            // 조회 결과가 있다(해당 아이디를 가진 회원 정보가 있다)
            EvaluatorEntity evaluatorEntity = byEvaluatorEvlEml.get();
            if( evaluatorLoginDTO.getPwd().equals(evaluatorLoginDTO.getPwd()) ) {
                // 비밀번호가 일치한다
                // entity -> dto 변환 후 리턴
                EvaluatorLoginDTO dto = EvaluatorLoginDTO.toEvaluatorLoginDTO(evaluatorEntity);
                return dto;

            } else {
                // 비밀번호 불일치(로그인실패)
                return null;
            }
        } else {
            // 조회 결과가 없다.(해당 아이디를 가진 회원 정보가 없다)
            return null;
        }
    }
}
