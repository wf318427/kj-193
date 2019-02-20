package cn.tedu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Emp implements Serializable{
  @Id
  private Long id;
  private String name;
  private Long age;

  public Emp(Long id, String name, Long age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Emp() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
