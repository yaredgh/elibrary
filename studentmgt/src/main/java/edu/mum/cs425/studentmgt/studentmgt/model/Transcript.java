package edu.mum.cs425.studentmgt.studentmgt.model;

import javax.persistence.*;

@Entity

public class Transcript {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;

    private String degreeTitle;
    @OneToOne(mappedBy ="transcript", cascade = {CascadeType.ALL})
    Student student;

    public Transcript() {
    }

    public Transcript(Long transcriptId,String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;

    }

    public Long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
