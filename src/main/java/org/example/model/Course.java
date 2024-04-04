package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    double datetime;
    double open;
    double high;
    double low;
    double clos;
    long volume;
}

