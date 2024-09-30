package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A
{
    public static void main(String[] args)
    {
        List<Emp1> emp1s = Arrays.asList(
                new Emp1(1, "rasmi"),
                new Emp1(2, "devshi"),
                new Emp1(3, "abhi")
        );

        List<Emp1Dto> dtos = emp1s.stream().map(e -> mapToDto(e)).collect(Collectors.toList());

    }
   static Emp1Dto mapToDto(Emp1 employee)
    {
        Emp1Dto dto = new Emp1Dto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
