package org.jspider.taskcourseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {
    String batchCode;
    String subject;
    String faculty;
    int totalClasses;
}
