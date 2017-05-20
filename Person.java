/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    , @NamedQuery(name = "Person.findByPrsId", query = "SELECT p FROM Person p WHERE p.prsId = :prsId")
    , @NamedQuery(name = "Person.findByPrsfirstName", query = "SELECT p FROM Person p WHERE p.prsfirstName = :prsfirstName")
    , @NamedQuery(name = "Person.findByPrsSurname", query = "SELECT p FROM Person p WHERE p.prsSurname = :prsSurname")
    , @NamedQuery(name = "Person.findByPrsAge", query = "SELECT p FROM Person p WHERE p.prsAge = :prsAge")
    , @NamedQuery(name = "Person.findByPrsGender", query = "SELECT p FROM Person p WHERE p.prsGender = :prsGender")
    , @NamedQuery(name = "Person.findByPrsFriends", query = "SELECT p FROM Person p WHERE p.prsFriends = :prsFriends")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prs_id")
    private Integer prsId;
    @Column(name = "prs_firstName")
    private String prsfirstName;
    @Column(name = "prs_surname")
    private String prsSurname;
    @Column(name = "prs_age")
    private Integer prsAge;
    @Column(name = "prs_gender")
    private String prsGender;
    @Column(name = "prs_friends")
    private String prsFriends;

    public Person() {
    }

    public Person(Integer prsId) {
        this.prsId = prsId;
    }

    public Integer getPrsId() {
        return prsId;
    }

    public void setPrsId(Integer prsId) {
        this.prsId = prsId;
    }

    public String getPrsfirstName() {
        return prsfirstName;
    }

    public void setPrsfirstName(String prsfirstName) {
        this.prsfirstName = prsfirstName;
    }

    public String getPrsSurname() {
        return prsSurname;
    }

    public void setPrsSurname(String prsSurname) {
        this.prsSurname = prsSurname;
    }

    public Integer getPrsAge() {
        return prsAge;
    }

    public void setPrsAge(Integer prsAge) {
        this.prsAge = prsAge;
    }

    public String getPrsGender() {
        return prsGender;
    }

    public void setPrsGender(String prsGender) {
        this.prsGender = prsGender;
    }

    public String getPrsFriends() {
        switch (prsFriends) {
            case "2": System.out.println("Pera"); break;
        }
        return prsFriends;
    }

    public void setPrsFriends(String prsFriends) {
        this.prsFriends = prsFriends;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsId != null ? prsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.prsId == null && other.prsId != null) || (this.prsId != null && !this.prsId.equals(other.prsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return prsfirstName + " " + prsSurname + ", age: " + prsAge + ", " + prsGender + ", friends: " + prsFriends;
    }

    
    
}
