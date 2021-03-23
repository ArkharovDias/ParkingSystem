package com.springcourse.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingTicketDto {
    private Long id;
    private String ticketNumber;
    private LocalDateTime issuedAt;
    private LocalDateTime payedAt;
    private Integer payedAmount;
    private ParkingTicketStatus parkingTicketStatus;
}
