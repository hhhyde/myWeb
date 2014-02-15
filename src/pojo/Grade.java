package pojo;
// Generated 2012-2-15 21:21:54 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;

/**
 * Grade generated by hbm2java
 */
public class Grade  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<Student> students = new HashSet<Student>(0);

    public Grade() {
    }

    public Grade(String name, Set<Student> students) {
       this.name = name;
       this.students = students;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }




}

