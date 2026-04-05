package itm.edu.ejemploSpringboot1.RepositoriesSQL;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;
import itm.edu.ejemploSpringboot1.Utilities.Conexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteRepositorySQL {
    //Aplicamos el patrón DAO: data access object, transforma objetos en registros de base de datos
    //y registros de base de datos en objetos

    //forma de inyertar la de dependencia de manera automatica
    @Autowired
    private EstudianteRepositoryHelper estudianteRepositoryHelper;

    public List<Estudiante> getEstudiantes() {
        List<Estudiante> result = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement(estudianteRepositoryHelper.listarEstudiantes());
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(resultSet.getInt("idEstudiante"));
                estudiante.setNombres(resultSet.getString(2));
                estudiante.setApellidos(resultSet.getString(3));
                estudiante.setCedula(resultSet.getString(4));
                estudiante.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                result.add(estudiante);
            }

        }catch (SQLException exception){
            exception.printStackTrace();
        }finally{
            try{
                connection.close();
                preparedStatement.close();
            }catch (SQLException exc){
                exc.printStackTrace();
            }catch (Exception ladenull){

            }
        }

        return result;
    }

    public Estudiante insertarEstudiante(Estudiante estudiante){
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        PreparedStatement preparedStatement = null;
        try{

            preparedStatement = connection.prepareStatement(estudianteRepositoryHelper.insertarEstudiante());
            preparedStatement.setInt(1, estudiante.getIdEstudiante());
            preparedStatement.setString(2, estudiante.getNombres());
            preparedStatement.setString(3, estudiante.getApellidos());
            preparedStatement.setString(4, estudiante.getCedula());
            preparedStatement.setString(5, estudiante.getEmail());
            preparedStatement.setString(6, estudiante.getCelular());

            preparedStatement.execute();

        }catch(SQLException sqlException){
            estudiante = null;
            sqlException.printStackTrace();
        }finally{
            try{
                connection.close();
                preparedStatement.close();
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
        return estudiante;
    }

}
