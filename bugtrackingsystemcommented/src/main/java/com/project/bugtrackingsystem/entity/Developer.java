package com.project.bugtrackingsystem.entity;

import javax.persistence.*;

import com.project.bugtrackingsystem.dto.BugDTO;
import com.project.bugtrackingsystem.dto.DeveloperDTO;
import com.project.bugtrackingsystem.dto.ProjectDTO;
import com.project.bugtrackingsystem.dto.TestEngineerDTO;
import com.project.bugtrackingsystem.util.BugStatus;
import com.project.bugtrackingsystem.util.Severity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

// Developer entity representing a developer in the bug tracking system
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Developer extends User implements Serializable {

    // Developer's name
    private String devName;

    // Developer's skill set
    private String devSkill;
}

