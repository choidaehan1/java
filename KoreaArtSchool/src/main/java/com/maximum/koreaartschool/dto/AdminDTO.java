package com.maximum.koreaartschool.dto;

import com.maximum.koreaartschool.entity.AdminEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminDTO {
    private String admin_id;
    private String pswd;

    public static AdminDTO toAdminDTO(AdminEntity adminEntity) {
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setAdmin_id(adminEntity.getAdminID());
        adminDTO.setPswd(adminEntity.getPswd());
        return adminDTO;
    }
}
