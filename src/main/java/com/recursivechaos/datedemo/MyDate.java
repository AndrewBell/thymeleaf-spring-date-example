/**
 * Created by Andrew Bell 4/24/18
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2018. See license.txt for details.
 */

package com.recursivechaos.datedemo;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class MyDate {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
