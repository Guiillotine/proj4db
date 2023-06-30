package com.example.proj4db.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Аннотация для подготовки этого объекта к хранению в хранилище данных на основе JPA
@Table(name = "employee")
@Data // Добавить сеттеры геттеры
@NoArgsConstructor
public class Employee {
    @Column(name = "empID")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "empName")
    private String name; // сопоставлены столбцам, которые имеют те же имена, что и сами свойства
    @Column(name = "empRole")
    private String role; // сопоставлены столбцам, которые имеют те же имена, что и сами свойства
    public Employee(String name, String role) { // Если нужно создать сущность, а id ещё нет, хз зачем
        //this.id = id;
        this.name = name;                // Мы используем для создания экземпляров Employee, которые будут сохранены в БД
        this.role = role;
    }
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getRole() {
        return this.role;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
