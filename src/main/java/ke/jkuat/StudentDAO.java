package ke.jkuat;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    //add student data
    public int insert(Student student) {
        String sql = "INSERT INTO students(first_name,last_name,year_of_study,semester_of_study,program_of_study)VALUES('"
                + student.getFirstName() + "','" + student.getLastName() + "','"
                + student.getYearOfStudy() + "','" + student.getSemesterOfStudy()
                + "','" + student.getProgramOfStudy() + "');";
        return template.update(sql);
    }

    //edit student data
    public int update(Student student) {
        String sql = "UPDATE students SET first_name='"
                + student.getFirstName() + "',last_name='" + student.getLastName() + "',year_of_study='"
                + student.getYearOfStudy() + "',semester_of_study='" + student.getSemesterOfStudy() + "',program_of_study='"
                + student.getProgramOfStudy() + "'WHERE idstudents='" + student.getId() + "';";
        return template.update(sql);
    }

    //delete student
    public int delete(int id) {
        String sql = "DELETE FROM students WHERE idstudents='" + id + "';";
        return template.update(sql);
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE idstudents=?;";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
    }

    public List<Student> getStudents() {
        final String sql = "SELECT * FROM students";
        return template.query(sql, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();

                student.setId(rs.getInt("idstudents"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setYearOfStudy(rs.getInt("year_of_study"));
                student.setSemesterOfStudy(rs.getInt("semester_of_study"));
                student.setProgramOfStudy(rs.getString("program_of_study"));

                return student;
            }

        });
    }
}
