package com.app.dao;

import com.app.dto.PermissionDTO;
import com.app.interfaces.CRUD;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class PermissionDAO implements CRUD<PermissionDTO> {

    private static PreparedStatement pstmt;
    private static ResultSet rs;
    private static Connection conn = new ConnectionDB().getDB();

    ;

    @Override
    public void create(PermissionDTO obj) {

        String queryCreate = "INSERT INTO log_permission(permissionName) values(?)";

        try {

            pstmt = conn.prepareStatement(queryCreate);
            pstmt.setString(1, obj.getPermissionName());
            int row = pstmt.executeUpdate();

            if (row > 0) {
                System.out.println("Sucesso ao salvar os dados.");
            } else {
                System.out.println("Erro ao tentar ao salvar os dados.");
            }

        } catch (Exception e) {

            System.out.println("Erro ao tentar salvar dados: " + e.getMessage());

        }
    }

    @Override
    public List<PermissionDTO> read() {

        String querySelect = "SELECT * FROM log_permission";
        List<PermissionDTO> list = new ArrayList<>();

        try {

            pstmt = conn.prepareStatement(querySelect);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                PermissionDTO objDTO = new PermissionDTO();
                objDTO.setPermissionId(rs.getInt("permissionId"));
                objDTO.setPermissionName(rs.getString("permissionName"));
                list.add(objDTO);
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {

            System.err.println("Erro ao tentar listar os dados: " + e.getMessage());

        }

        return list;

    }

    @Override
    public void update(PermissionDTO obj) {

    }

    @Override
    public void delete(int id) {

    }

}
