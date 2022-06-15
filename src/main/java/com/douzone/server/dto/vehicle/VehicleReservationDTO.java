package com.douzone.server.dto.vehicle;

import com.douzone.server.entity.Employee;
import com.douzone.server.entity.Vehicle;
import com.douzone.server.entity.VehicleReservation;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class VehicleReservationDTO {
    private int vehicleId;
    private int empId;
    private String reason;
    private String title;
}