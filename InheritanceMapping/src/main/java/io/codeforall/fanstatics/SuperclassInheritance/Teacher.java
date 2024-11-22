package io.codeforall.fanstatics.SuperclassInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher extends AbstractPerson {

    private String name;
    private Integer age;

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}