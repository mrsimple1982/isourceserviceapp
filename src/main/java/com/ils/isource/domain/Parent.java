package com.ils.isource.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A Parent.
 */
@Entity
@Table(name = "parent")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Parent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private Instant dateOfBirth;

    @Column(name = "parent_mobile_number")
    private String parentMobileNumber;

    @Column(name = "parent_email")
    private String parentEmail;

    @Column(name = "approval_status")
    private Boolean approvalStatus;

    @Column(name = "student_id")
    private String studentId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Parent name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public Parent dateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getParentMobileNumber() {
        return parentMobileNumber;
    }

    public Parent parentMobileNumber(String parentMobileNumber) {
        this.parentMobileNumber = parentMobileNumber;
        return this;
    }

    public void setParentMobileNumber(String parentMobileNumber) {
        this.parentMobileNumber = parentMobileNumber;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public Parent parentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
        return this;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Boolean isApprovalStatus() {
        return approvalStatus;
    }

    public Parent approvalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public Parent studentId(String studentId) {
        this.studentId = studentId;
        return this;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parent)) {
            return false;
        }
        return id != null && id.equals(((Parent) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Parent{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", parentMobileNumber='" + getParentMobileNumber() + "'" +
            ", parentEmail='" + getParentEmail() + "'" +
            ", approvalStatus='" + isApprovalStatus() + "'" +
            ", studentId='" + getStudentId() + "'" +
            "}";
    }
}
