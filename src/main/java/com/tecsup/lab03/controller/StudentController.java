package com.tecsup.lab03.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador para la gestión de estudiantes
 */
public class StudentController {
    
    private List<String> studentList;
    
    /**
     * Constructor por defecto
     */
    public StudentController() {
        this.studentList = new ArrayList<>();
    }
    
    /**
     * Registra un nuevo estudiante
     * @param name Nombre del estudiante
     * @return true si el registro fue exitoso
     */
    public boolean registerStudent(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return studentList.add(name);
        }
        return false;
    }
    
    /**
     * Elimina un estudiante por su nombre
     * @param name Nombre del estudiante a eliminar
     * @return true si se eliminó correctamente
     */
    public boolean removeStudent(String name) {
        return studentList.remove(name);
    }
    
    /**
     * Obtiene la lista de todos los estudiantes
     * @return Lista de estudiantes
     */
    public List<String> getAllStudents() {
        return new ArrayList<>(studentList);
    }
    
    /**
     * Busca estudiantes por un término de búsqueda
     * @param searchTerm Término de búsqueda
     * @return Lista de estudiantes que coinciden con el término
     */
    public List<String> searchStudents(String searchTerm) {
        List<String> results = new ArrayList<>();
        
        for (String student : studentList) {
            if (student.toLowerCase().contains(searchTerm.toLowerCase())) {
                results.add(student);
            }
        }
        
        return results;
    }
    
    /**
     * Obtiene el número total de estudiantes
     * @return Cantidad de estudiantes
     */
    public int getStudentCount() {
        return studentList.size();
    }
}
